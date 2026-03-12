package io.github.communitysdks.godaddy.errors.auctions;

import java.util.Map;

public class AuctionsUnauthorizedException extends AuctionsApiException {
    public AuctionsUnauthorizedException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl, errorResponse);
    }
}
