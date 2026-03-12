package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class DomainsForwardsGetRequest {
    public final String customerId;
    public final String fqdn;
    public final Boolean includeSubs;

    public DomainsForwardsGetRequest() {
        this.customerId = null;
        this.fqdn = null;
        this.includeSubs = null;
    }

    public DomainsForwardsGetRequest(String customerId, String fqdn, Boolean includeSubs) {
        this.customerId = customerId;
        this.fqdn = fqdn;
        this.includeSubs = includeSubs;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("customerId", customerId), new Param("fqdn", fqdn));
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("includeSubs", includeSubs));
    }

    public List<Param> toHeaders() {
        return List.of();
    }

    public Object body() {
        return null;
    }
}
