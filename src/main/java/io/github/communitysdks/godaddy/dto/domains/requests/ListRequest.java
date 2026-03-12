package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class ListRequest {
    public final String xShopperId;
    public final List<String> statuses;
    public final List<String> statusGroups;
    public final Long limit;
    public final String marker;
    public final List<String> includes;
    public final String modifiedDate;

    public ListRequest() {
        this.xShopperId = null;
        this.statuses = null;
        this.statusGroups = null;
        this.limit = null;
        this.marker = null;
        this.includes = null;
        this.modifiedDate = null;
    }

    public ListRequest(String xShopperId, List<String> statuses, List<String> statusGroups, Long limit, String marker, List<String> includes, String modifiedDate) {
        this.xShopperId = xShopperId;
        this.statuses = statuses;
        this.statusGroups = statusGroups;
        this.limit = limit;
        this.marker = marker;
        this.includes = includes;
        this.modifiedDate = modifiedDate;
    }

    public List<Param> toPathParams() {
        return List.of();
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("statuses", statuses), new Param("statusGroups", statusGroups), new Param("limit", limit), new Param("marker", marker), new Param("includes", includes), new Param("modifiedDate", modifiedDate));
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-Shopper-Id", xShopperId));
    }

    public Object body() {
        return null;
    }
}
