package io.github.communitysdks.godaddy.dto.certificates.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class GetAcmeExternalAccountBindingRequest {
    public final String customerId;

    public GetAcmeExternalAccountBindingRequest() {
        this.customerId = null;
    }

    public GetAcmeExternalAccountBindingRequest(String customerId) {
        this.customerId = customerId;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("customerId", customerId));
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
