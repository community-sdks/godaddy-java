package io.github.communitysdks.godaddy.dto.domains.responses;

import io.github.communitysdks.godaddy.runtime.JsonCodec;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public final class GetV2CustomersCustomerIdDomainsDomainChangeOfRegistrantResponse {
    public Object raw;
    public Map<String, Object> object = new LinkedHashMap<>();
    public List<Object> items = new ArrayList<>();
    public String code;
    public String message;
    public String createDate;
    public Map<String, Object> gainingContact;
    public Map<String, Object> losingContact;
    public Long otherDomainsAffected;
    public String shopperEmail;

    public static GetV2CustomersCustomerIdDomainsDomainChangeOfRegistrantResponse fromMixed(Object data) {
        GetV2CustomersCustomerIdDomainsDomainChangeOfRegistrantResponse response = new GetV2CustomersCustomerIdDomainsDomainChangeOfRegistrantResponse();
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
            response.createDate = ((map.get("createDate") instanceof String) ? (String) map.get("createDate") : null);
            response.gainingContact = ((map.get("gainingContact") instanceof Map<?, ?>) ? (Map<String, Object>) map.get("gainingContact") : null);
            response.losingContact = ((map.get("losingContact") instanceof Map<?, ?>) ? (Map<String, Object>) map.get("losingContact") : null);
            response.otherDomainsAffected = ((map.get("otherDomainsAffected") instanceof Number) ? ((Number) map.get("otherDomainsAffected")).longValue() : null);
            response.shopperEmail = ((map.get("shopperEmail") instanceof String) ? (String) map.get("shopperEmail") : null);
            return response;
        }

        if (value instanceof List<?> list) {
            response.items = (List<Object>) list;

            return response;
        }

        return response;
    }
}
