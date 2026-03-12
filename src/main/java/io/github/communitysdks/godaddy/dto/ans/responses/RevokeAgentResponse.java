package io.github.communitysdks.godaddy.dto.ans.responses;

import io.github.communitysdks.godaddy.runtime.JsonCodec;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public final class RevokeAgentResponse {
    public Object raw;
    public Map<String, Object> object = new LinkedHashMap<>();
    public List<Object> items = new ArrayList<>();
    public String code;
    public String message;
    public String agentId;
    public String ansName;
    public String status;
    public String revokedAt;
    public String reason;
    public List<Map<String, Object>> links;
    public List<Map<String, Object>> dnsRecordsToRemove;

    public static RevokeAgentResponse fromMixed(Object data) {
        RevokeAgentResponse response = new RevokeAgentResponse();
        response.raw = data;

        Object value = data;
        if (value instanceof String str) value = JsonCodec.parse(str);

        if (value instanceof Map<?, ?> mapAny) {
            Map<String, Object> map = (Map<String, Object>) mapAny;
            response.object = map;
            Object itemsValue = map.get("items");
            if (itemsValue instanceof List<?> list) response.items = (List<Object>) list;
            Object codeValue = map.get("code");
            if (codeValue instanceof String s) response.code = s;
            Object messageValue = map.get("message");
            if (messageValue instanceof String s) response.message = s;
            response.agentId = ((map.get("agentId") instanceof String) ? (String) map.get("agentId") : null);
            response.ansName = ((map.get("ansName") instanceof String) ? (String) map.get("ansName") : null);
            response.status = ((map.get("status") instanceof String) ? (String) map.get("status") : null);
            response.revokedAt = ((map.get("revokedAt") instanceof String) ? (String) map.get("revokedAt") : null);
            response.reason = ((map.get("reason") instanceof String) ? (String) map.get("reason") : null);
            response.links = ((map.get("links") instanceof List<?>) ? (List<Map<String, Object>>) map.get("links") : null);
            response.dnsRecordsToRemove = ((map.get("dnsRecordsToRemove") instanceof List<?>) ? (List<Map<String, Object>>) map.get("dnsRecordsToRemove") : null);
            return response;
        }

        if (value instanceof List<?> list) {
            response.items = (List<Object>) list;

            return response;
        }

        return response;
    }
}
