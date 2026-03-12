package io.github.communitysdks.godaddy.errors.ans;

import java.util.Map;

public class AnsUnauthorizedException extends AnsApiException {
    public AnsUnauthorizedException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl, errorResponse);
    }
}
