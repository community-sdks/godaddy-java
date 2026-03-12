package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;
import java.util.Map;

public final class PostV2CustomersCustomerIdDomainsRegisterValidateRequest {
    public final String xRequestId;
    public final String customerId;
    public final Map<String, Object> body;

    public PostV2CustomersCustomerIdDomainsRegisterValidateRequest() {
        this.xRequestId = null;
        this.customerId = null;
        this.body = null;
    }

    public PostV2CustomersCustomerIdDomainsRegisterValidateRequest(String xRequestId, String customerId, Map<String, Object> body) {
        this.xRequestId = xRequestId;
        this.customerId = customerId;
        this.body = body;
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
        return body;
    }
}
