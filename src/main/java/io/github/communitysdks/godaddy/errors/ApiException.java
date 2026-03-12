package io.github.communitysdks.godaddy.errors;

import java.util.Map;

public class ApiException extends RuntimeException {
    public final int statusCode;
    public final String responseBody;
    public final Map<String, String> headers;
    public final String requestMethod;
    public final String requestUrl;
    public final Object errorResponse;

    public ApiException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl) {
        this(message, statusCode, responseBody, headers, requestMethod, requestUrl, null);
    }

    public ApiException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message);
        this.statusCode = statusCode;
        this.responseBody = responseBody;
        this.headers = headers;
        this.requestMethod = requestMethod;
        this.requestUrl = requestUrl;
        this.errorResponse = errorResponse;
    }
}
