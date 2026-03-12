package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class SuggestRequest {
    public final String xShopperId;
    public final String query;
    public final String country;
    public final String city;
    public final List<String> sources;
    public final List<String> tlds;
    public final Long lengthMax;
    public final Long lengthMin;
    public final Long limit;
    public final Long waitMs;

    public SuggestRequest() {
        this.xShopperId = null;
        this.query = null;
        this.country = null;
        this.city = null;
        this.sources = null;
        this.tlds = null;
        this.lengthMax = null;
        this.lengthMin = null;
        this.limit = null;
        this.waitMs = null;
    }

    public SuggestRequest(String xShopperId, String query, String country, String city, List<String> sources, List<String> tlds, Long lengthMax, Long lengthMin, Long limit, Long waitMs) {
        this.xShopperId = xShopperId;
        this.query = query;
        this.country = country;
        this.city = city;
        this.sources = sources;
        this.tlds = tlds;
        this.lengthMax = lengthMax;
        this.lengthMin = lengthMin;
        this.limit = limit;
        this.waitMs = waitMs;
    }

    public List<Param> toPathParams() {
        return List.of();
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("query", query), new Param("country", country), new Param("city", city), new Param("sources", sources), new Param("tlds", tlds), new Param("lengthMax", lengthMax), new Param("lengthMin", lengthMin), new Param("limit", limit), new Param("waitMs", waitMs));
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-Shopper-Id", xShopperId));
    }

    public Object body() {
        return null;
    }
}
