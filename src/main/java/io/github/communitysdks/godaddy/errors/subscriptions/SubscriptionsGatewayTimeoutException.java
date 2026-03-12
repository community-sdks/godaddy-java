package io.github.communitysdks.godaddy.errors.subscriptions;

import java.util.Map;

public class SubscriptionsGatewayTimeoutException extends SubscriptionsApiException {
    public SubscriptionsGatewayTimeoutException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl, errorResponse);
    }
}
