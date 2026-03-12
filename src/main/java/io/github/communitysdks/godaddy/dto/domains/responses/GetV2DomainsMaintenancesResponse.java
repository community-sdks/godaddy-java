package io.github.communitysdks.godaddy.dto.domains.responses;

import io.github.communitysdks.godaddy.runtime.JsonCodec;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public final class GetV2DomainsMaintenancesResponse {
    public Object raw;
    public Map<String, Object> object = new LinkedHashMap<>();
    public List<Object> items = new ArrayList<>();
    public String code;
    public String message;
    public String createdAt;
    public String endsAt;
    public String environment;
    public String maintenanceId;
    public String modifiedAt;
    public String reason;
    public String startsAt;
    public String status;
    public String summary;
    public List<String> tlds;
    public String type;

    public static GetV2DomainsMaintenancesResponse fromMixed(Object data) {
        GetV2DomainsMaintenancesResponse response = new GetV2DomainsMaintenancesResponse();
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
            response.createdAt = ((map.get("createdAt") instanceof String) ? (String) map.get("createdAt") : null);
            response.endsAt = ((map.get("endsAt") instanceof String) ? (String) map.get("endsAt") : null);
            response.environment = ((map.get("environment") instanceof String) ? (String) map.get("environment") : null);
            response.maintenanceId = ((map.get("maintenanceId") instanceof String) ? (String) map.get("maintenanceId") : null);
            response.modifiedAt = ((map.get("modifiedAt") instanceof String) ? (String) map.get("modifiedAt") : null);
            response.reason = ((map.get("reason") instanceof String) ? (String) map.get("reason") : null);
            response.startsAt = ((map.get("startsAt") instanceof String) ? (String) map.get("startsAt") : null);
            response.status = ((map.get("status") instanceof String) ? (String) map.get("status") : null);
            response.summary = ((map.get("summary") instanceof String) ? (String) map.get("summary") : null);
            response.tlds = ((map.get("tlds") instanceof List<?>) ? (List<String>) map.get("tlds") : null);
            response.type = ((map.get("type") instanceof String) ? (String) map.get("type") : null);
            return response;
        }

        if (value instanceof List<?> list) {
            response.items = (List<Object>) list;

            return response;
        }

        return response;
    }
}
