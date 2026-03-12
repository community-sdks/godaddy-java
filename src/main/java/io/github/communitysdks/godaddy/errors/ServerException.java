package io.github.communitysdks.godaddy.errors;

import java.util.Map;

public class ServerException extends ApiException {
    public ServerException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl);
    }
}
