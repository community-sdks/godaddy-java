package io.github.communitysdks.godaddy.errors.ans;

import java.util.Map;

public class AnsUnprocessableEntityException extends AnsApiException {
    public AnsUnprocessableEntityException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl, errorResponse);
    }
}
