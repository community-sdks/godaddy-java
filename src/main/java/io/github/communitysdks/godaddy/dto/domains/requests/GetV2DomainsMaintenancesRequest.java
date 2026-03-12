package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class GetV2DomainsMaintenancesRequest {
    public final String xRequestId;
    public final String status;
    public final String modifiedAtAfter;
    public final String startsAtAfter;
    public final Long limit;

    public GetV2DomainsMaintenancesRequest() {
        this.xRequestId = null;
        this.status = null;
        this.modifiedAtAfter = null;
        this.startsAtAfter = null;
        this.limit = null;
    }

    public GetV2DomainsMaintenancesRequest(String xRequestId, String status, String modifiedAtAfter, String startsAtAfter, Long limit) {
        this.xRequestId = xRequestId;
        this.status = status;
        this.modifiedAtAfter = modifiedAtAfter;
        this.startsAtAfter = startsAtAfter;
        this.limit = limit;
    }

    public List<Param> toPathParams() {
        return List.of();
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("status", status), new Param("modifiedAtAfter", modifiedAtAfter), new Param("startsAtAfter", startsAtAfter), new Param("limit", limit));
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-Request-Id", xRequestId));
    }

    public Object body() {
        return null;
    }
}
