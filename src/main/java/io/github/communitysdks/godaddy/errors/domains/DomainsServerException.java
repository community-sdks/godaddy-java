package io.github.communitysdks.godaddy.errors.domains;

import java.util.Map;

public class DomainsServerException extends DomainsApiException {
    public DomainsServerException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl, errorResponse);
    }
}
