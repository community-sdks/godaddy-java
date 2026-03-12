package io.github.communitysdks.godaddy.dto.domains.responses;

import io.github.communitysdks.godaddy.runtime.JsonCodec;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public final class GetResponse {
    public Object raw;
    public Map<String, Object> object = new LinkedHashMap<>();
    public List<Object> items = new ArrayList<>();
    public String code;
    public String message;
    public String authCode;
    public Map<String, Object> contactAdmin;
    public Map<String, Object> contactBilling;
    public Map<String, Object> contactRegistrant;
    public Map<String, Object> contactTech;
    public String createdAt;
    public String deletedAt;
    public String transferAwayEligibleAt;
    public String domain;
    public Double domainId;
    public Boolean expirationProtected;
    public String expires;
    public Boolean exposeRegistrantOrganization;
    public Boolean exposeWhois;
    public Boolean holdRegistrar;
    public Boolean locked;
    public List<String> nameServers;
    public Boolean privacy;
    public String registrarCreatedAt;
    public Boolean renewAuto;
    public String renewDeadline;
    public String status;
    public String subaccountId;
    public Boolean transferProtected;
    public Map<String, Object> verifications;

    public static GetResponse fromMixed(Object data) {
        GetResponse response = new GetResponse();
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
            response.authCode = ((map.get("authCode") instanceof String) ? (String) map.get("authCode") : null);
            response.contactAdmin = ((map.get("contactAdmin") instanceof Map<?, ?>) ? (Map<String, Object>) map.get("contactAdmin") : null);
            response.contactBilling = ((map.get("contactBilling") instanceof Map<?, ?>) ? (Map<String, Object>) map.get("contactBilling") : null);
            response.contactRegistrant = ((map.get("contactRegistrant") instanceof Map<?, ?>) ? (Map<String, Object>) map.get("contactRegistrant") : null);
            response.contactTech = ((map.get("contactTech") instanceof Map<?, ?>) ? (Map<String, Object>) map.get("contactTech") : null);
            response.createdAt = ((map.get("createdAt") instanceof String) ? (String) map.get("createdAt") : null);
            response.deletedAt = ((map.get("deletedAt") instanceof String) ? (String) map.get("deletedAt") : null);
            response.transferAwayEligibleAt = ((map.get("transferAwayEligibleAt") instanceof String) ? (String) map.get("transferAwayEligibleAt") : null);
            response.domain = ((map.get("domain") instanceof String) ? (String) map.get("domain") : null);
            response.domainId = ((map.get("domainId") instanceof Number) ? ((Number) map.get("domainId")).doubleValue() : null);
            response.expirationProtected = ((map.get("expirationProtected") instanceof Boolean) ? (Boolean) map.get("expirationProtected") : null);
            response.expires = ((map.get("expires") instanceof String) ? (String) map.get("expires") : null);
            response.exposeRegistrantOrganization = ((map.get("exposeRegistrantOrganization") instanceof Boolean) ? (Boolean) map.get("exposeRegistrantOrganization") : null);
            response.exposeWhois = ((map.get("exposeWhois") instanceof Boolean) ? (Boolean) map.get("exposeWhois") : null);
            response.holdRegistrar = ((map.get("holdRegistrar") instanceof Boolean) ? (Boolean) map.get("holdRegistrar") : null);
            response.locked = ((map.get("locked") instanceof Boolean) ? (Boolean) map.get("locked") : null);
            response.nameServers = ((map.get("nameServers") instanceof List<?>) ? (List<String>) map.get("nameServers") : null);
            response.privacy = ((map.get("privacy") instanceof Boolean) ? (Boolean) map.get("privacy") : null);
            response.registrarCreatedAt = ((map.get("registrarCreatedAt") instanceof String) ? (String) map.get("registrarCreatedAt") : null);
            response.renewAuto = ((map.get("renewAuto") instanceof Boolean) ? (Boolean) map.get("renewAuto") : null);
            response.renewDeadline = ((map.get("renewDeadline") instanceof String) ? (String) map.get("renewDeadline") : null);
            response.status = ((map.get("status") instanceof String) ? (String) map.get("status") : null);
            response.subaccountId = ((map.get("subaccountId") instanceof String) ? (String) map.get("subaccountId") : null);
            response.transferProtected = ((map.get("transferProtected") instanceof Boolean) ? (Boolean) map.get("transferProtected") : null);
            response.verifications = ((map.get("verifications") instanceof Map<?, ?>) ? (Map<String, Object>) map.get("verifications") : null);
            return response;
        }

        if (value instanceof List<?> list) {
            response.items = (List<Object>) list;

            return response;
        }

        return response;
    }
}
