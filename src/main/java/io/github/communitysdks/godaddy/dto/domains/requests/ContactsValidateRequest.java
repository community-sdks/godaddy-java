package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;
import java.util.Map;

public final class ContactsValidateRequest {
    public final Long xPrivateLabelId;
    public final String marketId;
    public final Map<String, Object> body;

    public ContactsValidateRequest() {
        this.xPrivateLabelId = null;
        this.marketId = null;
        this.body = null;
    }

    public ContactsValidateRequest(Long xPrivateLabelId, String marketId, Map<String, Object> body) {
        this.xPrivateLabelId = xPrivateLabelId;
        this.marketId = marketId;
        this.body = body;
    }

    public List<Param> toPathParams() {
        return List.of();
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("marketId", marketId));
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-Private-Label-Id", xPrivateLabelId));
    }

    public Object body() {
        return body;
    }
}
