package io.github.communitysdks.godaddy.dto.abuse.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class GetTicketInfoV2Request {
    public final String ticketId;

    public GetTicketInfoV2Request() {
        this.ticketId = null;
    }

    public GetTicketInfoV2Request(String ticketId) {
        this.ticketId = ticketId;
    }

    public List<Param> toPathParams() {
        return List.of(new Param("ticketId", ticketId));
    }

    public List<Param> toQueryParams() {
        return List.of();
    }

    public List<Param> toHeaders() {
        return List.of();
    }

    public Object body() {
        return null;
    }
}
