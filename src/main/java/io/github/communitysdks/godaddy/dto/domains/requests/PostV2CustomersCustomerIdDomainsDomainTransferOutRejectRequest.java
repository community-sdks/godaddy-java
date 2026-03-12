package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class PostV2CustomersCustomerIdDomainsDomainTransferOutRejectRequest {
    public final String xRequestId;
    public final String customerId;
    public final String domain;
    public final String reason;

    public PostV2CustomersCustomerIdDomainsDomainTransferOutRejectRequest() {
        this.xRequestId = null;
        this.customerId = null;
        this.domain = null;
        this.reason = null;
    }

    public PostV2CustomersCustomerIdDomainsDomainTransferOutRejectRequest(String xRequestId, String customerId, String domain, String reason) {
        this.xRequestId = xRequestId;
        this.customerId = customerId;
        this.domain = domain;
        this.reason = reason;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("customerId", customerId), new Param("domain", domain));
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("reason", reason));
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-Request-Id", xRequestId));
    }

    public Object body() {
        return null;
    }
}
