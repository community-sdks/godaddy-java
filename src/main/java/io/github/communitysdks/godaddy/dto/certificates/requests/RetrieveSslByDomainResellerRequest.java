package io.github.communitysdks.godaddy.dto.certificates.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class RetrieveSslByDomainResellerRequest {
    public final Long pageSize;
    public final Long page;
    public final String domain;
    public final String status;
    public final String type;
    public final String validation;

    public RetrieveSslByDomainResellerRequest() {
        this.pageSize = null;
        this.page = null;
        this.domain = null;
        this.status = null;
        this.type = null;
        this.validation = null;
    }

    public RetrieveSslByDomainResellerRequest(Long pageSize, Long page, String domain, String status, String type, String validation) {
        this.pageSize = pageSize;
        this.page = page;
        this.domain = domain;
        this.status = status;
        this.type = type;
        this.validation = validation;
    }

    public List<Param> toPathParams() {
        return List.of();
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("pageSize", pageSize), new Param("page", page), new Param("domain", domain), new Param("status", status), new Param("type", type), new Param("validation", validation));
    }

    public List<Param> toHeaders() {
        return List.of();
    }

    public Object body() {
        return null;
    }
}
