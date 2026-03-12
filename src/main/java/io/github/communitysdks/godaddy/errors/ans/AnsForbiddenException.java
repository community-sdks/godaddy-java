package io.github.communitysdks.godaddy.errors.ans;

import java.util.Map;

public class AnsForbiddenException extends AnsApiException {
    public AnsForbiddenException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl, errorResponse);
    }
}
