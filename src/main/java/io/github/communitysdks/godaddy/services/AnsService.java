package io.github.communitysdks.godaddy.services;

import io.github.communitysdks.godaddy.ApiClient;
import io.github.communitysdks.godaddy.errors.ApiException;
import io.github.communitysdks.godaddy.dto.ans.requests.SearchAnsnameRequest;
import io.github.communitysdks.godaddy.dto.ans.requests.RegisterAgentRequest;
import io.github.communitysdks.godaddy.dto.ans.requests.ResolveAnsnameRequest;
import io.github.communitysdks.godaddy.dto.ans.requests.GetAgentRequest;
import io.github.communitysdks.godaddy.dto.ans.requests.RevokeAgentRequest;
import io.github.communitysdks.godaddy.dto.ans.requests.ValidateRegistrationRequest;
import io.github.communitysdks.godaddy.dto.ans.requests.VerifyDnsRecordsRequest;
import io.github.communitysdks.godaddy.dto.ans.requests.GetAgentIdentityCertificateByAgentIdRequest;
import io.github.communitysdks.godaddy.dto.ans.requests.SubmitAgentIdentityCsrByAgentIdRequest;
import io.github.communitysdks.godaddy.dto.ans.requests.GetAgentServerCertificateByAgentIdRequest;
import io.github.communitysdks.godaddy.dto.ans.requests.SubmitAgentServerCsrByAgentIdRequest;
import io.github.communitysdks.godaddy.dto.ans.requests.GetAgentCsrStatusByAgentIdRequest;
import io.github.communitysdks.godaddy.dto.ans.requests.GetAgentEventsRequest;
import io.github.communitysdks.godaddy.dto.ans.responses.SearchAnsnameResponse;
import io.github.communitysdks.godaddy.dto.ans.responses.RegisterAgentResponse;
import io.github.communitysdks.godaddy.dto.ans.responses.ResolveAnsnameResponse;
import io.github.communitysdks.godaddy.dto.ans.responses.GetAgentResponse;
import io.github.communitysdks.godaddy.dto.ans.responses.RevokeAgentResponse;
import io.github.communitysdks.godaddy.dto.ans.responses.ValidateRegistrationResponse;
import io.github.communitysdks.godaddy.dto.ans.responses.VerifyDnsRecordsResponse;
import io.github.communitysdks.godaddy.dto.ans.responses.GetAgentIdentityCertificateByAgentIdResponse;
import io.github.communitysdks.godaddy.dto.ans.responses.SubmitAgentIdentityCsrByAgentIdResponse;
import io.github.communitysdks.godaddy.dto.ans.responses.GetAgentServerCertificateByAgentIdResponse;
import io.github.communitysdks.godaddy.dto.ans.responses.SubmitAgentServerCsrByAgentIdResponse;
import io.github.communitysdks.godaddy.dto.ans.responses.GetAgentCsrStatusByAgentIdResponse;
import io.github.communitysdks.godaddy.dto.ans.responses.GetAgentEventsResponse;
import io.github.communitysdks.godaddy.errors.ans.AnsApiException;
import io.github.communitysdks.godaddy.errors.ans.AnsBadRequestException;
import io.github.communitysdks.godaddy.errors.ans.AnsConflictException;
import io.github.communitysdks.godaddy.errors.ans.AnsForbiddenException;
import io.github.communitysdks.godaddy.errors.ans.AnsGatewayTimeoutException;
import io.github.communitysdks.godaddy.errors.ans.AnsNotFoundException;
import io.github.communitysdks.godaddy.errors.ans.AnsRateLimitException;
import io.github.communitysdks.godaddy.errors.ans.AnsServerException;
import io.github.communitysdks.godaddy.errors.ans.AnsUnauthorizedException;
import io.github.communitysdks.godaddy.errors.ans.AnsUnprocessableEntityException;
import io.github.communitysdks.godaddy.runtime.JsonCodec;

public final class AnsService extends AbstractService {
    public AnsService(ApiClient client) {
        super(client, "ans");
    }

    public SearchAnsnameResponse searchAnsname(SearchAnsnameRequest request) {
        SearchAnsnameRequest safe = request == null ? new SearchAnsnameRequest() : request;
        Object response = execute(
            "GET",
            "/v1/agents",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return SearchAnsnameResponse.fromMixed(response);
    }

    public RegisterAgentResponse registerAgent(RegisterAgentRequest request) {
        RegisterAgentRequest safe = request == null ? new RegisterAgentRequest() : request;
        Object response = execute(
            "POST",
            "/v1/agents/register",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return RegisterAgentResponse.fromMixed(response);
    }

    public ResolveAnsnameResponse resolveAnsname(ResolveAnsnameRequest request) {
        ResolveAnsnameRequest safe = request == null ? new ResolveAnsnameRequest() : request;
        Object response = execute(
            "POST",
            "/v1/agents/resolution",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return ResolveAnsnameResponse.fromMixed(response);
    }

    public GetAgentResponse getAgent(GetAgentRequest request) {
        GetAgentRequest safe = request == null ? new GetAgentRequest() : request;
        Object response = execute(
            "GET",
            "/v1/agents/{agentId}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetAgentResponse.fromMixed(response);
    }

    public RevokeAgentResponse revokeAgent(RevokeAgentRequest request) {
        RevokeAgentRequest safe = request == null ? new RevokeAgentRequest() : request;
        Object response = execute(
            "POST",
            "/v1/agents/{agentId}/revoke",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return RevokeAgentResponse.fromMixed(response);
    }

    public ValidateRegistrationResponse validateRegistration(ValidateRegistrationRequest request) {
        ValidateRegistrationRequest safe = request == null ? new ValidateRegistrationRequest() : request;
        Object response = execute(
            "POST",
            "/v1/agents/{agentId}/verify-acme",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return ValidateRegistrationResponse.fromMixed(response);
    }

    public VerifyDnsRecordsResponse verifyDnsRecords(VerifyDnsRecordsRequest request) {
        VerifyDnsRecordsRequest safe = request == null ? new VerifyDnsRecordsRequest() : request;
        Object response = execute(
            "POST",
            "/v1/agents/{agentId}/verify-dns",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return VerifyDnsRecordsResponse.fromMixed(response);
    }

    public GetAgentIdentityCertificateByAgentIdResponse getAgentIdentityCertificateByAgentId(GetAgentIdentityCertificateByAgentIdRequest request) {
        GetAgentIdentityCertificateByAgentIdRequest safe = request == null ? new GetAgentIdentityCertificateByAgentIdRequest() : request;
        Object response = execute(
            "GET",
            "/v1/agents/{agentId}/certificates/identity",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetAgentIdentityCertificateByAgentIdResponse.fromMixed(response);
    }

    public SubmitAgentIdentityCsrByAgentIdResponse submitAgentIdentityCsrByAgentId(SubmitAgentIdentityCsrByAgentIdRequest request) {
        SubmitAgentIdentityCsrByAgentIdRequest safe = request == null ? new SubmitAgentIdentityCsrByAgentIdRequest() : request;
        Object response = execute(
            "POST",
            "/v1/agents/{agentId}/certificates/identity",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return SubmitAgentIdentityCsrByAgentIdResponse.fromMixed(response);
    }

    public GetAgentServerCertificateByAgentIdResponse getAgentServerCertificateByAgentId(GetAgentServerCertificateByAgentIdRequest request) {
        GetAgentServerCertificateByAgentIdRequest safe = request == null ? new GetAgentServerCertificateByAgentIdRequest() : request;
        Object response = execute(
            "GET",
            "/v1/agents/{agentId}/certificates/server",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetAgentServerCertificateByAgentIdResponse.fromMixed(response);
    }

    public SubmitAgentServerCsrByAgentIdResponse submitAgentServerCsrByAgentId(SubmitAgentServerCsrByAgentIdRequest request) {
        SubmitAgentServerCsrByAgentIdRequest safe = request == null ? new SubmitAgentServerCsrByAgentIdRequest() : request;
        Object response = execute(
            "POST",
            "/v1/agents/{agentId}/certificates/server",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return SubmitAgentServerCsrByAgentIdResponse.fromMixed(response);
    }

    public GetAgentCsrStatusByAgentIdResponse getAgentCsrStatusByAgentId(GetAgentCsrStatusByAgentIdRequest request) {
        GetAgentCsrStatusByAgentIdRequest safe = request == null ? new GetAgentCsrStatusByAgentIdRequest() : request;
        Object response = execute(
            "GET",
            "/v1/agents/{agentId}/csrs/{csrId}/status",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetAgentCsrStatusByAgentIdResponse.fromMixed(response);
    }

    public GetAgentEventsResponse getAgentEvents(GetAgentEventsRequest request) {
        GetAgentEventsRequest safe = request == null ? new GetAgentEventsRequest() : request;
        Object response = execute(
            "GET",
            "/v1/agents/events",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetAgentEventsResponse.fromMixed(response);
    }

    @Override
    protected ApiException mapException(ApiException exception) {
        Object errorResponse = exception.responseBody == null || exception.responseBody.isBlank() ? null : JsonCodec.parse(exception.responseBody);
        int status = exception.statusCode;
        if (status == 400) return new AnsBadRequestException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 401) return new AnsUnauthorizedException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 403) return new AnsForbiddenException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 404) return new AnsNotFoundException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 409) return new AnsConflictException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 422) return new AnsUnprocessableEntityException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 429) return new AnsRateLimitException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 504) return new AnsGatewayTimeoutException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status >= 500) return new AnsServerException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        return new AnsApiException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
    }
}
