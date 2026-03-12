package io.github.communitysdks.godaddy.errors;

import java.util.Map;

public class NotFoundException extends ApiException {
    public NotFoundException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl);
    }
}
