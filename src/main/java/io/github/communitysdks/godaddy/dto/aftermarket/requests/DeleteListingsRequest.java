package io.github.communitysdks.godaddy.dto.aftermarket.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class DeleteListingsRequest {
    public final List<String> domains;

    public DeleteListingsRequest() {
        this.domains = null;
    }

    public DeleteListingsRequest(List<String> domains) {
        this.domains = domains;
    }

    public List<Param> toPathParams() {
        return List.of();
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("domains", domains));
    }

    public List<Param> toHeaders() {
        return List.of();
    }

    public Object body() {
        return null;
    }
}
