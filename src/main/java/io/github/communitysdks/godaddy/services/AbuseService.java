package io.github.communitysdks.godaddy.services;

import io.github.communitysdks.godaddy.ApiClient;
import io.github.communitysdks.godaddy.errors.ApiException;
import io.github.communitysdks.godaddy.dto.abuse.requests.GetTicketsRequest;
import io.github.communitysdks.godaddy.dto.abuse.requests.CreateTicketRequest;
import io.github.communitysdks.godaddy.dto.abuse.requests.GetTicketInfoRequest;
import io.github.communitysdks.godaddy.dto.abuse.requests.GetTicketsV2Request;
import io.github.communitysdks.godaddy.dto.abuse.requests.CreateTicketV2Request;
import io.github.communitysdks.godaddy.dto.abuse.requests.GetTicketInfoV2Request;
import io.github.communitysdks.godaddy.dto.abuse.responses.GetTicketsResponse;
import io.github.communitysdks.godaddy.dto.abuse.responses.CreateTicketResponse;
import io.github.communitysdks.godaddy.dto.abuse.responses.GetTicketInfoResponse;
import io.github.communitysdks.godaddy.dto.abuse.responses.GetTicketsV2Response;
import io.github.communitysdks.godaddy.dto.abuse.responses.CreateTicketV2Response;
import io.github.communitysdks.godaddy.dto.abuse.responses.GetTicketInfoV2Response;
import io.github.communitysdks.godaddy.errors.abuse.AbuseApiException;
import io.github.communitysdks.godaddy.errors.abuse.AbuseBadRequestException;
import io.github.communitysdks.godaddy.errors.abuse.AbuseConflictException;
import io.github.communitysdks.godaddy.errors.abuse.AbuseForbiddenException;
import io.github.communitysdks.godaddy.errors.abuse.AbuseGatewayTimeoutException;
import io.github.communitysdks.godaddy.errors.abuse.AbuseNotFoundException;
import io.github.communitysdks.godaddy.errors.abuse.AbuseRateLimitException;
import io.github.communitysdks.godaddy.errors.abuse.AbuseServerException;
import io.github.communitysdks.godaddy.errors.abuse.AbuseUnauthorizedException;
import io.github.communitysdks.godaddy.errors.abuse.AbuseUnprocessableEntityException;
import io.github.communitysdks.godaddy.runtime.JsonCodec;

public final class AbuseService extends AbstractService {
    public AbuseService(ApiClient client) {
        super(client, "abuse");
    }

    public GetTicketsResponse getTickets(GetTicketsRequest request) {
        GetTicketsRequest safe = request == null ? new GetTicketsRequest() : request;
        Object response = execute(
            "GET",
            "/v1/abuse/tickets",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetTicketsResponse.fromMixed(response);
    }

    public CreateTicketResponse createTicket(CreateTicketRequest request) {
        CreateTicketRequest safe = request == null ? new CreateTicketRequest() : request;
        Object response = execute(
            "POST",
            "/v1/abuse/tickets",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return CreateTicketResponse.fromMixed(response);
    }

    public GetTicketInfoResponse getTicketInfo(GetTicketInfoRequest request) {
        GetTicketInfoRequest safe = request == null ? new GetTicketInfoRequest() : request;
        Object response = execute(
            "GET",
            "/v1/abuse/tickets/{ticketId}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetTicketInfoResponse.fromMixed(response);
    }

    public GetTicketsV2Response getTicketsV2(GetTicketsV2Request request) {
        GetTicketsV2Request safe = request == null ? new GetTicketsV2Request() : request;
        Object response = execute(
            "GET",
            "/v2/abuse/tickets",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetTicketsV2Response.fromMixed(response);
    }

    public CreateTicketV2Response createTicketV2(CreateTicketV2Request request) {
        CreateTicketV2Request safe = request == null ? new CreateTicketV2Request() : request;
        Object response = execute(
            "POST",
            "/v2/abuse/tickets",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return CreateTicketV2Response.fromMixed(response);
    }

    public GetTicketInfoV2Response getTicketInfoV2(GetTicketInfoV2Request request) {
        GetTicketInfoV2Request safe = request == null ? new GetTicketInfoV2Request() : request;
        Object response = execute(
            "GET",
            "/v2/abuse/tickets/{ticketId}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetTicketInfoV2Response.fromMixed(response);
    }

    @Override
    protected ApiException mapException(ApiException exception) {
        Object errorResponse = exception.responseBody == null || exception.responseBody.isBlank() ? null : JsonCodec.parse(exception.responseBody);
        int status = exception.statusCode;
        if (status == 400) return new AbuseBadRequestException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 401) return new AbuseUnauthorizedException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 403) return new AbuseForbiddenException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 404) return new AbuseNotFoundException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 409) return new AbuseConflictException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 422) return new AbuseUnprocessableEntityException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 429) return new AbuseRateLimitException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 504) return new AbuseGatewayTimeoutException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status >= 500) return new AbuseServerException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        return new AbuseApiException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
    }
}
