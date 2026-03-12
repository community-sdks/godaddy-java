package io.github.communitysdks.godaddy.dto.certificates.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class GetCustomerCertificatesByCustomerIdRequest {
    public final String customerId;
    public final Long offset;
    public final Long limit;

    public GetCustomerCertificatesByCustomerIdRequest() {
        this.customerId = null;
        this.offset = null;
        this.limit = null;
    }

    public GetCustomerCertificatesByCustomerIdRequest(String customerId, Long offset, Long limit) {
        this.customerId = customerId;
        this.offset = offset;
        this.limit = limit;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("customerId", customerId));
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("offset", offset), new Param("limit", limit));
    }

    public List<Param> toHeaders() {
        return List.of();
    }

    public Object body() {
        return null;
    }
}
