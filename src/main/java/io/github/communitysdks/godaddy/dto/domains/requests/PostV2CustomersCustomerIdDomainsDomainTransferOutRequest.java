package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class PostV2CustomersCustomerIdDomainsDomainTransferOutRequest {
    public final String xRequestId;
    public final String customerId;
    public final String domain;
    public final String registrar;

    public PostV2CustomersCustomerIdDomainsDomainTransferOutRequest() {
        this.xRequestId = null;
        this.customerId = null;
        this.domain = null;
        this.registrar = null;
    }

    public PostV2CustomersCustomerIdDomainsDomainTransferOutRequest(String xRequestId, String customerId, String domain, String registrar) {
        this.xRequestId = xRequestId;
        this.customerId = customerId;
        this.domain = domain;
        this.registrar = registrar;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("customerId", customerId), new Param("domain", domain));
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("registrar", registrar));
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-Request-Id", xRequestId));
    }

    public Object body() {
        return null;
    }
}
