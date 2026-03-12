package io.github.communitysdks.godaddy.dto.aftermarket.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class GetListingsRequest {
    public final String customerId;
    public final String domains;
    public final String listingStatus;
    public final String transferBefore;
    public final String transferAfter;
    public final Long limit;
    public final Long offset;

    public GetListingsRequest() {
        this.customerId = null;
        this.domains = null;
        this.listingStatus = null;
        this.transferBefore = null;
        this.transferAfter = null;
        this.limit = null;
        this.offset = null;
    }

    public GetListingsRequest(String customerId, String domains, String listingStatus, String transferBefore, String transferAfter, Long limit, Long offset) {
        this.customerId = customerId;
        this.domains = domains;
        this.listingStatus = listingStatus;
        this.transferBefore = transferBefore;
        this.transferAfter = transferAfter;
        this.limit = limit;
        this.offset = offset;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("customerId", customerId));
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("domains", domains), new Param("listingStatus", listingStatus), new Param("transferBefore", transferBefore), new Param("transferAfter", transferAfter), new Param("limit", limit), new Param("offset", offset));
    }

    public List<Param> toHeaders() {
        return List.of();
    }

    public Object body() {
        return null;
    }
}
