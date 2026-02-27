package com.communitysdks.godaddy.services;

import com.communitysdks.godaddy.ApiClient;
import com.communitysdks.godaddy.Result;
import com.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class ParkingService extends AbstractService {
    public ParkingService(ApiClient client) {
        super(client, "https://api.ote-godaddy.com");
    }

    public Result getMetrics(Object customerId, Object periodStartPtz, Object periodEndPtz, Object limit, Object offset, Object xRequestId) {
        return call(
            "GET",
            "/v1/customers/{customerId}/parking/metrics",
            List.of(new Param("customerId", customerId)),
            List.of(new Param("periodStartPtz", periodStartPtz), new Param("periodEndPtz", periodEndPtz), new Param("limit", limit), new Param("offset", offset)),
            List.of(new Param("X-Request-Id", xRequestId)),
            null
        );
    }

    public Result getMetricsByDomain(Object customerId, Object startDate, Object endDate, Object domains, Object domainLike, Object portfolioId, Object limit, Object offset, Object xRequestId) {
        return call(
            "GET",
            "/v1/customers/{customerId}/parking/metricsByDomain",
            List.of(new Param("customerId", customerId)),
            List.of(new Param("startDate", startDate), new Param("endDate", endDate), new Param("domains", domains), new Param("domainLike", domainLike), new Param("portfolioId", portfolioId), new Param("limit", limit), new Param("offset", offset)),
            List.of(new Param("X-Request-Id", xRequestId)),
            null
        );
    }
}
