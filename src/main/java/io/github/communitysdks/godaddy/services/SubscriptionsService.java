package io.github.communitysdks.godaddy.services;

import io.github.communitysdks.godaddy.ApiClient;
import io.github.communitysdks.godaddy.errors.ApiException;
import io.github.communitysdks.godaddy.dto.subscriptions.requests.ListRequest;
import io.github.communitysdks.godaddy.dto.subscriptions.requests.ProductGroupsRequest;
import io.github.communitysdks.godaddy.dto.subscriptions.requests.GetRequest;
import io.github.communitysdks.godaddy.dto.subscriptions.requests.UpdateRequest;
import io.github.communitysdks.godaddy.dto.subscriptions.requests.CancelRequest;
import io.github.communitysdks.godaddy.dto.subscriptions.responses.ListResponse;
import io.github.communitysdks.godaddy.dto.subscriptions.responses.ProductGroupsResponse;
import io.github.communitysdks.godaddy.dto.subscriptions.responses.GetResponse;
import io.github.communitysdks.godaddy.dto.subscriptions.responses.UpdateResponse;
import io.github.communitysdks.godaddy.dto.subscriptions.responses.CancelResponse;
import io.github.communitysdks.godaddy.errors.subscriptions.SubscriptionsApiException;
import io.github.communitysdks.godaddy.errors.subscriptions.SubscriptionsBadRequestException;
import io.github.communitysdks.godaddy.errors.subscriptions.SubscriptionsConflictException;
import io.github.communitysdks.godaddy.errors.subscriptions.SubscriptionsForbiddenException;
import io.github.communitysdks.godaddy.errors.subscriptions.SubscriptionsGatewayTimeoutException;
import io.github.communitysdks.godaddy.errors.subscriptions.SubscriptionsNotFoundException;
import io.github.communitysdks.godaddy.errors.subscriptions.SubscriptionsRateLimitException;
import io.github.communitysdks.godaddy.errors.subscriptions.SubscriptionsServerException;
import io.github.communitysdks.godaddy.errors.subscriptions.SubscriptionsUnauthorizedException;
import io.github.communitysdks.godaddy.errors.subscriptions.SubscriptionsUnprocessableEntityException;
import io.github.communitysdks.godaddy.runtime.JsonCodec;

public final class SubscriptionsService extends AbstractService {
    public SubscriptionsService(ApiClient client) {
        super(client, "subscriptions");
    }

    public ListResponse list(ListRequest request) {
        ListRequest safe = request == null ? new ListRequest() : request;
        Object response = execute(
            "GET",
            "/v1/subscriptions",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return ListResponse.fromMixed(response);
    }

    public ProductGroupsResponse productGroups(ProductGroupsRequest request) {
        ProductGroupsRequest safe = request == null ? new ProductGroupsRequest() : request;
        Object response = execute(
            "GET",
            "/v1/subscriptions/productGroups",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return ProductGroupsResponse.fromMixed(response);
    }

    public GetResponse get(GetRequest request) {
        GetRequest safe = request == null ? new GetRequest() : request;
        Object response = execute(
            "GET",
            "/v1/subscriptions/{subscriptionId}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetResponse.fromMixed(response);
    }

    public UpdateResponse update(UpdateRequest request) {
        UpdateRequest safe = request == null ? new UpdateRequest() : request;
        Object response = execute(
            "PATCH",
            "/v1/subscriptions/{subscriptionId}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return UpdateResponse.fromMixed(response);
    }

    public CancelResponse cancel(CancelRequest request) {
        CancelRequest safe = request == null ? new CancelRequest() : request;
        Object response = execute(
            "DELETE",
            "/v1/subscriptions/{subscriptionId}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return CancelResponse.fromMixed(response);
    }

    @Override
    protected ApiException mapException(ApiException exception) {
        Object errorResponse = exception.responseBody == null || exception.responseBody.isBlank() ? null : JsonCodec.parse(exception.responseBody);
        int status = exception.statusCode;
        if (status == 400) return new SubscriptionsBadRequestException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 401) return new SubscriptionsUnauthorizedException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 403) return new SubscriptionsForbiddenException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 404) return new SubscriptionsNotFoundException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 409) return new SubscriptionsConflictException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 422) return new SubscriptionsUnprocessableEntityException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 429) return new SubscriptionsRateLimitException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 504) return new SubscriptionsGatewayTimeoutException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status >= 500) return new SubscriptionsServerException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        return new SubscriptionsApiException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
    }
}
