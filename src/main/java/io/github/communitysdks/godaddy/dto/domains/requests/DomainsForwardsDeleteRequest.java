package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class DomainsForwardsDeleteRequest {
    public final String customerId;
    public final String fqdn;

    public DomainsForwardsDeleteRequest() {
        this.customerId = null;
        this.fqdn = null;
    }

    public DomainsForwardsDeleteRequest(String customerId, String fqdn) {
        this.customerId = customerId;
        this.fqdn = fqdn;
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
        return null;
    }
}
