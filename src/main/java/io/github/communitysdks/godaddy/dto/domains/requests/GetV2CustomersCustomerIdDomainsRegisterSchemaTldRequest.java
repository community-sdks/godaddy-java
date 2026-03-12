package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class GetV2CustomersCustomerIdDomainsRegisterSchemaTldRequest {
    public final String xRequestId;
    public final String customerId;
    public final String tld;

    public GetV2CustomersCustomerIdDomainsRegisterSchemaTldRequest() {
        this.xRequestId = null;
        this.customerId = null;
        this.tld = null;
    }

    public GetV2CustomersCustomerIdDomainsRegisterSchemaTldRequest(String xRequestId, String customerId, String tld) {
        this.xRequestId = xRequestId;
        this.customerId = customerId;
        this.tld = tld;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("customerId", customerId), new Param("tld", tld));
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
