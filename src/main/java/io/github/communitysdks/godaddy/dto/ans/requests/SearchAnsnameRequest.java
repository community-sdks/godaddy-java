package io.github.communitysdks.godaddy.dto.ans.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class SearchAnsnameRequest {
    public final String agentDisplayName;
    public final String version;
    public final String agentHost;
    public final String protocol;
    public final Long limit;
    public final Long offset;

    public SearchAnsnameRequest() {
        this.agentDisplayName = null;
        this.version = null;
        this.agentHost = null;
        this.protocol = null;
        this.limit = null;
        this.offset = null;
    }

    public SearchAnsnameRequest(String agentDisplayName, String version, String agentHost, String protocol, Long limit, Long offset) {
        this.agentDisplayName = agentDisplayName;
        this.version = version;
        this.agentHost = agentHost;
        this.protocol = protocol;
        this.limit = limit;
        this.offset = offset;
    }

    public List<Param> toPathParams() {
        return List.of();
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("agentDisplayName", agentDisplayName), new Param("version", version), new Param("agentHost", agentHost), new Param("protocol", protocol), new Param("limit", limit), new Param("offset", offset));
    }

    public List<Param> toHeaders() {
        return List.of();
    }

    public Object body() {
        return null;
    }
}
