package io.github.communitysdks.godaddy.services;

import io.github.communitysdks.godaddy.ApiClient;
import io.github.communitysdks.godaddy.errors.ApiException;
import io.github.communitysdks.godaddy.dto.parking.requests.GetMetricsRequest;
import io.github.communitysdks.godaddy.dto.parking.requests.GetMetricsByDomainRequest;
import io.github.communitysdks.godaddy.dto.parking.responses.GetMetricsResponse;
import io.github.communitysdks.godaddy.dto.parking.responses.GetMetricsByDomainResponse;
import io.github.communitysdks.godaddy.errors.parking.ParkingApiException;
import io.github.communitysdks.godaddy.errors.parking.ParkingBadRequestException;
import io.github.communitysdks.godaddy.errors.parking.ParkingConflictException;
import io.github.communitysdks.godaddy.errors.parking.ParkingForbiddenException;
import io.github.communitysdks.godaddy.errors.parking.ParkingGatewayTimeoutException;
import io.github.communitysdks.godaddy.errors.parking.ParkingNotFoundException;
import io.github.communitysdks.godaddy.errors.parking.ParkingRateLimitException;
import io.github.communitysdks.godaddy.errors.parking.ParkingServerException;
import io.github.communitysdks.godaddy.errors.parking.ParkingUnauthorizedException;
import io.github.communitysdks.godaddy.errors.parking.ParkingUnprocessableEntityException;
import io.github.communitysdks.godaddy.runtime.JsonCodec;

public final class ParkingService extends AbstractService {
    public ParkingService(ApiClient client) {
        super(client, "parking");
    }

    public GetMetricsResponse getMetrics(GetMetricsRequest request) {
        GetMetricsRequest safe = request == null ? new GetMetricsRequest() : request;
        Object response = execute(
            "GET",
            "/v1/customers/{customerId}/parking/metrics",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetMetricsResponse.fromMixed(response);
    }

    public GetMetricsByDomainResponse getMetricsByDomain(GetMetricsByDomainRequest request) {
        GetMetricsByDomainRequest safe = request == null ? new GetMetricsByDomainRequest() : request;
        Object response = execute(
            "GET",
            "/v1/customers/{customerId}/parking/metricsByDomain",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetMetricsByDomainResponse.fromMixed(response);
    }

    @Override
    protected ApiException mapException(ApiException exception) {
        Object errorResponse = exception.responseBody == null || exception.responseBody.isBlank() ? null : JsonCodec.parse(exception.responseBody);
        int status = exception.statusCode;
        if (status == 400) return new ParkingBadRequestException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 401) return new ParkingUnauthorizedException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 403) return new ParkingForbiddenException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 404) return new ParkingNotFoundException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 409) return new ParkingConflictException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 422) return new ParkingUnprocessableEntityException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 429) return new ParkingRateLimitException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 504) return new ParkingGatewayTimeoutException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status >= 500) return new ParkingServerException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        return new ParkingApiException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
    }
}
