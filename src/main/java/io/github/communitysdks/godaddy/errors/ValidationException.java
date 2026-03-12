package io.github.communitysdks.godaddy.errors;

import java.util.Map;

public class ValidationException extends ApiException {
    public ValidationException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl);
    }
}
