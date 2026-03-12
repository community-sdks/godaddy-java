package io.github.communitysdks.godaddy.dto.certificates.responses;

import io.github.communitysdks.godaddy.runtime.JsonCodec;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public final class GetDomainDetailsByDomainResponse {
    public Object raw;
    public Map<String, Object> object = new LinkedHashMap<>();
    public List<Object> items = new ArrayList<>();
    public String code;
    public String message;
    public String domain;
    public Long domainEntityId;
    public String dceToken;
    public String status;
    public String createdAt;
    public String modifiedAt;
    public String type;
    public String usage;
    public Map<String, Object> certificateAuthorityAuthorization;

    public static GetDomainDetailsByDomainResponse fromMixed(Object data) {
        GetDomainDetailsByDomainResponse response = new GetDomainDetailsByDomainResponse();
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
            response.domain = ((map.get("domain") instanceof String) ? (String) map.get("domain") : null);
            response.domainEntityId = ((map.get("domainEntityId") instanceof Number) ? ((Number) map.get("domainEntityId")).longValue() : null);
            response.dceToken = ((map.get("dceToken") instanceof String) ? (String) map.get("dceToken") : null);
            response.status = ((map.get("status") instanceof String) ? (String) map.get("status") : null);
            response.createdAt = ((map.get("createdAt") instanceof String) ? (String) map.get("createdAt") : null);
            response.modifiedAt = ((map.get("modifiedAt") instanceof String) ? (String) map.get("modifiedAt") : null);
            response.type = ((map.get("type") instanceof String) ? (String) map.get("type") : null);
            response.usage = ((map.get("usage") instanceof String) ? (String) map.get("usage") : null);
            response.certificateAuthorityAuthorization = ((map.get("certificateAuthorityAuthorization") instanceof Map<?, ?>) ? (Map<String, Object>) map.get("certificateAuthorityAuthorization") : null);
            return response;
        }

        if (value instanceof List<?> list) {
            response.items = (List<Object>) list;

            return response;
        }

        return response;
    }
}
