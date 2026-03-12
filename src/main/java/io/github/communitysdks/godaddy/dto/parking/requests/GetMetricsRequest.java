package io.github.communitysdks.godaddy.dto.parking.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class GetMetricsRequest {
    public final String customerId;
    public final String periodStartPtz;
    public final String periodEndPtz;
    public final Long limit;
    public final Long offset;
    public final String xRequestId;

    public GetMetricsRequest() {
        this.customerId = null;
        this.periodStartPtz = null;
        this.periodEndPtz = null;
        this.limit = null;
        this.offset = null;
        this.xRequestId = null;
    }

    public GetMetricsRequest(String customerId, String periodStartPtz, String periodEndPtz, Long limit, Long offset, String xRequestId) {
        this.customerId = customerId;
        this.periodStartPtz = periodStartPtz;
        this.periodEndPtz = periodEndPtz;
        this.limit = limit;
        this.offset = offset;
        this.xRequestId = xRequestId;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("customerId", customerId));
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("periodStartPtz", periodStartPtz), new Param("periodEndPtz", periodEndPtz), new Param("limit", limit), new Param("offset", offset));
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-Request-Id", xRequestId));
    }

    public Object body() {
        return null;
    }
}
