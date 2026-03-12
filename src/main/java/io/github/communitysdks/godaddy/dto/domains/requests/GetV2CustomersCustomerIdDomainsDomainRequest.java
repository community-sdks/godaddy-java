package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class GetV2CustomersCustomerIdDomainsDomainRequest {
    public final String xRequestId;
    public final String customerId;
    public final String domain;
    public final List<String> includes;

    public GetV2CustomersCustomerIdDomainsDomainRequest() {
        this.xRequestId = null;
        this.customerId = null;
        this.domain = null;
        this.includes = null;
    }

    public GetV2CustomersCustomerIdDomainsDomainRequest(String xRequestId, String customerId, String domain, List<String> includes) {
        this.xRequestId = xRequestId;
        this.customerId = customerId;
        this.domain = domain;
        this.includes = includes;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("customerId", customerId), new Param("domain", domain));
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("includes", includes));
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-Request-Id", xRequestId));
    }

    public Object body() {
        return null;
    }
}
