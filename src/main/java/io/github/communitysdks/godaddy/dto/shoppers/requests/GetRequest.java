package io.github.communitysdks.godaddy.dto.shoppers.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class GetRequest {
    public final String shopperId;
    public final List<String> includes;

    public GetRequest() {
        this.shopperId = null;
        this.includes = null;
    }

    public GetRequest(String shopperId, List<String> includes) {
        this.shopperId = shopperId;
        this.includes = includes;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("shopperId", shopperId));
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("includes", includes));
    }

    public List<Param> toHeaders() {
        return List.of();
    }

    public Object body() {
        return null;
    }
}
