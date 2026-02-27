package com.communitysdks.godaddy.services;

import com.communitysdks.godaddy.ApiClient;
import com.communitysdks.godaddy.Result;
import com.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class AbuseService extends AbstractService {
    public AbuseService(ApiClient client) {
        super(client, "https://api.ote-godaddy.com");
    }

    public Result getTickets(Object type, Object closed, Object sourceDomainOrIp, Object target, Object createdStart, Object createdEnd, Object limit, Object offset) {
        return call(
            "GET",
            "/v1/abuse/tickets",
            List.of(),
            List.of(new Param("type", type), new Param("closed", closed), new Param("sourceDomainOrIp", sourceDomainOrIp), new Param("target", target), new Param("createdStart", createdStart), new Param("createdEnd", createdEnd), new Param("limit", limit), new Param("offset", offset)),
            List.of(),
            null
        );
    }

    public Result createTicket(Object body) {
        return call(
            "POST",
            "/v1/abuse/tickets",
            List.of(),
            List.of(),
            List.of(),
            body
        );
    }

    public Result getTicketInfo(Object ticketId) {
        return call(
            "GET",
            "/v1/abuse/tickets/{ticketId}",
            List.of(new Param("ticketId", ticketId)),
            List.of(),
            List.of(),
            null
        );
    }

    public Result getTicketsV2(Object type, Object closed, Object sourceDomainOrIp, Object target, Object createdStart, Object createdEnd, Object limit, Object offset) {
        return call(
            "GET",
            "/v2/abuse/tickets",
            List.of(),
            List.of(new Param("type", type), new Param("closed", closed), new Param("sourceDomainOrIp", sourceDomainOrIp), new Param("target", target), new Param("createdStart", createdStart), new Param("createdEnd", createdEnd), new Param("limit", limit), new Param("offset", offset)),
            List.of(),
            null
        );
    }

    public Result createTicketV2(Object body) {
        return call(
            "POST",
            "/v2/abuse/tickets",
            List.of(),
            List.of(),
            List.of(),
            body
        );
    }

    public Result getTicketInfoV2(Object ticketId) {
        return call(
            "GET",
            "/v2/abuse/tickets/{ticketId}",
            List.of(new Param("ticketId", ticketId)),
            List.of(),
            List.of(),
            null
        );
    }
}
