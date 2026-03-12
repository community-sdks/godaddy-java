package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class GetV2CustomersCustomerIdDomainsDomainChangeOfRegistrantRequest {
    public final String xRequestId;
    public final String customerId;
    public final String domain;

    public GetV2CustomersCustomerIdDomainsDomainChangeOfRegistrantRequest() {
        this.xRequestId = null;
        this.customerId = null;
        this.domain = null;
    }

    public GetV2CustomersCustomerIdDomainsDomainChangeOfRegistrantRequest(String xRequestId, String customerId, String domain) {
        this.xRequestId = xRequestId;
        this.customerId = customerId;
        this.domain = domain;
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
        return null;
    }
}
