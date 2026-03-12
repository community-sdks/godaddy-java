package io.github.communitysdks.godaddy.dto.abuse.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class GetTicketsV2Request {
    public final String type;
    public final Boolean closed;
    public final String sourceDomainOrIp;
    public final String target;
    public final String createdStart;
    public final String createdEnd;
    public final Long limit;
    public final Long offset;

    public GetTicketsV2Request() {
        this.type = null;
        this.closed = null;
        this.sourceDomainOrIp = null;
        this.target = null;
        this.createdStart = null;
        this.createdEnd = null;
        this.limit = null;
        this.offset = null;
    }

    public GetTicketsV2Request(String type, Boolean closed, String sourceDomainOrIp, String target, String createdStart, String createdEnd, Long limit, Long offset) {
        this.type = type;
        this.closed = closed;
        this.sourceDomainOrIp = sourceDomainOrIp;
        this.target = target;
        this.createdStart = createdStart;
        this.createdEnd = createdEnd;
        this.limit = limit;
        this.offset = offset;
    }

    public List<Param> toPathParams() {
        return List.of();
    }

    public List<Param> toQueryParams() {
        return List.of(new Param("type", type), new Param("closed", closed), new Param("sourceDomainOrIp", sourceDomainOrIp), new Param("target", target), new Param("createdStart", createdStart), new Param("createdEnd", createdEnd), new Param("limit", limit), new Param("offset", offset));
    }

    public List<Param> toHeaders() {
        return List.of();
    }

    public Object body() {
        return null;
    }
}
