package io.github.communitysdks.godaddy.errors.parking;

import io.github.communitysdks.godaddy.errors.ApiException;
import java.util.Map;

public class ParkingApiException extends ApiException {
    public ParkingApiException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl, errorResponse);
    }
}
