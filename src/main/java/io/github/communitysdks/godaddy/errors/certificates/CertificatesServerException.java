package io.github.communitysdks.godaddy.errors.certificates;

import java.util.Map;

public class CertificatesServerException extends CertificatesApiException {
    public CertificatesServerException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl, errorResponse);
    }
}
