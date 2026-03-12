package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class SchemaRequest {
    public final String tld;

    public SchemaRequest() {
        this.tld = null;
    }

    public SchemaRequest(String tld) {
        this.tld = tld;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("tld", tld));
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
