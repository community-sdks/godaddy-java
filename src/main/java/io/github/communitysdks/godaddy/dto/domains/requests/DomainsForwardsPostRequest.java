package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;
import java.util.Map;

public final class DomainsForwardsPostRequest {
    public final String customerId;
    public final String fqdn;
    public final Map<String, Object> body;

    public DomainsForwardsPostRequest() {
        this.customerId = null;
        this.fqdn = null;
        this.body = null;
    }

    public DomainsForwardsPostRequest(String customerId, String fqdn, Map<String, Object> body) {
        this.customerId = customerId;
        this.fqdn = fqdn;
        this.body = body;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("customerId", customerId), new Param("fqdn", fqdn));
    }

    public List<Param> toQueryParams() {
        return List.of();
    }

    public List<Param> toHeaders() {
        return List.of();
    }

    public Object body() {
        return body;
    }
}
