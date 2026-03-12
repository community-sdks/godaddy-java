package io.github.communitysdks.godaddy.services;

import io.github.communitysdks.godaddy.ApiClient;
import io.github.communitysdks.godaddy.errors.ApiException;
import io.github.communitysdks.godaddy.dto.orders.requests.ListRequest;
import io.github.communitysdks.godaddy.dto.orders.requests.GetRequest;
import io.github.communitysdks.godaddy.dto.orders.responses.ListResponse;
import io.github.communitysdks.godaddy.dto.orders.responses.GetResponse;
import io.github.communitysdks.godaddy.errors.orders.OrdersApiException;
import io.github.communitysdks.godaddy.errors.orders.OrdersBadRequestException;
import io.github.communitysdks.godaddy.errors.orders.OrdersConflictException;
import io.github.communitysdks.godaddy.errors.orders.OrdersForbiddenException;
import io.github.communitysdks.godaddy.errors.orders.OrdersGatewayTimeoutException;
import io.github.communitysdks.godaddy.errors.orders.OrdersNotFoundException;
import io.github.communitysdks.godaddy.errors.orders.OrdersRateLimitException;
import io.github.communitysdks.godaddy.errors.orders.OrdersServerException;
import io.github.communitysdks.godaddy.errors.orders.OrdersUnauthorizedException;
import io.github.communitysdks.godaddy.errors.orders.OrdersUnprocessableEntityException;
import io.github.communitysdks.godaddy.runtime.JsonCodec;

public final class OrdersService extends AbstractService {
    public OrdersService(ApiClient client) {
        super(client, "orders");
    }

    public ListResponse list(ListRequest request) {
        ListRequest safe = request == null ? new ListRequest() : request;
        Object response = execute(
            "GET",
            "/v1/orders",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return ListResponse.fromMixed(response);
    }

    public GetResponse get(GetRequest request) {
        GetRequest safe = request == null ? new GetRequest() : request;
        Object response = execute(
            "GET",
            "/v1/orders/{orderId}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetResponse.fromMixed(response);
    }

    @Override
    protected ApiException mapException(ApiException exception) {
        Object errorResponse = exception.responseBody == null || exception.responseBody.isBlank() ? null : JsonCodec.parse(exception.responseBody);
        int status = exception.statusCode;
        if (status == 400) return new OrdersBadRequestException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 401) return new OrdersUnauthorizedException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 403) return new OrdersForbiddenException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 404) return new OrdersNotFoundException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 409) return new OrdersConflictException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 422) return new OrdersUnprocessableEntityException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 429) return new OrdersRateLimitException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 504) return new OrdersGatewayTimeoutException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status >= 500) return new OrdersServerException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        return new OrdersApiException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
    }
}
