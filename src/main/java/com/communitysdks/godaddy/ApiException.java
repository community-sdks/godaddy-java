package com.communitysdks.godaddy;

import java.util.Map;

public class ApiException extends RuntimeException {
    public final int statusCode;
    public final String responseBody;
    public final Map<String, String> headers;
    public final String requestMethod;
    public final String requestUrl;

    public ApiException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl) {
        super(message);
        this.statusCode = statusCode;
        this.responseBody = responseBody;
        this.headers = headers;
        this.requestMethod = requestMethod;
        this.requestUrl = requestUrl;
    }

    public String requestId() {
        return headers.getOrDefault("x-request-id", headers.getOrDefault("X-Request-Id", ""));
    }
}
