package io.github.communitysdks.godaddy.dto.ans.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class GetAgentEventsRequest {
    public final String xRequestId;
    public final String providerId;
    public final String lastLogId;
    public final Long limit;

    public GetAgentEventsRequest() {
        this.xRequestId = null;
        this.providerId = null;
        this.lastLogId = null;
        this.limit = null;
    }

    public GetAgentEventsRequest(String xRequestId, String providerId, String lastLogId, Long limit) {
        this.xRequestId = xRequestId;
        this.providerId = providerId;
        this.lastLogId = lastLogId;
        this.limit = limit;
    }

    public List<Param> toPathParams() {
        return List.of();
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("providerId", providerId), new Param("lastLogId", lastLogId), new Param("limit", limit));
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-Request-Id", xRequestId));
    }

    public Object body() {
        return null;
    }
}
