package io.github.communitysdks.godaddy.dto.parking.responses;

import io.github.communitysdks.godaddy.runtime.JsonCodec;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public final class GetMetricsByDomainResponse {
    public Object raw;
    public Map<String, Object> object = new LinkedHashMap<>();
    public List<Object> items = new ArrayList<>();
    public String code;
    public String message;
    public String currencyId;
    public List<Map<String, Object>> metrics;
    public Map<String, Object> pagination;
    public String startDate;
    public String endDate;

    public static GetMetricsByDomainResponse fromMixed(Object data) {
        GetMetricsByDomainResponse response = new GetMetricsByDomainResponse();
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
            response.currencyId = ((map.get("currencyId") instanceof String) ? (String) map.get("currencyId") : null);
            response.metrics = ((map.get("metrics") instanceof List<?>) ? (List<Map<String, Object>>) map.get("metrics") : null);
            response.pagination = ((map.get("pagination") instanceof Map<?, ?>) ? (Map<String, Object>) map.get("pagination") : null);
            response.startDate = ((map.get("startDate") instanceof String) ? (String) map.get("startDate") : null);
            response.endDate = ((map.get("endDate") instanceof String) ? (String) map.get("endDate") : null);
            return response;
        }

        if (value instanceof List<?> list) {
            response.items = (List<Object>) list;

            return response;
        }

        return response;
    }
}
