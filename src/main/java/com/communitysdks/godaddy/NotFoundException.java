package com.communitysdks.godaddy;

import java.util.Map;

public final class NotFoundException extends ApiException {
    public NotFoundException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl);
    }
}
