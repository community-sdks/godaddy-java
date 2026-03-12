package io.github.communitysdks.godaddy.dto.parking.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class GetMetricsByDomainRequest {
    public final String customerId;
    public final String startDate;
    public final String endDate;
    public final String domains;
    public final String domainLike;
    public final String portfolioId;
    public final Long limit;
    public final Long offset;
    public final String xRequestId;

    public GetMetricsByDomainRequest() {
        this.customerId = null;
        this.startDate = null;
        this.endDate = null;
        this.domains = null;
        this.domainLike = null;
        this.portfolioId = null;
        this.limit = null;
        this.offset = null;
        this.xRequestId = null;
    }

    public GetMetricsByDomainRequest(String customerId, String startDate, String endDate, String domains, String domainLike, String portfolioId, Long limit, Long offset, String xRequestId) {
        this.customerId = customerId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.domains = domains;
        this.domainLike = domainLike;
        this.portfolioId = portfolioId;
        this.limit = limit;
        this.offset = offset;
        this.xRequestId = xRequestId;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("customerId", customerId));
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("startDate", startDate), new Param("endDate", endDate), new Param("domains", domains), new Param("domainLike", domainLike), new Param("portfolioId", portfolioId), new Param("limit", limit), new Param("offset", offset));
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-Request-Id", xRequestId));
    }

    public Object body() {
        return null;
    }
}
