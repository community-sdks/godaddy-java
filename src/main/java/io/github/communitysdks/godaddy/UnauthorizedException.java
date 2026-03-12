package io.github.communitysdks.godaddy;

import java.util.Map;

public final class UnauthorizedException extends ApiException {
    public UnauthorizedException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl);
    }
}
