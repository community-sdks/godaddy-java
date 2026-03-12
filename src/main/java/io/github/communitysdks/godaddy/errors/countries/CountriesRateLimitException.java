package io.github.communitysdks.godaddy.errors.countries;

import java.util.Map;

public class CountriesRateLimitException extends CountriesApiException {
    public CountriesRateLimitException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl, errorResponse);
    }
}
