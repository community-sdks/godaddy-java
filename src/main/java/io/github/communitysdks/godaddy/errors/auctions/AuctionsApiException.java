package io.github.communitysdks.godaddy.errors.auctions;

import io.github.communitysdks.godaddy.errors.ApiException;
import java.util.Map;

public class AuctionsApiException extends ApiException {
    public AuctionsApiException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl, errorResponse);
    }
}
