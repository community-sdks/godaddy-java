package io.github.communitysdks.godaddy.dto.ans.responses;

import io.github.communitysdks.godaddy.runtime.JsonCodec;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public final class GetAgentResponse {
    public Object raw;
    public Map<String, Object> object = new LinkedHashMap<>();
    public List<Object> items = new ArrayList<>();
    public String code;
    public String message;
    public String agentDescription;
    public String agentHost;
    public String agentId;
    public String agentDisplayName;
    public String agentStatus;
    public String ansName;
    public List<Map<String, Object>> endpoints;
    public String lastRenewalTimestamp;
    public List<Map<String, Object>> links;
    public String registrationTimestamp;
    public String version;
    public Map<String, Object> registrationPending;

    public static GetAgentResponse fromMixed(Object data) {
        GetAgentResponse response = new GetAgentResponse();
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
            response.agentDescription = ((map.get("agentDescription") instanceof String) ? (String) map.get("agentDescription") : null);
            response.agentHost = ((map.get("agentHost") instanceof String) ? (String) map.get("agentHost") : null);
            response.agentId = ((map.get("agentId") instanceof String) ? (String) map.get("agentId") : null);
            response.agentDisplayName = ((map.get("agentDisplayName") instanceof String) ? (String) map.get("agentDisplayName") : null);
            response.agentStatus = ((map.get("agentStatus") instanceof String) ? (String) map.get("agentStatus") : null);
            response.ansName = ((map.get("ansName") instanceof String) ? (String) map.get("ansName") : null);
            response.endpoints = ((map.get("endpoints") instanceof List<?>) ? (List<Map<String, Object>>) map.get("endpoints") : null);
            response.lastRenewalTimestamp = ((map.get("lastRenewalTimestamp") instanceof String) ? (String) map.get("lastRenewalTimestamp") : null);
            response.links = ((map.get("links") instanceof List<?>) ? (List<Map<String, Object>>) map.get("links") : null);
            response.registrationTimestamp = ((map.get("registrationTimestamp") instanceof String) ? (String) map.get("registrationTimestamp") : null);
            response.version = ((map.get("version") instanceof String) ? (String) map.get("version") : null);
            response.registrationPending = ((map.get("registrationPending") instanceof Map<?, ?>) ? (Map<String, Object>) map.get("registrationPending") : null);
            return response;
        }

        if (value instanceof List<?> list) {
            response.items = (List<Object>) list;

            return response;
        }

        return response;
    }
}
