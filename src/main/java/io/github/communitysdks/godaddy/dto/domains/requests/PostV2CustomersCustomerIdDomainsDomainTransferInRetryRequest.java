package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;
import java.util.Map;

public final class PostV2CustomersCustomerIdDomainsDomainTransferInRetryRequest {
    public final String xRequestId;
    public final String customerId;
    public final String domain;
    public final Map<String, Object> body;

    public PostV2CustomersCustomerIdDomainsDomainTransferInRetryRequest() {
        this.xRequestId = null;
        this.customerId = null;
        this.domain = null;
        this.body = null;
    }

    public PostV2CustomersCustomerIdDomainsDomainTransferInRetryRequest(String xRequestId, String customerId, String domain, Map<String, Object> body) {
        this.xRequestId = xRequestId;
        this.customerId = customerId;
        this.domain = domain;
        this.body = body;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("customerId", customerId), new Param("domain", domain));
    }

    public List<Param> toQueryParams() {
        return List.of();
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-Request-Id", xRequestId));
    }

    public Object body() {
        return body;
    }
}
