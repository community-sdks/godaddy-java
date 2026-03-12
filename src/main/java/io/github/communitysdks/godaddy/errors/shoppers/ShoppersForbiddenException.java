package io.github.communitysdks.godaddy.errors.shoppers;

import java.util.Map;

public class ShoppersForbiddenException extends ShoppersApiException {
    public ShoppersForbiddenException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl, errorResponse);
    }
}
