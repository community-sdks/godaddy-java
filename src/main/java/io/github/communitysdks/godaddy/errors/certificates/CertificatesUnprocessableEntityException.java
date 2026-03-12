package io.github.communitysdks.godaddy.errors.certificates;

import java.util.Map;

public class CertificatesUnprocessableEntityException extends CertificatesApiException {
    public CertificatesUnprocessableEntityException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl, errorResponse);
    }
}
