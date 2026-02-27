package com.communitysdks.godaddy.services;

import com.communitysdks.godaddy.ApiClient;
import com.communitysdks.godaddy.Result;
import com.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class AnsService extends AbstractService {
    public AnsService(ApiClient client) {
        super(client, "https://api.ote-godaddy.com");
    }

    public Result searchAnsName(Object agentDisplayName, Object version, Object agentHost, Object protocol, Object limit, Object offset) {
        return call(
            "GET",
            "/v1/agents",
            List.of(),
            List.of(new Param("agentDisplayName", agentDisplayName), new Param("version", version), new Param("agentHost", agentHost), new Param("protocol", protocol), new Param("limit", limit), new Param("offset", offset)),
            List.of(),
            null
        );
    }

    public Result registerAgent(Object body) {
        return call(
            "POST",
            "/v1/agents/register",
            List.of(),
            List.of(),
            List.of(),
            body
        );
    }

    public Result resolveAnsName(Object body) {
        return call(
            "POST",
            "/v1/agents/resolution",
            List.of(),
            List.of(),
            List.of(),
            body
        );
    }

    public Result getAgent(Object agentId) {
        return call(
            "GET",
            "/v1/agents/{agentId}",
            List.of(new Param("agentId", agentId)),
            List.of(),
            List.of(),
            null
        );
    }

    public Result validateRegistration(Object agentId) {
        return call(
            "POST",
            "/v1/agents/{agentId}/verify-acme",
            List.of(new Param("agentId", agentId)),
            List.of(),
            List.of(),
            null
        );
    }

    public Result verifyDnsRecords(Object agentId) {
        return call(
            "POST",
            "/v1/agents/{agentId}/verify-dns",
            List.of(new Param("agentId", agentId)),
            List.of(),
            List.of(),
            null
        );
    }

    public Result getAgentIdentityCertificateByAgentId(Object agentId) {
        return call(
            "GET",
            "/v1/agents/{agentId}/certificates/identity",
            List.of(new Param("agentId", agentId)),
            List.of(),
            List.of(),
            null
        );
    }

    public Result submitAgentIdentityCsrByAgentId(Object agentId, Object body) {
        return call(
            "POST",
            "/v1/agents/{agentId}/certificates/identity",
            List.of(new Param("agentId", agentId)),
            List.of(),
            List.of(),
            body
        );
    }

    public Result getAgentServerCertificateByAgentId(Object agentId) {
        return call(
            "GET",
            "/v1/agents/{agentId}/certificates/server",
            List.of(new Param("agentId", agentId)),
            List.of(),
            List.of(),
            null
        );
    }

    public Result submitAgentServerCsrByAgentId(Object agentId, Object body) {
        return call(
            "POST",
            "/v1/agents/{agentId}/certificates/server",
            List.of(new Param("agentId", agentId)),
            List.of(),
            List.of(),
            body
        );
    }

    public Result getAgentCsrStatusByAgentId(Object agentId, Object csrId) {
        return call(
            "GET",
            "/v1/agents/{agentId}/csrs/{csrId}/status",
            List.of(new Param("agentId", agentId), new Param("csrId", csrId)),
            List.of(),
            List.of(),
            null
        );
    }

    public Result getAgentEvents(Object xRequestId, Object providerId, Object lastLogId, Object limit) {
        return call(
            "GET",
            "/v1/agents/events",
            List.of(),
            List.of(new Param("providerId", providerId), new Param("lastLogId", lastLogId), new Param("limit", limit)),
            List.of(new Param("X-Request-Id", xRequestId)),
            null
        );
    }
}
