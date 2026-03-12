package io.github.communitysdks.godaddy.dto.shoppers.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class DeleteRequest {
    public final String shopperId;
    public final String auditClientIp;

    public DeleteRequest() {
        this.shopperId = null;
        this.auditClientIp = null;
    }

    public DeleteRequest(String shopperId, String auditClientIp) {
        this.shopperId = shopperId;
        this.auditClientIp = auditClientIp;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("shopperId", shopperId));
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("auditClientIp", auditClientIp));
    }

    public List<Param> toHeaders() {
        return List.of();
    }

    public Object body() {
        return null;
    }
}
