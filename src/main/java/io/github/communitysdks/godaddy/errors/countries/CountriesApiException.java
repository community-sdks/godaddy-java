package io.github.communitysdks.godaddy.errors.countries;

import io.github.communitysdks.godaddy.errors.ApiException;
import java.util.Map;

public class CountriesApiException extends ApiException {
    public CountriesApiException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl, errorResponse);
    }
}
