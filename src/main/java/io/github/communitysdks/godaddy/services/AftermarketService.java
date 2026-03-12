package io.github.communitysdks.godaddy.services;

import io.github.communitysdks.godaddy.ApiClient;
import io.github.communitysdks.godaddy.errors.ApiException;
import io.github.communitysdks.godaddy.dto.aftermarket.requests.GetListingsRequest;
import io.github.communitysdks.godaddy.dto.aftermarket.requests.DeleteListingsRequest;
import io.github.communitysdks.godaddy.dto.aftermarket.requests.AddExpiryListingsRequest;
import io.github.communitysdks.godaddy.dto.aftermarket.responses.GetListingsResponse;
import io.github.communitysdks.godaddy.dto.aftermarket.responses.DeleteListingsResponse;
import io.github.communitysdks.godaddy.dto.aftermarket.responses.AddExpiryListingsResponse;
import io.github.communitysdks.godaddy.errors.aftermarket.AftermarketApiException;
import io.github.communitysdks.godaddy.errors.aftermarket.AftermarketBadRequestException;
import io.github.communitysdks.godaddy.errors.aftermarket.AftermarketConflictException;
import io.github.communitysdks.godaddy.errors.aftermarket.AftermarketForbiddenException;
import io.github.communitysdks.godaddy.errors.aftermarket.AftermarketGatewayTimeoutException;
import io.github.communitysdks.godaddy.errors.aftermarket.AftermarketNotFoundException;
import io.github.communitysdks.godaddy.errors.aftermarket.AftermarketRateLimitException;
import io.github.communitysdks.godaddy.errors.aftermarket.AftermarketServerException;
import io.github.communitysdks.godaddy.errors.aftermarket.AftermarketUnauthorizedException;
import io.github.communitysdks.godaddy.errors.aftermarket.AftermarketUnprocessableEntityException;
import io.github.communitysdks.godaddy.runtime.JsonCodec;

public final class AftermarketService extends AbstractService {
    public AftermarketService(ApiClient client) {
        super(client, "aftermarket");
    }

    public GetListingsResponse getListings(GetListingsRequest request) {
        GetListingsRequest safe = request == null ? new GetListingsRequest() : request;
        Object response = execute(
            "GET",
            "/v1/customers/{customerId}/auctions/listings",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetListingsResponse.fromMixed(response);
    }

    public DeleteListingsResponse deleteListings(DeleteListingsRequest request) {
        DeleteListingsRequest safe = request == null ? new DeleteListingsRequest() : request;
        Object response = execute(
            "DELETE",
            "/v1/aftermarket/listings",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return DeleteListingsResponse.fromMixed(response);
    }

    public AddExpiryListingsResponse addExpiryListings(AddExpiryListingsRequest request) {
        AddExpiryListingsRequest safe = request == null ? new AddExpiryListingsRequest() : request;
        Object response = execute(
            "POST",
            "/v1/aftermarket/listings/expiry",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return AddExpiryListingsResponse.fromMixed(response);
    }

    @Override
    protected ApiException mapException(ApiException exception) {
        Object errorResponse = exception.responseBody == null || exception.responseBody.isBlank() ? null : JsonCodec.parse(exception.responseBody);
        int status = exception.statusCode;
        if (status == 400) return new AftermarketBadRequestException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 401) return new AftermarketUnauthorizedException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 403) return new AftermarketForbiddenException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 404) return new AftermarketNotFoundException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 409) return new AftermarketConflictException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 422) return new AftermarketUnprocessableEntityException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 429) return new AftermarketRateLimitException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 504) return new AftermarketGatewayTimeoutException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status >= 500) return new AftermarketServerException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        return new AftermarketApiException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
    }
}
