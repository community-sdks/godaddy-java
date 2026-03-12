package io.github.communitysdks.godaddy.dto.abuse.requests;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class GetTicketInfoRequest {
    public final String ticketId;

    public GetTicketInfoRequest() {
        this.ticketId = null;
    }

    public GetTicketInfoRequest(String ticketId) {
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
