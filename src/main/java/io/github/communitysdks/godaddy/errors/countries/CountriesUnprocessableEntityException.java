package io.github.communitysdks.godaddy.errors.countries;

import java.util.Map;

public class CountriesUnprocessableEntityException extends CountriesApiException {
    public CountriesUnprocessableEntityException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl, errorResponse);
    }
}
