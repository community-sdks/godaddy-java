package io.github.communitysdks.godaddy.services;

import io.github.communitysdks.godaddy.ApiClient;
import io.github.communitysdks.godaddy.errors.ApiException;
import io.github.communitysdks.godaddy.dto.shoppers.requests.CreateSubaccountRequest;
import io.github.communitysdks.godaddy.dto.shoppers.requests.GetRequest;
import io.github.communitysdks.godaddy.dto.shoppers.requests.UpdateRequest;
import io.github.communitysdks.godaddy.dto.shoppers.requests.DeleteRequest;
import io.github.communitysdks.godaddy.dto.shoppers.requests.GetStatusRequest;
import io.github.communitysdks.godaddy.dto.shoppers.requests.ChangePasswordRequest;
import io.github.communitysdks.godaddy.dto.shoppers.responses.CreateSubaccountResponse;
import io.github.communitysdks.godaddy.dto.shoppers.responses.GetResponse;
import io.github.communitysdks.godaddy.dto.shoppers.responses.UpdateResponse;
import io.github.communitysdks.godaddy.dto.shoppers.responses.DeleteResponse;
import io.github.communitysdks.godaddy.dto.shoppers.responses.GetStatusResponse;
import io.github.communitysdks.godaddy.dto.shoppers.responses.ChangePasswordResponse;
import io.github.communitysdks.godaddy.errors.shoppers.ShoppersApiException;
import io.github.communitysdks.godaddy.errors.shoppers.ShoppersBadRequestException;
import io.github.communitysdks.godaddy.errors.shoppers.ShoppersConflictException;
import io.github.communitysdks.godaddy.errors.shoppers.ShoppersForbiddenException;
import io.github.communitysdks.godaddy.errors.shoppers.ShoppersGatewayTimeoutException;
import io.github.communitysdks.godaddy.errors.shoppers.ShoppersNotFoundException;
import io.github.communitysdks.godaddy.errors.shoppers.ShoppersRateLimitException;
import io.github.communitysdks.godaddy.errors.shoppers.ShoppersServerException;
import io.github.communitysdks.godaddy.errors.shoppers.ShoppersUnauthorizedException;
import io.github.communitysdks.godaddy.errors.shoppers.ShoppersUnprocessableEntityException;
import io.github.communitysdks.godaddy.runtime.JsonCodec;

public final class ShoppersService extends AbstractService {
    public ShoppersService(ApiClient client) {
        super(client, "shoppers");
    }

    public CreateSubaccountResponse createSubaccount(CreateSubaccountRequest request) {
        CreateSubaccountRequest safe = request == null ? new CreateSubaccountRequest() : request;
        Object response = execute(
            "POST",
            "/v1/shoppers/subaccount",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return CreateSubaccountResponse.fromMixed(response);
    }

    public GetResponse get(GetRequest request) {
        GetRequest safe = request == null ? new GetRequest() : request;
        Object response = execute(
            "GET",
            "/v1/shoppers/{shopperId}",
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
            "POST",
            "/v1/shoppers/{shopperId}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return UpdateResponse.fromMixed(response);
    }

    public DeleteResponse delete(DeleteRequest request) {
        DeleteRequest safe = request == null ? new DeleteRequest() : request;
        Object response = execute(
            "DELETE",
            "/v1/shoppers/{shopperId}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return DeleteResponse.fromMixed(response);
    }

    public GetStatusResponse getStatus(GetStatusRequest request) {
        GetStatusRequest safe = request == null ? new GetStatusRequest() : request;
        Object response = execute(
            "GET",
            "/v1/shoppers/{shopperId}/status",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetStatusResponse.fromMixed(response);
    }

    public ChangePasswordResponse changePassword(ChangePasswordRequest request) {
        ChangePasswordRequest safe = request == null ? new ChangePasswordRequest() : request;
        Object response = execute(
            "PUT",
            "/v1/shoppers/{shopperId}/factors/password",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return ChangePasswordResponse.fromMixed(response);
    }

    @Override
    protected ApiException mapException(ApiException exception) {
        Object errorResponse = exception.responseBody == null || exception.responseBody.isBlank() ? null : JsonCodec.parse(exception.responseBody);
        int status = exception.statusCode;
        if (status == 400) return new ShoppersBadRequestException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 401) return new ShoppersUnauthorizedException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 403) return new ShoppersForbiddenException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 404) return new ShoppersNotFoundException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 409) return new ShoppersConflictException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 422) return new ShoppersUnprocessableEntityException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 429) return new ShoppersRateLimitException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 504) return new ShoppersGatewayTimeoutException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status >= 500) return new ShoppersServerException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        return new ShoppersApiException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
    }
}
