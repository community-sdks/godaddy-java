package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class GetV2CustomersCustomerIdDomainsNotificationsSchemasTypeRequest {
    public final String xRequestId;
    public final String customerId;
    public final String type;

    public GetV2CustomersCustomerIdDomainsNotificationsSchemasTypeRequest() {
        this.xRequestId = null;
        this.customerId = null;
        this.type = null;
    }

    public GetV2CustomersCustomerIdDomainsNotificationsSchemasTypeRequest(String xRequestId, String customerId, String type) {
        this.xRequestId = xRequestId;
        this.customerId = customerId;
        this.type = type;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("customerId", customerId), new Param("type", type));
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
