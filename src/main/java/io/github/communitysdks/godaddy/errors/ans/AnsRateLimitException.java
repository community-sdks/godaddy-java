package io.github.communitysdks.godaddy.errors.ans;

import java.util.Map;

public class AnsRateLimitException extends AnsApiException {
    public AnsRateLimitException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl, errorResponse);
    }
}
