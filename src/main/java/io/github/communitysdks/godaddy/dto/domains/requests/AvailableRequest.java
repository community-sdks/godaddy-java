package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class AvailableRequest {
    public final String domain;
    public final String checkType;
    public final Boolean forTransfer;

    public AvailableRequest() {
        this.domain = null;
        this.checkType = null;
        this.forTransfer = null;
    }

    public AvailableRequest(String domain, String checkType, Boolean forTransfer) {
        this.domain = domain;
        this.checkType = checkType;
        this.forTransfer = forTransfer;
    }

    public List<Param> toPathParams() {
        return List.of();
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("domain", domain), new Param("checkType", checkType), new Param("forTransfer", forTransfer));
    }

    public List<Param> toHeaders() {
        return List.of();
    }

    public Object body() {
        return null;
    }
}
