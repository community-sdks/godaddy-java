package io.github.communitysdks.godaddy.errors.certificates;

import java.util.Map;

public class CertificatesBadRequestException extends CertificatesApiException {
    public CertificatesBadRequestException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl, errorResponse);
    }
}
