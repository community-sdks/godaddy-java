package io.github.communitysdks.godaddy.errors.countries;

import java.util.Map;

public class CountriesForbiddenException extends CountriesApiException {
    public CountriesForbiddenException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl, errorResponse);
    }
}
