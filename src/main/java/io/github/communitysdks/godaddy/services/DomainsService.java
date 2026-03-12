package io.github.communitysdks.godaddy.services;

import io.github.communitysdks.godaddy.ApiClient;
import io.github.communitysdks.godaddy.errors.ApiException;
import io.github.communitysdks.godaddy.dto.domains.requests.ListRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.GetAgreementRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.AvailableRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.AvailableBulkRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.ContactsValidateRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.PurchaseRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.SchemaRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.ValidateRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.SuggestRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.TldsRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.GetRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.UpdateRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.CancelRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.UpdateContactsRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.CancelPrivacyRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.PurchasePrivacyRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.RecordReplaceRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.RecordAddRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.RecordGetRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.RecordReplaceTypeNameRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.RecordDeleteTypeNameRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.RecordReplaceTypeRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.RenewRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.TransferInRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.VerifyEmailRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.GetV2CustomersCustomerIdDomainsDomainRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.GetV2CustomersCustomerIdDomainsDomainChangeOfRegistrantRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.DeleteV2CustomersCustomerIdDomainsDomainChangeOfRegistrantRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.PatchV2CustomersCustomerIdDomainsDomainDnssecRecordsRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.DeleteV2CustomersCustomerIdDomainsDomainDnssecRecordsRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.PutV2CustomersCustomerIdDomainsDomainNameServersRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.GetV2CustomersCustomerIdDomainsDomainPrivacyForwardingRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.PatchV2CustomersCustomerIdDomainsDomainPrivacyForwardingRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsDomainRedeemRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsDomainRenewRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.GetV2CustomersCustomerIdDomainsDomainTransferRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsDomainTransferRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsDomainTransferValidateRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsDomainTransferInAcceptRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsDomainTransferInCancelRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsDomainTransferInRestartRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsDomainTransferInRetryRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsDomainTransferOutRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsDomainTransferOutAcceptRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsDomainTransferOutRejectRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.DomainsForwardsGetRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.DomainsForwardsPostRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.DomainsForwardsPutRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.DomainsForwardsDeleteRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.GetV2CustomersCustomerIdDomainsDomainActionsRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.GetV2CustomersCustomerIdDomainsDomainActionsTypeRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.DeleteV2CustomersCustomerIdDomainsDomainActionsTypeRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.GetV2CustomersCustomerIdDomainsNotificationsRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.GetV2CustomersCustomerIdDomainsNotificationsOptInRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.PutV2CustomersCustomerIdDomainsNotificationsOptInRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.GetV2CustomersCustomerIdDomainsNotificationsSchemasTypeRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsNotificationsNotificationIdAcknowledgeRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsRegisterRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.GetV2CustomersCustomerIdDomainsRegisterSchemaTldRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsRegisterValidateRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.GetV2DomainsMaintenancesRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.GetV2DomainsMaintenancesMaintenanceIdRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.GetV2DomainsUsageYyyymmRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.PatchV2CustomersCustomerIdDomainsDomainContactsRequest;
import io.github.communitysdks.godaddy.dto.domains.requests.PostV2CustomersCustomerIdDomainsDomainRegenerateAuthCodeRequest;
import io.github.communitysdks.godaddy.dto.domains.responses.ListResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.GetAgreementResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.AvailableResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.AvailableBulkResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.ContactsValidateResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.PurchaseResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.SchemaResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.ValidateResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.SuggestResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.TldsResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.GetResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.UpdateResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.CancelResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.UpdateContactsResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.CancelPrivacyResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.PurchasePrivacyResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.RecordReplaceResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.RecordAddResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.RecordGetResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.RecordReplaceTypeNameResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.RecordDeleteTypeNameResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.RecordReplaceTypeResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.RenewResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.TransferInResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.VerifyEmailResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.GetV2CustomersCustomerIdDomainsDomainResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.GetV2CustomersCustomerIdDomainsDomainChangeOfRegistrantResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.DeleteV2CustomersCustomerIdDomainsDomainChangeOfRegistrantResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.PatchV2CustomersCustomerIdDomainsDomainDnssecRecordsResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.DeleteV2CustomersCustomerIdDomainsDomainDnssecRecordsResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.PutV2CustomersCustomerIdDomainsDomainNameServersResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.GetV2CustomersCustomerIdDomainsDomainPrivacyForwardingResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.PatchV2CustomersCustomerIdDomainsDomainPrivacyForwardingResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.PostV2CustomersCustomerIdDomainsDomainRedeemResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.PostV2CustomersCustomerIdDomainsDomainRenewResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.GetV2CustomersCustomerIdDomainsDomainTransferResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.PostV2CustomersCustomerIdDomainsDomainTransferResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.PostV2CustomersCustomerIdDomainsDomainTransferValidateResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.PostV2CustomersCustomerIdDomainsDomainTransferInAcceptResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.PostV2CustomersCustomerIdDomainsDomainTransferInCancelResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.PostV2CustomersCustomerIdDomainsDomainTransferInRestartResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.PostV2CustomersCustomerIdDomainsDomainTransferInRetryResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.PostV2CustomersCustomerIdDomainsDomainTransferOutResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.PostV2CustomersCustomerIdDomainsDomainTransferOutAcceptResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.PostV2CustomersCustomerIdDomainsDomainTransferOutRejectResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.DomainsForwardsGetResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.DomainsForwardsPostResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.DomainsForwardsPutResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.DomainsForwardsDeleteResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.GetV2CustomersCustomerIdDomainsDomainActionsResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.GetV2CustomersCustomerIdDomainsDomainActionsTypeResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.DeleteV2CustomersCustomerIdDomainsDomainActionsTypeResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.GetV2CustomersCustomerIdDomainsNotificationsResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.GetV2CustomersCustomerIdDomainsNotificationsOptInResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.PutV2CustomersCustomerIdDomainsNotificationsOptInResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.GetV2CustomersCustomerIdDomainsNotificationsSchemasTypeResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.PostV2CustomersCustomerIdDomainsNotificationsNotificationIdAcknowledgeResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.PostV2CustomersCustomerIdDomainsRegisterResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.GetV2CustomersCustomerIdDomainsRegisterSchemaTldResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.PostV2CustomersCustomerIdDomainsRegisterValidateResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.GetV2DomainsMaintenancesResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.GetV2DomainsMaintenancesMaintenanceIdResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.GetV2DomainsUsageYyyymmResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.PatchV2CustomersCustomerIdDomainsDomainContactsResponse;
import io.github.communitysdks.godaddy.dto.domains.responses.PostV2CustomersCustomerIdDomainsDomainRegenerateAuthCodeResponse;
import io.github.communitysdks.godaddy.errors.domains.DomainsApiException;
import io.github.communitysdks.godaddy.errors.domains.DomainsBadRequestException;
import io.github.communitysdks.godaddy.errors.domains.DomainsConflictException;
import io.github.communitysdks.godaddy.errors.domains.DomainsForbiddenException;
import io.github.communitysdks.godaddy.errors.domains.DomainsGatewayTimeoutException;
import io.github.communitysdks.godaddy.errors.domains.DomainsNotFoundException;
import io.github.communitysdks.godaddy.errors.domains.DomainsRateLimitException;
import io.github.communitysdks.godaddy.errors.domains.DomainsServerException;
import io.github.communitysdks.godaddy.errors.domains.DomainsUnauthorizedException;
import io.github.communitysdks.godaddy.errors.domains.DomainsUnprocessableEntityException;
import io.github.communitysdks.godaddy.runtime.JsonCodec;

public final class DomainsService extends AbstractService {
    public DomainsService(ApiClient client) {
        super(client, "domains");
    }

    public ListResponse list(ListRequest request) {
        ListRequest safe = request == null ? new ListRequest() : request;
        Object response = execute(
            "GET",
            "/v1/domains",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return ListResponse.fromMixed(response);
    }

    public GetAgreementResponse getAgreement(GetAgreementRequest request) {
        GetAgreementRequest safe = request == null ? new GetAgreementRequest() : request;
        Object response = execute(
            "GET",
            "/v1/domains/agreements",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetAgreementResponse.fromMixed(response);
    }

    public AvailableResponse available(AvailableRequest request) {
        AvailableRequest safe = request == null ? new AvailableRequest() : request;
        Object response = execute(
            "GET",
            "/v1/domains/available",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return AvailableResponse.fromMixed(response);
    }

    public AvailableBulkResponse availableBulk(AvailableBulkRequest request) {
        AvailableBulkRequest safe = request == null ? new AvailableBulkRequest() : request;
        Object response = execute(
            "POST",
            "/v1/domains/available",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return AvailableBulkResponse.fromMixed(response);
    }

    public ContactsValidateResponse contactsValidate(ContactsValidateRequest request) {
        ContactsValidateRequest safe = request == null ? new ContactsValidateRequest() : request;
        Object response = execute(
            "POST",
            "/v1/domains/contacts/validate",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return ContactsValidateResponse.fromMixed(response);
    }

    public PurchaseResponse purchase(PurchaseRequest request) {
        PurchaseRequest safe = request == null ? new PurchaseRequest() : request;
        Object response = execute(
            "POST",
            "/v1/domains/purchase",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return PurchaseResponse.fromMixed(response);
    }

    public SchemaResponse schema(SchemaRequest request) {
        SchemaRequest safe = request == null ? new SchemaRequest() : request;
        Object response = execute(
            "GET",
            "/v1/domains/purchase/schema/{tld}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return SchemaResponse.fromMixed(response);
    }

    public ValidateResponse validate(ValidateRequest request) {
        ValidateRequest safe = request == null ? new ValidateRequest() : request;
        Object response = execute(
            "POST",
            "/v1/domains/purchase/validate",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return ValidateResponse.fromMixed(response);
    }

    public SuggestResponse suggest(SuggestRequest request) {
        SuggestRequest safe = request == null ? new SuggestRequest() : request;
        Object response = execute(
            "GET",
            "/v1/domains/suggest",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return SuggestResponse.fromMixed(response);
    }

    public TldsResponse tlds(TldsRequest request) {
        TldsRequest safe = request == null ? new TldsRequest() : request;
        Object response = execute(
            "GET",
            "/v1/domains/tlds",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return TldsResponse.fromMixed(response);
    }

    public GetResponse get(GetRequest request) {
        GetRequest safe = request == null ? new GetRequest() : request;
        Object response = execute(
            "GET",
            "/v1/domains/{domain}",
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
            "/v1/domains/{domain}",
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
            "/v1/domains/{domain}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return CancelResponse.fromMixed(response);
    }

    public UpdateContactsResponse updateContacts(UpdateContactsRequest request) {
        UpdateContactsRequest safe = request == null ? new UpdateContactsRequest() : request;
        Object response = execute(
            "PATCH",
            "/v1/domains/{domain}/contacts",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return UpdateContactsResponse.fromMixed(response);
    }

    public CancelPrivacyResponse cancelPrivacy(CancelPrivacyRequest request) {
        CancelPrivacyRequest safe = request == null ? new CancelPrivacyRequest() : request;
        Object response = execute(
            "DELETE",
            "/v1/domains/{domain}/privacy",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return CancelPrivacyResponse.fromMixed(response);
    }

    public PurchasePrivacyResponse purchasePrivacy(PurchasePrivacyRequest request) {
        PurchasePrivacyRequest safe = request == null ? new PurchasePrivacyRequest() : request;
        Object response = execute(
            "POST",
            "/v1/domains/{domain}/privacy/purchase",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return PurchasePrivacyResponse.fromMixed(response);
    }

    public RecordReplaceResponse recordReplace(RecordReplaceRequest request) {
        RecordReplaceRequest safe = request == null ? new RecordReplaceRequest() : request;
        Object response = execute(
            "PUT",
            "/v1/domains/{domain}/records",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return RecordReplaceResponse.fromMixed(response);
    }

    public RecordAddResponse recordAdd(RecordAddRequest request) {
        RecordAddRequest safe = request == null ? new RecordAddRequest() : request;
        Object response = execute(
            "PATCH",
            "/v1/domains/{domain}/records",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return RecordAddResponse.fromMixed(response);
    }

    public RecordGetResponse recordGet(RecordGetRequest request) {
        RecordGetRequest safe = request == null ? new RecordGetRequest() : request;
        Object response = execute(
            "GET",
            "/v1/domains/{domain}/records/{type}/{name}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return RecordGetResponse.fromMixed(response);
    }

    public RecordReplaceTypeNameResponse recordReplaceTypeName(RecordReplaceTypeNameRequest request) {
        RecordReplaceTypeNameRequest safe = request == null ? new RecordReplaceTypeNameRequest() : request;
        Object response = execute(
            "PUT",
            "/v1/domains/{domain}/records/{type}/{name}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return RecordReplaceTypeNameResponse.fromMixed(response);
    }

    public RecordDeleteTypeNameResponse recordDeleteTypeName(RecordDeleteTypeNameRequest request) {
        RecordDeleteTypeNameRequest safe = request == null ? new RecordDeleteTypeNameRequest() : request;
        Object response = execute(
            "DELETE",
            "/v1/domains/{domain}/records/{type}/{name}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return RecordDeleteTypeNameResponse.fromMixed(response);
    }

    public RecordReplaceTypeResponse recordReplaceType(RecordReplaceTypeRequest request) {
        RecordReplaceTypeRequest safe = request == null ? new RecordReplaceTypeRequest() : request;
        Object response = execute(
            "PUT",
            "/v1/domains/{domain}/records/{type}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return RecordReplaceTypeResponse.fromMixed(response);
    }

    public RenewResponse renew(RenewRequest request) {
        RenewRequest safe = request == null ? new RenewRequest() : request;
        Object response = execute(
            "POST",
            "/v1/domains/{domain}/renew",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return RenewResponse.fromMixed(response);
    }

    public TransferInResponse transferIn(TransferInRequest request) {
        TransferInRequest safe = request == null ? new TransferInRequest() : request;
        Object response = execute(
            "POST",
            "/v1/domains/{domain}/transfer",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return TransferInResponse.fromMixed(response);
    }

    public VerifyEmailResponse verifyEmail(VerifyEmailRequest request) {
        VerifyEmailRequest safe = request == null ? new VerifyEmailRequest() : request;
        Object response = execute(
            "POST",
            "/v1/domains/{domain}/verifyRegistrantEmail",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return VerifyEmailResponse.fromMixed(response);
    }

    public GetV2CustomersCustomerIdDomainsDomainResponse getV2CustomersCustomerIdDomainsDomain(GetV2CustomersCustomerIdDomainsDomainRequest request) {
        GetV2CustomersCustomerIdDomainsDomainRequest safe = request == null ? new GetV2CustomersCustomerIdDomainsDomainRequest() : request;
        Object response = execute(
            "GET",
            "/v2/customers/{customerId}/domains/{domain}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetV2CustomersCustomerIdDomainsDomainResponse.fromMixed(response);
    }

    public GetV2CustomersCustomerIdDomainsDomainChangeOfRegistrantResponse getV2CustomersCustomerIdDomainsDomainChangeOfRegistrant(GetV2CustomersCustomerIdDomainsDomainChangeOfRegistrantRequest request) {
        GetV2CustomersCustomerIdDomainsDomainChangeOfRegistrantRequest safe = request == null ? new GetV2CustomersCustomerIdDomainsDomainChangeOfRegistrantRequest() : request;
        Object response = execute(
            "GET",
            "/v2/customers/{customerId}/domains/{domain}/changeOfRegistrant",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetV2CustomersCustomerIdDomainsDomainChangeOfRegistrantResponse.fromMixed(response);
    }

    public DeleteV2CustomersCustomerIdDomainsDomainChangeOfRegistrantResponse deleteV2CustomersCustomerIdDomainsDomainChangeOfRegistrant(DeleteV2CustomersCustomerIdDomainsDomainChangeOfRegistrantRequest request) {
        DeleteV2CustomersCustomerIdDomainsDomainChangeOfRegistrantRequest safe = request == null ? new DeleteV2CustomersCustomerIdDomainsDomainChangeOfRegistrantRequest() : request;
        Object response = execute(
            "DELETE",
            "/v2/customers/{customerId}/domains/{domain}/changeOfRegistrant",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return DeleteV2CustomersCustomerIdDomainsDomainChangeOfRegistrantResponse.fromMixed(response);
    }

    public PatchV2CustomersCustomerIdDomainsDomainDnssecRecordsResponse patchV2CustomersCustomerIdDomainsDomainDnssecRecords(PatchV2CustomersCustomerIdDomainsDomainDnssecRecordsRequest request) {
        PatchV2CustomersCustomerIdDomainsDomainDnssecRecordsRequest safe = request == null ? new PatchV2CustomersCustomerIdDomainsDomainDnssecRecordsRequest() : request;
        Object response = execute(
            "PATCH",
            "/v2/customers/{customerId}/domains/{domain}/dnssecRecords",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return PatchV2CustomersCustomerIdDomainsDomainDnssecRecordsResponse.fromMixed(response);
    }

    public DeleteV2CustomersCustomerIdDomainsDomainDnssecRecordsResponse deleteV2CustomersCustomerIdDomainsDomainDnssecRecords(DeleteV2CustomersCustomerIdDomainsDomainDnssecRecordsRequest request) {
        DeleteV2CustomersCustomerIdDomainsDomainDnssecRecordsRequest safe = request == null ? new DeleteV2CustomersCustomerIdDomainsDomainDnssecRecordsRequest() : request;
        Object response = execute(
            "DELETE",
            "/v2/customers/{customerId}/domains/{domain}/dnssecRecords",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return DeleteV2CustomersCustomerIdDomainsDomainDnssecRecordsResponse.fromMixed(response);
    }

    public PutV2CustomersCustomerIdDomainsDomainNameServersResponse putV2CustomersCustomerIdDomainsDomainNameServers(PutV2CustomersCustomerIdDomainsDomainNameServersRequest request) {
        PutV2CustomersCustomerIdDomainsDomainNameServersRequest safe = request == null ? new PutV2CustomersCustomerIdDomainsDomainNameServersRequest() : request;
        Object response = execute(
            "PUT",
            "/v2/customers/{customerId}/domains/{domain}/nameServers",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return PutV2CustomersCustomerIdDomainsDomainNameServersResponse.fromMixed(response);
    }

    public GetV2CustomersCustomerIdDomainsDomainPrivacyForwardingResponse getV2CustomersCustomerIdDomainsDomainPrivacyForwarding(GetV2CustomersCustomerIdDomainsDomainPrivacyForwardingRequest request) {
        GetV2CustomersCustomerIdDomainsDomainPrivacyForwardingRequest safe = request == null ? new GetV2CustomersCustomerIdDomainsDomainPrivacyForwardingRequest() : request;
        Object response = execute(
            "GET",
            "/v2/customers/{customerId}/domains/{domain}/privacy/forwarding",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetV2CustomersCustomerIdDomainsDomainPrivacyForwardingResponse.fromMixed(response);
    }

    public PatchV2CustomersCustomerIdDomainsDomainPrivacyForwardingResponse patchV2CustomersCustomerIdDomainsDomainPrivacyForwarding(PatchV2CustomersCustomerIdDomainsDomainPrivacyForwardingRequest request) {
        PatchV2CustomersCustomerIdDomainsDomainPrivacyForwardingRequest safe = request == null ? new PatchV2CustomersCustomerIdDomainsDomainPrivacyForwardingRequest() : request;
        Object response = execute(
            "PATCH",
            "/v2/customers/{customerId}/domains/{domain}/privacy/forwarding",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return PatchV2CustomersCustomerIdDomainsDomainPrivacyForwardingResponse.fromMixed(response);
    }

    public PostV2CustomersCustomerIdDomainsDomainRedeemResponse postV2CustomersCustomerIdDomainsDomainRedeem(PostV2CustomersCustomerIdDomainsDomainRedeemRequest request) {
        PostV2CustomersCustomerIdDomainsDomainRedeemRequest safe = request == null ? new PostV2CustomersCustomerIdDomainsDomainRedeemRequest() : request;
        Object response = execute(
            "POST",
            "/v2/customers/{customerId}/domains/{domain}/redeem",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return PostV2CustomersCustomerIdDomainsDomainRedeemResponse.fromMixed(response);
    }

    public PostV2CustomersCustomerIdDomainsDomainRenewResponse postV2CustomersCustomerIdDomainsDomainRenew(PostV2CustomersCustomerIdDomainsDomainRenewRequest request) {
        PostV2CustomersCustomerIdDomainsDomainRenewRequest safe = request == null ? new PostV2CustomersCustomerIdDomainsDomainRenewRequest() : request;
        Object response = execute(
            "POST",
            "/v2/customers/{customerId}/domains/{domain}/renew",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return PostV2CustomersCustomerIdDomainsDomainRenewResponse.fromMixed(response);
    }

    public GetV2CustomersCustomerIdDomainsDomainTransferResponse getV2CustomersCustomerIdDomainsDomainTransfer(GetV2CustomersCustomerIdDomainsDomainTransferRequest request) {
        GetV2CustomersCustomerIdDomainsDomainTransferRequest safe = request == null ? new GetV2CustomersCustomerIdDomainsDomainTransferRequest() : request;
        Object response = execute(
            "GET",
            "/v2/customers/{customerId}/domains/{domain}/transfer",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetV2CustomersCustomerIdDomainsDomainTransferResponse.fromMixed(response);
    }

    public PostV2CustomersCustomerIdDomainsDomainTransferResponse postV2CustomersCustomerIdDomainsDomainTransfer(PostV2CustomersCustomerIdDomainsDomainTransferRequest request) {
        PostV2CustomersCustomerIdDomainsDomainTransferRequest safe = request == null ? new PostV2CustomersCustomerIdDomainsDomainTransferRequest() : request;
        Object response = execute(
            "POST",
            "/v2/customers/{customerId}/domains/{domain}/transfer",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return PostV2CustomersCustomerIdDomainsDomainTransferResponse.fromMixed(response);
    }

    public PostV2CustomersCustomerIdDomainsDomainTransferValidateResponse postV2CustomersCustomerIdDomainsDomainTransferValidate(PostV2CustomersCustomerIdDomainsDomainTransferValidateRequest request) {
        PostV2CustomersCustomerIdDomainsDomainTransferValidateRequest safe = request == null ? new PostV2CustomersCustomerIdDomainsDomainTransferValidateRequest() : request;
        Object response = execute(
            "POST",
            "/v2/customers/{customerId}/domains/{domain}/transfer/validate",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return PostV2CustomersCustomerIdDomainsDomainTransferValidateResponse.fromMixed(response);
    }

    public PostV2CustomersCustomerIdDomainsDomainTransferInAcceptResponse postV2CustomersCustomerIdDomainsDomainTransferInAccept(PostV2CustomersCustomerIdDomainsDomainTransferInAcceptRequest request) {
        PostV2CustomersCustomerIdDomainsDomainTransferInAcceptRequest safe = request == null ? new PostV2CustomersCustomerIdDomainsDomainTransferInAcceptRequest() : request;
        Object response = execute(
            "POST",
            "/v2/customers/{customerId}/domains/{domain}/transferInAccept",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return PostV2CustomersCustomerIdDomainsDomainTransferInAcceptResponse.fromMixed(response);
    }

    public PostV2CustomersCustomerIdDomainsDomainTransferInCancelResponse postV2CustomersCustomerIdDomainsDomainTransferInCancel(PostV2CustomersCustomerIdDomainsDomainTransferInCancelRequest request) {
        PostV2CustomersCustomerIdDomainsDomainTransferInCancelRequest safe = request == null ? new PostV2CustomersCustomerIdDomainsDomainTransferInCancelRequest() : request;
        Object response = execute(
            "POST",
            "/v2/customers/{customerId}/domains/{domain}/transferInCancel",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return PostV2CustomersCustomerIdDomainsDomainTransferInCancelResponse.fromMixed(response);
    }

    public PostV2CustomersCustomerIdDomainsDomainTransferInRestartResponse postV2CustomersCustomerIdDomainsDomainTransferInRestart(PostV2CustomersCustomerIdDomainsDomainTransferInRestartRequest request) {
        PostV2CustomersCustomerIdDomainsDomainTransferInRestartRequest safe = request == null ? new PostV2CustomersCustomerIdDomainsDomainTransferInRestartRequest() : request;
        Object response = execute(
            "POST",
            "/v2/customers/{customerId}/domains/{domain}/transferInRestart",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return PostV2CustomersCustomerIdDomainsDomainTransferInRestartResponse.fromMixed(response);
    }

    public PostV2CustomersCustomerIdDomainsDomainTransferInRetryResponse postV2CustomersCustomerIdDomainsDomainTransferInRetry(PostV2CustomersCustomerIdDomainsDomainTransferInRetryRequest request) {
        PostV2CustomersCustomerIdDomainsDomainTransferInRetryRequest safe = request == null ? new PostV2CustomersCustomerIdDomainsDomainTransferInRetryRequest() : request;
        Object response = execute(
            "POST",
            "/v2/customers/{customerId}/domains/{domain}/transferInRetry",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return PostV2CustomersCustomerIdDomainsDomainTransferInRetryResponse.fromMixed(response);
    }

    public PostV2CustomersCustomerIdDomainsDomainTransferOutResponse postV2CustomersCustomerIdDomainsDomainTransferOut(PostV2CustomersCustomerIdDomainsDomainTransferOutRequest request) {
        PostV2CustomersCustomerIdDomainsDomainTransferOutRequest safe = request == null ? new PostV2CustomersCustomerIdDomainsDomainTransferOutRequest() : request;
        Object response = execute(
            "POST",
            "/v2/customers/{customerId}/domains/{domain}/transferOut",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return PostV2CustomersCustomerIdDomainsDomainTransferOutResponse.fromMixed(response);
    }

    public PostV2CustomersCustomerIdDomainsDomainTransferOutAcceptResponse postV2CustomersCustomerIdDomainsDomainTransferOutAccept(PostV2CustomersCustomerIdDomainsDomainTransferOutAcceptRequest request) {
        PostV2CustomersCustomerIdDomainsDomainTransferOutAcceptRequest safe = request == null ? new PostV2CustomersCustomerIdDomainsDomainTransferOutAcceptRequest() : request;
        Object response = execute(
            "POST",
            "/v2/customers/{customerId}/domains/{domain}/transferOutAccept",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return PostV2CustomersCustomerIdDomainsDomainTransferOutAcceptResponse.fromMixed(response);
    }

    public PostV2CustomersCustomerIdDomainsDomainTransferOutRejectResponse postV2CustomersCustomerIdDomainsDomainTransferOutReject(PostV2CustomersCustomerIdDomainsDomainTransferOutRejectRequest request) {
        PostV2CustomersCustomerIdDomainsDomainTransferOutRejectRequest safe = request == null ? new PostV2CustomersCustomerIdDomainsDomainTransferOutRejectRequest() : request;
        Object response = execute(
            "POST",
            "/v2/customers/{customerId}/domains/{domain}/transferOutReject",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return PostV2CustomersCustomerIdDomainsDomainTransferOutRejectResponse.fromMixed(response);
    }

    public DomainsForwardsGetResponse domainsForwardsGet(DomainsForwardsGetRequest request) {
        DomainsForwardsGetRequest safe = request == null ? new DomainsForwardsGetRequest() : request;
        Object response = execute(
            "GET",
            "/v2/customers/{customerId}/domains/forwards/{fqdn}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return DomainsForwardsGetResponse.fromMixed(response);
    }

    public DomainsForwardsPostResponse domainsForwardsPost(DomainsForwardsPostRequest request) {
        DomainsForwardsPostRequest safe = request == null ? new DomainsForwardsPostRequest() : request;
        Object response = execute(
            "POST",
            "/v2/customers/{customerId}/domains/forwards/{fqdn}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return DomainsForwardsPostResponse.fromMixed(response);
    }

    public DomainsForwardsPutResponse domainsForwardsPut(DomainsForwardsPutRequest request) {
        DomainsForwardsPutRequest safe = request == null ? new DomainsForwardsPutRequest() : request;
        Object response = execute(
            "PUT",
            "/v2/customers/{customerId}/domains/forwards/{fqdn}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return DomainsForwardsPutResponse.fromMixed(response);
    }

    public DomainsForwardsDeleteResponse domainsForwardsDelete(DomainsForwardsDeleteRequest request) {
        DomainsForwardsDeleteRequest safe = request == null ? new DomainsForwardsDeleteRequest() : request;
        Object response = execute(
            "DELETE",
            "/v2/customers/{customerId}/domains/forwards/{fqdn}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return DomainsForwardsDeleteResponse.fromMixed(response);
    }

    public GetV2CustomersCustomerIdDomainsDomainActionsResponse getV2CustomersCustomerIdDomainsDomainActions(GetV2CustomersCustomerIdDomainsDomainActionsRequest request) {
        GetV2CustomersCustomerIdDomainsDomainActionsRequest safe = request == null ? new GetV2CustomersCustomerIdDomainsDomainActionsRequest() : request;
        Object response = execute(
            "GET",
            "/v2/customers/{customerId}/domains/{domain}/actions",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetV2CustomersCustomerIdDomainsDomainActionsResponse.fromMixed(response);
    }

    public GetV2CustomersCustomerIdDomainsDomainActionsTypeResponse getV2CustomersCustomerIdDomainsDomainActionsType(GetV2CustomersCustomerIdDomainsDomainActionsTypeRequest request) {
        GetV2CustomersCustomerIdDomainsDomainActionsTypeRequest safe = request == null ? new GetV2CustomersCustomerIdDomainsDomainActionsTypeRequest() : request;
        Object response = execute(
            "GET",
            "/v2/customers/{customerId}/domains/{domain}/actions/{type}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetV2CustomersCustomerIdDomainsDomainActionsTypeResponse.fromMixed(response);
    }

    public DeleteV2CustomersCustomerIdDomainsDomainActionsTypeResponse deleteV2CustomersCustomerIdDomainsDomainActionsType(DeleteV2CustomersCustomerIdDomainsDomainActionsTypeRequest request) {
        DeleteV2CustomersCustomerIdDomainsDomainActionsTypeRequest safe = request == null ? new DeleteV2CustomersCustomerIdDomainsDomainActionsTypeRequest() : request;
        Object response = execute(
            "DELETE",
            "/v2/customers/{customerId}/domains/{domain}/actions/{type}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return DeleteV2CustomersCustomerIdDomainsDomainActionsTypeResponse.fromMixed(response);
    }

    public GetV2CustomersCustomerIdDomainsNotificationsResponse getV2CustomersCustomerIdDomainsNotifications(GetV2CustomersCustomerIdDomainsNotificationsRequest request) {
        GetV2CustomersCustomerIdDomainsNotificationsRequest safe = request == null ? new GetV2CustomersCustomerIdDomainsNotificationsRequest() : request;
        Object response = execute(
            "GET",
            "/v2/customers/{customerId}/domains/notifications",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetV2CustomersCustomerIdDomainsNotificationsResponse.fromMixed(response);
    }

    public GetV2CustomersCustomerIdDomainsNotificationsOptInResponse getV2CustomersCustomerIdDomainsNotificationsOptIn(GetV2CustomersCustomerIdDomainsNotificationsOptInRequest request) {
        GetV2CustomersCustomerIdDomainsNotificationsOptInRequest safe = request == null ? new GetV2CustomersCustomerIdDomainsNotificationsOptInRequest() : request;
        Object response = execute(
            "GET",
            "/v2/customers/{customerId}/domains/notifications/optIn",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetV2CustomersCustomerIdDomainsNotificationsOptInResponse.fromMixed(response);
    }

    public PutV2CustomersCustomerIdDomainsNotificationsOptInResponse putV2CustomersCustomerIdDomainsNotificationsOptIn(PutV2CustomersCustomerIdDomainsNotificationsOptInRequest request) {
        PutV2CustomersCustomerIdDomainsNotificationsOptInRequest safe = request == null ? new PutV2CustomersCustomerIdDomainsNotificationsOptInRequest() : request;
        Object response = execute(
            "PUT",
            "/v2/customers/{customerId}/domains/notifications/optIn",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return PutV2CustomersCustomerIdDomainsNotificationsOptInResponse.fromMixed(response);
    }

    public GetV2CustomersCustomerIdDomainsNotificationsSchemasTypeResponse getV2CustomersCustomerIdDomainsNotificationsSchemasType(GetV2CustomersCustomerIdDomainsNotificationsSchemasTypeRequest request) {
        GetV2CustomersCustomerIdDomainsNotificationsSchemasTypeRequest safe = request == null ? new GetV2CustomersCustomerIdDomainsNotificationsSchemasTypeRequest() : request;
        Object response = execute(
            "GET",
            "/v2/customers/{customerId}/domains/notifications/schemas/{type}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetV2CustomersCustomerIdDomainsNotificationsSchemasTypeResponse.fromMixed(response);
    }

    public PostV2CustomersCustomerIdDomainsNotificationsNotificationIdAcknowledgeResponse postV2CustomersCustomerIdDomainsNotificationsNotificationIdAcknowledge(PostV2CustomersCustomerIdDomainsNotificationsNotificationIdAcknowledgeRequest request) {
        PostV2CustomersCustomerIdDomainsNotificationsNotificationIdAcknowledgeRequest safe = request == null ? new PostV2CustomersCustomerIdDomainsNotificationsNotificationIdAcknowledgeRequest() : request;
        Object response = execute(
            "POST",
            "/v2/customers/{customerId}/domains/notifications/{notificationId}/acknowledge",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return PostV2CustomersCustomerIdDomainsNotificationsNotificationIdAcknowledgeResponse.fromMixed(response);
    }

    public PostV2CustomersCustomerIdDomainsRegisterResponse postV2CustomersCustomerIdDomainsRegister(PostV2CustomersCustomerIdDomainsRegisterRequest request) {
        PostV2CustomersCustomerIdDomainsRegisterRequest safe = request == null ? new PostV2CustomersCustomerIdDomainsRegisterRequest() : request;
        Object response = execute(
            "POST",
            "/v2/customers/{customerId}/domains/register",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return PostV2CustomersCustomerIdDomainsRegisterResponse.fromMixed(response);
    }

    public GetV2CustomersCustomerIdDomainsRegisterSchemaTldResponse getV2CustomersCustomerIdDomainsRegisterSchemaTld(GetV2CustomersCustomerIdDomainsRegisterSchemaTldRequest request) {
        GetV2CustomersCustomerIdDomainsRegisterSchemaTldRequest safe = request == null ? new GetV2CustomersCustomerIdDomainsRegisterSchemaTldRequest() : request;
        Object response = execute(
            "GET",
            "/v2/customers/{customerId}/domains/register/schema/{tld}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetV2CustomersCustomerIdDomainsRegisterSchemaTldResponse.fromMixed(response);
    }

    public PostV2CustomersCustomerIdDomainsRegisterValidateResponse postV2CustomersCustomerIdDomainsRegisterValidate(PostV2CustomersCustomerIdDomainsRegisterValidateRequest request) {
        PostV2CustomersCustomerIdDomainsRegisterValidateRequest safe = request == null ? new PostV2CustomersCustomerIdDomainsRegisterValidateRequest() : request;
        Object response = execute(
            "POST",
            "/v2/customers/{customerId}/domains/register/validate",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return PostV2CustomersCustomerIdDomainsRegisterValidateResponse.fromMixed(response);
    }

    public GetV2DomainsMaintenancesResponse getV2DomainsMaintenances(GetV2DomainsMaintenancesRequest request) {
        GetV2DomainsMaintenancesRequest safe = request == null ? new GetV2DomainsMaintenancesRequest() : request;
        Object response = execute(
            "GET",
            "/v2/domains/maintenances",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetV2DomainsMaintenancesResponse.fromMixed(response);
    }

    public GetV2DomainsMaintenancesMaintenanceIdResponse getV2DomainsMaintenancesMaintenanceId(GetV2DomainsMaintenancesMaintenanceIdRequest request) {
        GetV2DomainsMaintenancesMaintenanceIdRequest safe = request == null ? new GetV2DomainsMaintenancesMaintenanceIdRequest() : request;
        Object response = execute(
            "GET",
            "/v2/domains/maintenances/{maintenanceId}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetV2DomainsMaintenancesMaintenanceIdResponse.fromMixed(response);
    }

    public GetV2DomainsUsageYyyymmResponse getV2DomainsUsageYyyymm(GetV2DomainsUsageYyyymmRequest request) {
        GetV2DomainsUsageYyyymmRequest safe = request == null ? new GetV2DomainsUsageYyyymmRequest() : request;
        Object response = execute(
            "GET",
            "/v2/domains/usage/{yyyymm}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetV2DomainsUsageYyyymmResponse.fromMixed(response);
    }

    public PatchV2CustomersCustomerIdDomainsDomainContactsResponse patchV2CustomersCustomerIdDomainsDomainContacts(PatchV2CustomersCustomerIdDomainsDomainContactsRequest request) {
        PatchV2CustomersCustomerIdDomainsDomainContactsRequest safe = request == null ? new PatchV2CustomersCustomerIdDomainsDomainContactsRequest() : request;
        Object response = execute(
            "PATCH",
            "/v2/customers/{customerId}/domains/{domain}/contacts",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return PatchV2CustomersCustomerIdDomainsDomainContactsResponse.fromMixed(response);
    }

    public PostV2CustomersCustomerIdDomainsDomainRegenerateAuthCodeResponse postV2CustomersCustomerIdDomainsDomainRegenerateAuthCode(PostV2CustomersCustomerIdDomainsDomainRegenerateAuthCodeRequest request) {
        PostV2CustomersCustomerIdDomainsDomainRegenerateAuthCodeRequest safe = request == null ? new PostV2CustomersCustomerIdDomainsDomainRegenerateAuthCodeRequest() : request;
        Object response = execute(
            "POST",
            "/v2/customers/{customerId}/domains/{domain}/regenerateAuthCode",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return PostV2CustomersCustomerIdDomainsDomainRegenerateAuthCodeResponse.fromMixed(response);
    }

    @Override
    protected ApiException mapException(ApiException exception) {
        Object errorResponse = exception.responseBody == null || exception.responseBody.isBlank() ? null : JsonCodec.parse(exception.responseBody);
        int status = exception.statusCode;
        if (status == 400) return new DomainsBadRequestException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 401) return new DomainsUnauthorizedException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 403) return new DomainsForbiddenException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 404) return new DomainsNotFoundException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 409) return new DomainsConflictException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 422) return new DomainsUnprocessableEntityException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 429) return new DomainsRateLimitException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 504) return new DomainsGatewayTimeoutException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status >= 500) return new DomainsServerException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        return new DomainsApiException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
    }
}
