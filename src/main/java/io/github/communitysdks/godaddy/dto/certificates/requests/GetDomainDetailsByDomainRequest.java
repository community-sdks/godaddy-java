package io.github.communitysdks.godaddy.dto.certificates.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class GetDomainDetailsByDomainRequest {
    public final String customerId;
    public final String certificateId;
    public final String domain;

    public GetDomainDetailsByDomainRequest() {
        this.customerId = null;
        this.certificateId = null;
        this.domain = null;
    }

    public GetDomainDetailsByDomainRequest(String customerId, String certificateId, String domain) {
        this.customerId = customerId;
        this.certificateId = certificateId;
        this.domain = domain;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("customerId", customerId), new Param("certificateId", certificateId), new Param("domain", domain));
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
