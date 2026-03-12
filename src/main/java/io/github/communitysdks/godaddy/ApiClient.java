package io.github.communitysdks.godaddy;

import io.github.communitysdks.godaddy.errors.ApiException;
import io.github.communitysdks.godaddy.errors.NotFoundException;
import io.github.communitysdks.godaddy.errors.RateLimitException;
import io.github.communitysdks.godaddy.errors.ServerException;
import io.github.communitysdks.godaddy.errors.UnauthorizedException;
import io.github.communitysdks.godaddy.errors.ValidationException;
import io.github.communitysdks.godaddy.runtime.HttpTransport;
import io.github.communitysdks.godaddy.runtime.JsonCodec;
import io.github.communitysdks.godaddy.runtime.Param;
import io.github.communitysdks.godaddy.runtime.QueryPair;
import io.github.communitysdks.godaddy.runtime.Request;
import io.github.communitysdks.godaddy.runtime.Response;
import io.github.communitysdks.godaddy.runtime.Transport;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ApiClient {
    private final Config config;
    private final Transport transport;

    public ApiClient(Config config, Transport transport) {
        this.config = config == null ? new Config() : config;
        this.transport = transport == null ? new HttpTransport() : transport;
    }

    public static List<QueryPair> buildQueryPairs(List<Param> values) {
        List<QueryPair> pairs = new ArrayList<>();
        for (Param pair : values) {
            if (pair.value() == null) continue;
            if (pair.value() instanceof Iterable<?> iterable && !(pair.value() instanceof String)) {
                for (Object item : iterable) if (item != null) pairs.add(new QueryPair(pair.key(), stringify(item)));
                continue;
            }
            pairs.add(new QueryPair(pair.key(), stringify(pair.value())));
        }
        return pairs;
    }

    public Object request(String method, String serviceName, String path, List<Param> pathParams, List<Param> queryParams, List<Param> headers, Object body) {
        String baseUrl = config.serviceBaseUrls.getOrDefault(serviceName, config.baseUrl == null || config.baseUrl.isBlank() ? Config.SANDBOX_BASE_URL : config.baseUrl);
        String resolvedPath = path;
        for (Param param : pathParams) if (param.value() != null) resolvedPath = resolvedPath.replace("{" + param.key() + "}", stringify(param.value()));

        Map<String, String> resolvedHeaders = new LinkedHashMap<>();
        resolvedHeaders.put("Accept", "application/json");
        resolvedHeaders.put("User-Agent", config.userAgent);
        resolvedHeaders.putAll(config.defaultHeaders);
        for (Param header : headers) if (header.value() != null) resolvedHeaders.put(header.key(), stringify(header.value()));
        if (config.apiKey != null && config.apiSecret != null && !config.apiKey.isBlank() && !config.apiSecret.isBlank()) resolvedHeaders.put("Authorization", "sso-key " + config.apiKey + ":" + config.apiSecret);
        if (body != null && !resolvedHeaders.containsKey("Content-Type")) resolvedHeaders.put("Content-Type", "application/json");

        Request request = new Request(method, baseUrl.replaceAll("/+$", "") + resolvedPath, resolvedHeaders, buildQueryPairs(queryParams), body);
        int attempt = 0;
        while (true) {
            Response response = transport.send(request);
            boolean retryable = response.statusCode() == 408 || response.statusCode() == 429 || response.statusCode() == 500 || response.statusCode() == 502 || response.statusCode() == 503 || response.statusCode() == 504;
            if (!(retryable && attempt < config.maxRetries)) {
                if (response.statusCode() < 200 || response.statusCode() >= 300) {
                    String message = "GoDaddy API request failed with status " + response.statusCode();
                    if (response.statusCode() == 400) throw new ValidationException(message, response.statusCode(), response.body(), response.headers(), request.method, request.fullUrl());
                    if (response.statusCode() == 401 || response.statusCode() == 403) throw new UnauthorizedException(message, response.statusCode(), response.body(), response.headers(), request.method, request.fullUrl());
                    if (response.statusCode() == 404) throw new NotFoundException(message, response.statusCode(), response.body(), response.headers(), request.method, request.fullUrl());
                    if (response.statusCode() == 429) throw new RateLimitException(message, response.statusCode(), response.body(), response.headers(), request.method, request.fullUrl());
                    if (response.statusCode() >= 500) throw new ServerException(message, response.statusCode(), response.body(), response.headers(), request.method, request.fullUrl());
                    throw new ApiException(message, response.statusCode(), response.body(), response.headers(), request.method, request.fullUrl());
                }
                return decode(response.body());
            }
            try { Thread.sleep(config.retryDelay.multipliedBy(1L << attempt).toMillis()); } catch (InterruptedException ignored) { Thread.currentThread().interrupt(); }
            attempt++;
        }
    }

    private static Object decode(String body) {
        if (body == null || body.isBlank()) return null;
        return JsonCodec.parse(body);
    }

    private static String stringify(Object value) {
        if (value == null) return "";
        if (value instanceof Boolean b) return b ? "true" : "false";
        if (value instanceof Map<?, ?> || value instanceof Iterable<?>) return JsonCodec.stringify(value);
        return String.valueOf(value);
    }
}
