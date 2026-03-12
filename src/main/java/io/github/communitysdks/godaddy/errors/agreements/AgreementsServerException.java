package io.github.communitysdks.godaddy.errors.agreements;

import java.util.Map;

public class AgreementsServerException extends AgreementsApiException {
    public AgreementsServerException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl, errorResponse);
    }
}
