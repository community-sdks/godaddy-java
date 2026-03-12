package io.github.communitysdks.godaddy.dto.ans.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class GetAgentRequest {
    public final String agentId;

    public GetAgentRequest() {
        this.agentId = null;
    }

    public GetAgentRequest(String agentId) {
        this.agentId = agentId;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("agentId", agentId));
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
