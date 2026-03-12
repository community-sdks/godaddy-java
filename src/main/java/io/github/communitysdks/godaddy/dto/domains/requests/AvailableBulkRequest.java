package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class AvailableBulkRequest {
    public final List<String> domains;
    public final String checkType;

    public AvailableBulkRequest() {
        this.domains = null;
        this.checkType = null;
    }

    public AvailableBulkRequest(List<String> domains, String checkType) {
        this.domains = domains;
        this.checkType = checkType;
    }

    public List<Param> toPathParams() {
        return List.of();
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("checkType", checkType));
    }

    public List<Param> toHeaders() {
        return List.of();
    }

    public Object body() {
        return domains;
    }
}
