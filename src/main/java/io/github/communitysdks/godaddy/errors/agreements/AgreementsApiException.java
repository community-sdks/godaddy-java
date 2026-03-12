package io.github.communitysdks.godaddy.errors.agreements;

import io.github.communitysdks.godaddy.errors.ApiException;
import java.util.Map;

public class AgreementsApiException extends ApiException {
    public AgreementsApiException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl, errorResponse);
    }
}
