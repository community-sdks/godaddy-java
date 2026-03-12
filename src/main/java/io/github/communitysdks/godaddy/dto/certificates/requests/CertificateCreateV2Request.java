package io.github.communitysdks.godaddy.dto.certificates.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;
import java.util.Map;

public final class CertificateCreateV2Request {
    public final String xMarketId;
    public final Map<String, Object> subscriptionCertificateCreate;

    public CertificateCreateV2Request() {
        this.xMarketId = null;
        this.subscriptionCertificateCreate = null;
    }

    public CertificateCreateV2Request(String xMarketId, Map<String, Object> subscriptionCertificateCreate) {
        this.xMarketId = xMarketId;
        this.subscriptionCertificateCreate = subscriptionCertificateCreate;
    }

    public List<Param> toPathParams() {
        return List.of();
    }

    public List<Param> toQueryParams() {
        return List.of();
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-Market-Id", xMarketId));
    }

    public Object body() {
        return subscriptionCertificateCreate;
    }
}
