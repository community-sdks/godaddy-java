package io.github.communitysdks.godaddy.errors.aftermarket;

import io.github.communitysdks.godaddy.errors.ApiException;
import java.util.Map;

public class AftermarketApiException extends ApiException {
    public AftermarketApiException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl, errorResponse);
    }
}
