package io.github.communitysdks.godaddy.errors.orders;

import java.util.Map;

public class OrdersUnprocessableEntityException extends OrdersApiException {
    public OrdersUnprocessableEntityException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl, errorResponse);
    }
}
