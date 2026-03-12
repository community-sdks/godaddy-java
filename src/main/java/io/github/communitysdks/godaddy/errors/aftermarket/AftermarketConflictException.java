package io.github.communitysdks.godaddy.errors.aftermarket;

import java.util.Map;

public class AftermarketConflictException extends AftermarketApiException {
    public AftermarketConflictException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl, errorResponse);
    }
}
