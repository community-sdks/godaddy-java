package io.github.communitysdks.godaddy.dto.orders.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class ListRequest {
    public final String periodStart;
    public final String periodEnd;
    public final String domain;
    public final Long productGroupId;
    public final Long paymentProfileId;
    public final String parentOrderId;
    public final Long offset;
    public final Long limit;
    public final String sort;
    public final String xShopperId;
    public final String xAppKey;

    public ListRequest() {
        this.periodStart = null;
        this.periodEnd = null;
        this.domain = null;
        this.productGroupId = null;
        this.paymentProfileId = null;
        this.parentOrderId = null;
        this.offset = null;
        this.limit = null;
        this.sort = null;
        this.xShopperId = null;
        this.xAppKey = null;
    }

    public ListRequest(String periodStart, String periodEnd, String domain, Long productGroupId, Long paymentProfileId, String parentOrderId, Long offset, Long limit, String sort, String xShopperId, String xAppKey) {
        this.periodStart = periodStart;
        this.periodEnd = periodEnd;
        this.domain = domain;
        this.productGroupId = productGroupId;
        this.paymentProfileId = paymentProfileId;
        this.parentOrderId = parentOrderId;
        this.offset = offset;
        this.limit = limit;
        this.sort = sort;
        this.xShopperId = xShopperId;
        this.xAppKey = xAppKey;
    }

    public List<Param> toPathParams() {
        return List.of();
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("periodStart", periodStart), new Param("periodEnd", periodEnd), new Param("domain", domain), new Param("productGroupId", productGroupId), new Param("paymentProfileId", paymentProfileId), new Param("parentOrderId", parentOrderId), new Param("offset", offset), new Param("limit", limit), new Param("sort", sort));
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-Shopper-Id", xShopperId), new Param("X-App-Key", xAppKey));
    }

    public Object body() {
        return null;
    }
}
