package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class GetV2DomainsUsageYyyymmRequest {
    public final String xRequestId;
    public final String yyyymm;
    public final List<String> includes;

    public GetV2DomainsUsageYyyymmRequest() {
        this.xRequestId = null;
        this.yyyymm = null;
        this.includes = null;
    }

    public GetV2DomainsUsageYyyymmRequest(String xRequestId, String yyyymm, List<String> includes) {
        this.xRequestId = xRequestId;
        this.yyyymm = yyyymm;
        this.includes = includes;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("yyyymm", yyyymm));
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("includes", includes));
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-Request-Id", xRequestId));
    }

    public Object body() {
        return null;
    }
}
