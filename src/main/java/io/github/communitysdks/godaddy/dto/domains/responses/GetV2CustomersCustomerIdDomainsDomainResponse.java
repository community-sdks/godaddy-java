package io.github.communitysdks.godaddy.dto.domains.responses;

import io.github.communitysdks.godaddy.runtime.JsonCodec;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public final class GetV2CustomersCustomerIdDomainsDomainResponse {
    public Object raw;
    public Map<String, Object> object = new LinkedHashMap<>();
    public List<Object> items = new ArrayList<>();
    public String code;
    public String message;
    public String domainId;
    public String domain;
    public String subaccountId;
    public String status;
    public String expiresAt;
    public Boolean expirationProtected;
    public Boolean holdRegistrar;
    public Boolean locked;
    public Boolean privacy;
    public String registrarCreatedAt;
    public Boolean renewAuto;
    public String renewDeadline;
    public Boolean transferProtected;
    public String createdAt;
    public String deletedAt;
    public String modifiedAt;
    public String transferAwayEligibleAt;
    public String authCode;
    public List<String> nameServers;
    public List<String> hostnames;
    public Map<String, Object> renewal;
    public Map<String, Object> verifications;
    public Map<String, Object> contacts;
    public List<Map<String, Object>> actions;
    public List<Map<String, Object>> dnssecRecords;
    public List<String> registryStatusCodes;

    public static GetV2CustomersCustomerIdDomainsDomainResponse fromMixed(Object data) {
        GetV2CustomersCustomerIdDomainsDomainResponse response = new GetV2CustomersCustomerIdDomainsDomainResponse();
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
            response.domainId = ((map.get("domainId") instanceof String) ? (String) map.get("domainId") : null);
            response.domain = ((map.get("domain") instanceof String) ? (String) map.get("domain") : null);
            response.subaccountId = ((map.get("subaccountId") instanceof String) ? (String) map.get("subaccountId") : null);
            response.status = ((map.get("status") instanceof String) ? (String) map.get("status") : null);
            response.expiresAt = ((map.get("expiresAt") instanceof String) ? (String) map.get("expiresAt") : null);
            response.expirationProtected = ((map.get("expirationProtected") instanceof Boolean) ? (Boolean) map.get("expirationProtected") : null);
            response.holdRegistrar = ((map.get("holdRegistrar") instanceof Boolean) ? (Boolean) map.get("holdRegistrar") : null);
            response.locked = ((map.get("locked") instanceof Boolean) ? (Boolean) map.get("locked") : null);
            response.privacy = ((map.get("privacy") instanceof Boolean) ? (Boolean) map.get("privacy") : null);
            response.registrarCreatedAt = ((map.get("registrarCreatedAt") instanceof String) ? (String) map.get("registrarCreatedAt") : null);
            response.renewAuto = ((map.get("renewAuto") instanceof Boolean) ? (Boolean) map.get("renewAuto") : null);
            response.renewDeadline = ((map.get("renewDeadline") instanceof String) ? (String) map.get("renewDeadline") : null);
            response.transferProtected = ((map.get("transferProtected") instanceof Boolean) ? (Boolean) map.get("transferProtected") : null);
            response.createdAt = ((map.get("createdAt") instanceof String) ? (String) map.get("createdAt") : null);
            response.deletedAt = ((map.get("deletedAt") instanceof String) ? (String) map.get("deletedAt") : null);
            response.modifiedAt = ((map.get("modifiedAt") instanceof String) ? (String) map.get("modifiedAt") : null);
            response.transferAwayEligibleAt = ((map.get("transferAwayEligibleAt") instanceof String) ? (String) map.get("transferAwayEligibleAt") : null);
            response.authCode = ((map.get("authCode") instanceof String) ? (String) map.get("authCode") : null);
            response.nameServers = ((map.get("nameServers") instanceof List<?>) ? (List<String>) map.get("nameServers") : null);
            response.hostnames = ((map.get("hostnames") instanceof List<?>) ? (List<String>) map.get("hostnames") : null);
            response.renewal = ((map.get("renewal") instanceof Map<?, ?>) ? (Map<String, Object>) map.get("renewal") : null);
            response.verifications = ((map.get("verifications") instanceof Map<?, ?>) ? (Map<String, Object>) map.get("verifications") : null);
            response.contacts = ((map.get("contacts") instanceof Map<?, ?>) ? (Map<String, Object>) map.get("contacts") : null);
            response.actions = ((map.get("actions") instanceof List<?>) ? (List<Map<String, Object>>) map.get("actions") : null);
            response.dnssecRecords = ((map.get("dnssecRecords") instanceof List<?>) ? (List<Map<String, Object>>) map.get("dnssecRecords") : null);
            response.registryStatusCodes = ((map.get("registryStatusCodes") instanceof List<?>) ? (List<String>) map.get("registryStatusCodes") : null);
            return response;
        }

        if (value instanceof List<?> list) {
            response.items = (List<Object>) list;

            return response;
        }

        return response;
    }
}
