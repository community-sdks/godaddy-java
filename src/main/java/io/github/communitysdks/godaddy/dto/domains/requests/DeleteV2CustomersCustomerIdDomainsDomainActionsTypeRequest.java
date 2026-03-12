package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class DeleteV2CustomersCustomerIdDomainsDomainActionsTypeRequest {
    public final String xRequestId;
    public final String customerId;
    public final String domain;
    public final String type;

    public DeleteV2CustomersCustomerIdDomainsDomainActionsTypeRequest() {
        this.xRequestId = null;
        this.customerId = null;
        this.domain = null;
        this.type = null;
    }

    public DeleteV2CustomersCustomerIdDomainsDomainActionsTypeRequest(String xRequestId, String customerId, String domain, String type) {
        this.xRequestId = xRequestId;
        this.customerId = customerId;
        this.domain = domain;
        this.type = type;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("customerId", customerId), new Param("domain", domain), new Param("type", type));
    }

    public List<Param> toQueryParams() {
        return List.of();
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-Request-Id", xRequestId));
    }

    public Object body() {
        return null;
    }
}
