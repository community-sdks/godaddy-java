package io.github.communitysdks.godaddy.dto.abuse.responses;

import io.github.communitysdks.godaddy.runtime.JsonCodec;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public final class GetTicketInfoV2Response {
    public Object raw;
    public Map<String, Object> object = new LinkedHashMap<>();
    public List<Object> items = new ArrayList<>();
    public String code;
    public String message;
    public Boolean closed;
    public String closedAt;
    public String createdAt;
    public String domainIp;
    public String reporter;
    public String source;
    public String target;
    public String ticketId;
    public String type;
    public String closeReason;

    public static GetTicketInfoV2Response fromMixed(Object data) {
        GetTicketInfoV2Response response = new GetTicketInfoV2Response();
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
            response.closed = ((map.get("closed") instanceof Boolean) ? (Boolean) map.get("closed") : null);
            response.closedAt = ((map.get("closedAt") instanceof String) ? (String) map.get("closedAt") : null);
            response.createdAt = ((map.get("createdAt") instanceof String) ? (String) map.get("createdAt") : null);
            response.domainIp = ((map.get("domainIp") instanceof String) ? (String) map.get("domainIp") : null);
            response.reporter = ((map.get("reporter") instanceof String) ? (String) map.get("reporter") : null);
            response.source = ((map.get("source") instanceof String) ? (String) map.get("source") : null);
            response.target = ((map.get("target") instanceof String) ? (String) map.get("target") : null);
            response.ticketId = ((map.get("ticketId") instanceof String) ? (String) map.get("ticketId") : null);
            response.type = ((map.get("type") instanceof String) ? (String) map.get("type") : null);
            response.closeReason = ((map.get("closeReason") instanceof String) ? (String) map.get("closeReason") : null);
            return response;
        }

        if (value instanceof List<?> list) {
            response.items = (List<Object>) list;

            return response;
        }

        return response;
    }
}
