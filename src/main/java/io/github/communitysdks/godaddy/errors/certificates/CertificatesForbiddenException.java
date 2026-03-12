package io.github.communitysdks.godaddy.errors.certificates;

import java.util.Map;

public class CertificatesForbiddenException extends CertificatesApiException {
    public CertificatesForbiddenException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl, errorResponse);
    }
}
