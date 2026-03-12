package io.github.communitysdks.godaddy.dto.domains.responses;

import io.github.communitysdks.godaddy.runtime.JsonCodec;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public final class GetV2DomainsUsageYyyymmResponse {
    public Object raw;
    public Map<String, Object> object = new LinkedHashMap<>();
    public List<Object> items = new ArrayList<>();
    public String code;
    public String message;
    public List<Map<String, Object>> details;
    public Long quota;
    public Long total;
    public String yyyymm;

    public static GetV2DomainsUsageYyyymmResponse fromMixed(Object data) {
        GetV2DomainsUsageYyyymmResponse response = new GetV2DomainsUsageYyyymmResponse();
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
            response.details = ((map.get("details") instanceof List<?>) ? (List<Map<String, Object>>) map.get("details") : null);
            response.quota = ((map.get("quota") instanceof Number) ? ((Number) map.get("quota")).longValue() : null);
            response.total = ((map.get("total") instanceof Number) ? ((Number) map.get("total")).longValue() : null);
            response.yyyymm = ((map.get("yyyymm") instanceof String) ? (String) map.get("yyyymm") : null);
            return response;
        }

        if (value instanceof List<?> list) {
            response.items = (List<Object>) list;

            return response;
        }

        return response;
    }
}
