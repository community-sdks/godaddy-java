package io.github.communitysdks.godaddy.errors.abuse;

import java.util.Map;

public class AbuseBadRequestException extends AbuseApiException {
    public AbuseBadRequestException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl, errorResponse);
    }
}
