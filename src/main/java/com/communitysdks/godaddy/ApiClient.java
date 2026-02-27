package com.communitysdks.godaddy;

import com.communitysdks.godaddy.runtime.HttpTransport;
import com.communitysdks.godaddy.runtime.Param;
import com.communitysdks.godaddy.runtime.QueryPair;
import com.communitysdks.godaddy.runtime.Request;
import com.communitysdks.godaddy.runtime.Response;
import com.communitysdks.godaddy.runtime.Transport;
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

    public Result request(String method, String serviceBaseUrl, String path, List<Param> pathParams, List<Param> queryParams, List<Param> headers, Object body) {
        String baseUrl = config.baseUrl == null || config.baseUrl.isBlank() ? serviceBaseUrl : config.baseUrl;
        String resolvedPath = path;
        for (Param param : pathParams) if (param.value() != null) resolvedPath = resolvedPath.replace("{" + param.key() + "}", stringify(param.value()));

        Map<String, String> resolvedHeaders = new LinkedHashMap<>();
        resolvedHeaders.put("Accept", "application/json");
        resolvedHeaders.put("User-Agent", config.userAgent);
        resolvedHeaders.putAll(config.defaultHeaders);
        for (Param header : headers) if (header.value() != null) resolvedHeaders.put(header.key(), stringify(header.value()));
        if (!config.apiKey.isBlank() && !config.apiSecret.isBlank()) resolvedHeaders.put("Authorization", "sso-key " + config.apiKey + ":" + config.apiSecret);
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
                return new Result(response.body());
            }
            try { Thread.sleep(config.retryDelay.multipliedBy(1L << attempt)); } catch (InterruptedException ignored) { Thread.currentThread().interrupt(); }
            attempt++;
        }
    }

    private static String stringify(Object value) {
        if (value == null) return "";
        if (value instanceof Boolean b) return b ? "true" : "false";
        return String.valueOf(value);
    }
}
