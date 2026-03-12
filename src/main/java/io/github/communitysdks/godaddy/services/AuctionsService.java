package io.github.communitysdks.godaddy.services;

import io.github.communitysdks.godaddy.ApiClient;
import io.github.communitysdks.godaddy.errors.ApiException;
import io.github.communitysdks.godaddy.dto.auctions.requests.PlaceBidsRequest;
import io.github.communitysdks.godaddy.dto.auctions.responses.PlaceBidsResponse;
import io.github.communitysdks.godaddy.errors.auctions.AuctionsApiException;
import io.github.communitysdks.godaddy.errors.auctions.AuctionsBadRequestException;
import io.github.communitysdks.godaddy.errors.auctions.AuctionsConflictException;
import io.github.communitysdks.godaddy.errors.auctions.AuctionsForbiddenException;
import io.github.communitysdks.godaddy.errors.auctions.AuctionsGatewayTimeoutException;
import io.github.communitysdks.godaddy.errors.auctions.AuctionsNotFoundException;
import io.github.communitysdks.godaddy.errors.auctions.AuctionsRateLimitException;
import io.github.communitysdks.godaddy.errors.auctions.AuctionsServerException;
import io.github.communitysdks.godaddy.errors.auctions.AuctionsUnauthorizedException;
import io.github.communitysdks.godaddy.errors.auctions.AuctionsUnprocessableEntityException;
import io.github.communitysdks.godaddy.runtime.JsonCodec;

public final class AuctionsService extends AbstractService {
    public AuctionsService(ApiClient client) {
        super(client, "auctions");
    }

    public PlaceBidsResponse placeBids(PlaceBidsRequest request) {
        PlaceBidsRequest safe = request == null ? new PlaceBidsRequest() : request;
        Object response = execute(
            "POST",
            "/v1/customers/{customerId}/aftermarket/listings/bids",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return PlaceBidsResponse.fromMixed(response);
    }

    @Override
    protected ApiException mapException(ApiException exception) {
        Object errorResponse = exception.responseBody == null || exception.responseBody.isBlank() ? null : JsonCodec.parse(exception.responseBody);
        int status = exception.statusCode;
        if (status == 400) return new AuctionsBadRequestException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 401) return new AuctionsUnauthorizedException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 403) return new AuctionsForbiddenException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 404) return new AuctionsNotFoundException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 409) return new AuctionsConflictException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 422) return new AuctionsUnprocessableEntityException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 429) return new AuctionsRateLimitException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 504) return new AuctionsGatewayTimeoutException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status >= 500) return new AuctionsServerException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        return new AuctionsApiException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
    }
}
