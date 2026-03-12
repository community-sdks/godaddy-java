package io.github.communitysdks.godaddy.dto.domains.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class GetAgreementRequest {
    public final String xMarketId;
    public final List<String> tlds;
    public final Boolean privacy;
    public final Boolean forTransfer;

    public GetAgreementRequest() {
        this.xMarketId = null;
        this.tlds = null;
        this.privacy = null;
        this.forTransfer = null;
    }

    public GetAgreementRequest(String xMarketId, List<String> tlds, Boolean privacy, Boolean forTransfer) {
        this.xMarketId = xMarketId;
        this.tlds = tlds;
        this.privacy = privacy;
        this.forTransfer = forTransfer;
    }

    public List<Param> toPathParams() {
        return List.of();
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("tlds", tlds), new Param("privacy", privacy), new Param("forTransfer", forTransfer));
    }

    public List<Param> toHeaders() {
        return List.of(new Param("X-Market-Id", xMarketId));
    }

    public Object body() {
        return null;
    }
}
