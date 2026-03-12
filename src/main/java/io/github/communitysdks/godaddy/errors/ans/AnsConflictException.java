package io.github.communitysdks.godaddy.errors.ans;

import java.util.Map;

public class AnsConflictException extends AnsApiException {
    public AnsConflictException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl, errorResponse);
    }
}
