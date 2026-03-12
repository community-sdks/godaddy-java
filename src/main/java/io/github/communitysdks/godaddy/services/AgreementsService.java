package io.github.communitysdks.godaddy.services;

import io.github.communitysdks.godaddy.ApiClient;
import io.github.communitysdks.godaddy.errors.ApiException;
import io.github.communitysdks.godaddy.dto.agreements.requests.GetRequest;
import io.github.communitysdks.godaddy.dto.agreements.responses.GetResponse;
import io.github.communitysdks.godaddy.errors.agreements.AgreementsApiException;
import io.github.communitysdks.godaddy.errors.agreements.AgreementsBadRequestException;
import io.github.communitysdks.godaddy.errors.agreements.AgreementsConflictException;
import io.github.communitysdks.godaddy.errors.agreements.AgreementsForbiddenException;
import io.github.communitysdks.godaddy.errors.agreements.AgreementsGatewayTimeoutException;
import io.github.communitysdks.godaddy.errors.agreements.AgreementsNotFoundException;
import io.github.communitysdks.godaddy.errors.agreements.AgreementsRateLimitException;
import io.github.communitysdks.godaddy.errors.agreements.AgreementsServerException;
import io.github.communitysdks.godaddy.errors.agreements.AgreementsUnauthorizedException;
import io.github.communitysdks.godaddy.errors.agreements.AgreementsUnprocessableEntityException;
import io.github.communitysdks.godaddy.runtime.JsonCodec;

public final class AgreementsService extends AbstractService {
    public AgreementsService(ApiClient client) {
        super(client, "agreements");
    }

    public GetResponse get(GetRequest request) {
        GetRequest safe = request == null ? new GetRequest() : request;
        Object response = execute(
            "GET",
            "/v1/agreements",
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
        if (status == 400) return new AgreementsBadRequestException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 401) return new AgreementsUnauthorizedException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 403) return new AgreementsForbiddenException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 404) return new AgreementsNotFoundException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 409) return new AgreementsConflictException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 422) return new AgreementsUnprocessableEntityException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 429) return new AgreementsRateLimitException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 504) return new AgreementsGatewayTimeoutException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status >= 500) return new AgreementsServerException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        return new AgreementsApiException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
    }
}
