package io.github.communitysdks.godaddy.errors.aftermarket;

import java.util.Map;

public class AftermarketUnauthorizedException extends AftermarketApiException {
    public AftermarketUnauthorizedException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl, errorResponse);
    }
}
