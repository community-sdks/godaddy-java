package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class PutV2CustomersCustomerIdDomainsNotificationsOptInRequest {
    public final String xRequestId;
    public final String customerId;
    public final List<String> types;

    public PutV2CustomersCustomerIdDomainsNotificationsOptInRequest() {
        this.xRequestId = null;
        this.customerId = null;
        this.types = null;
    }

    public PutV2CustomersCustomerIdDomainsNotificationsOptInRequest(String xRequestId, String customerId, List<String> types) {
        this.xRequestId = xRequestId;
        this.customerId = customerId;
        this.types = types;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("customerId", customerId));
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("types", types));
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-Request-Id", xRequestId));
    }

    public Object body() {
        return null;
    }
}
