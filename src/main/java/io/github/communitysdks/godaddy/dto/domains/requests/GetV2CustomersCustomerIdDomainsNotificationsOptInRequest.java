package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class GetV2CustomersCustomerIdDomainsNotificationsOptInRequest {
    public final String xRequestId;
    public final String customerId;

    public GetV2CustomersCustomerIdDomainsNotificationsOptInRequest() {
        this.xRequestId = null;
        this.customerId = null;
    }

    public GetV2CustomersCustomerIdDomainsNotificationsOptInRequest(String xRequestId, String customerId) {
        this.xRequestId = xRequestId;
        this.customerId = customerId;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("customerId", customerId));
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
