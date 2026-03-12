package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;
import java.util.Map;

public final class UpdateContactsRequest {
    public final String xShopperId;
    public final String domain;
    public final Map<String, Object> contacts;

    public UpdateContactsRequest() {
        this.xShopperId = null;
        this.domain = null;
        this.contacts = null;
    }

    public UpdateContactsRequest(String xShopperId, String domain, Map<String, Object> contacts) {
        this.xShopperId = xShopperId;
        this.domain = domain;
        this.contacts = contacts;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("domain", domain));
    }

    public List<Param> toQueryParams() {
        return List.of();
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-Shopper-Id", xShopperId));
    }

    public Object body() {
        return contacts;
    }
}
