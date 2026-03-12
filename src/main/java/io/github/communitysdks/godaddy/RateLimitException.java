package io.github.communitysdks.godaddy;

import java.util.Map;

public final class RateLimitException extends ApiException {
    public RateLimitException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl);
    }
}
