package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class CancelRequest {
    public final String domain;

    public CancelRequest() {
        this.domain = null;
    }

    public CancelRequest(String domain) {
        this.domain = domain;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("domain", domain));
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
