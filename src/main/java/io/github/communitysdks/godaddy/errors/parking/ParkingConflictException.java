package io.github.communitysdks.godaddy.errors.parking;

import java.util.Map;

public class ParkingConflictException extends ParkingApiException {
    public ParkingConflictException(String message, int statusCode, String responseBody, Map<String, String> headers, String requestMethod, String requestUrl, Object errorResponse) {
        super(message, statusCode, responseBody, headers, requestMethod, requestUrl, errorResponse);
    }
}
