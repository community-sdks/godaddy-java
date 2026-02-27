package com.communitysdks.godaddy.services;

import com.communitysdks.godaddy.ApiClient;
import com.communitysdks.godaddy.Result;
import com.communitysdks.godaddy.runtime.Param;
import java.util.List;

public final class DomainsService extends AbstractService {
    public DomainsService(ApiClient client) {
        super(client, "https://api.ote-godaddy.com");
    }

    public Result list(Object xShopperId, Object statuses, Object statusGroups, Object limit, Object marker, Object includes, Object modifiedDate) {
        return call(
            "GET",
            "/v1/domains",
            List.of(),
            List.of(new Param("statuses", statuses), new Param("statusGroups", statusGroups), new Param("limit", limit), new Param("marker", marker), new Param("includes", includes), new Param("modifiedDate", modifiedDate)),
            List.of(new Param("X-Shopper-Id", xShopperId)),
            null
        );
    }

    public Result getAgreement(Object tlds, Object privacy, Object xMarketId, Object forTransfer) {
        return call(
            "GET",
            "/v1/domains/agreements",
            List.of(),
            List.of(new Param("tlds", tlds), new Param("privacy", privacy), new Param("forTransfer", forTransfer)),
            List.of(new Param("X-Market-Id", xMarketId)),
            null
        );
    }

    public Result available(Object domain, Object checkType, Object forTransfer) {
        return call(
            "GET",
            "/v1/domains/available",
            List.of(),
            List.of(new Param("domain", domain), new Param("checkType", checkType), new Param("forTransfer", forTransfer)),
            List.of(),
            null
        );
    }

    public Result availableBulk(Object domains, Object checkType) {
        return call(
            "POST",
            "/v1/domains/available",
            List.of(),
            List.of(new Param("checkType", checkType)),
            List.of(),
            domains
        );
    }

    public Result contactsValidate(Object body, Object xPrivateLabelId, Object marketId) {
        return call(
            "POST",
            "/v1/domains/contacts/validate",
            List.of(),
            List.of(new Param("marketId", marketId)),
            List.of(new Param("X-Private-Label-Id", xPrivateLabelId)),
            body
        );
    }

    public Result purchase(Object body, Object xShopperId) {
        return call(
            "POST",
            "/v1/domains/purchase",
            List.of(),
            List.of(),
            List.of(new Param("X-Shopper-Id", xShopperId)),
            body
        );
    }

    public Result schema(Object tld) {
        return call(
            "GET",
            "/v1/domains/purchase/schema/{tld}",
            List.of(new Param("tld", tld)),
            List.of(),
            List.of(),
            null
        );
    }

    public Result validate(Object body) {
        return call(
            "POST",
            "/v1/domains/purchase/validate",
            List.of(),
            List.of(),
            List.of(),
            body
        );
    }

    public Result suggest(Object xShopperId, Object query, Object country, Object city, Object sources, Object tlds, Object lengthMax, Object lengthMin, Object limit, Object waitMs) {
        return call(
            "GET",
            "/v1/domains/suggest",
            List.of(),
            List.of(new Param("query", query), new Param("country", country), new Param("city", city), new Param("sources", sources), new Param("tlds", tlds), new Param("lengthMax", lengthMax), new Param("lengthMin", lengthMin), new Param("limit", limit), new Param("waitMs", waitMs)),
            List.of(new Param("X-Shopper-Id", xShopperId)),
            null
        );
    }

    public Result tlds() {
        return call(
            "GET",
            "/v1/domains/tlds",
            List.of(),
            List.of(),
            List.of(),
            null
        );
    }

    public Result cancel(Object domain) {
        return call(
            "DELETE",
            "/v1/domains/{domain}",
            List.of(new Param("domain", domain)),
            List.of(),
            List.of(),
            null
        );
    }

    public Result get(Object domain, Object xShopperId) {
        return call(
            "GET",
            "/v1/domains/{domain}",
            List.of(new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Shopper-Id", xShopperId)),
            null
        );
    }

    public Result update(Object domain, Object body, Object xShopperId) {
        return call(
            "PATCH",
            "/v1/domains/{domain}",
            List.of(new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Shopper-Id", xShopperId)),
            body
        );
    }

    public Result updateContacts(Object domain, Object contacts, Object xShopperId) {
        return call(
            "PATCH",
            "/v1/domains/{domain}/contacts",
            List.of(new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Shopper-Id", xShopperId)),
            contacts
        );
    }

    public Result cancelPrivacy(Object domain, Object xShopperId) {
        return call(
            "DELETE",
            "/v1/domains/{domain}/privacy",
            List.of(new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Shopper-Id", xShopperId)),
            null
        );
    }

    public Result purchasePrivacy(Object domain, Object body, Object xShopperId) {
        return call(
            "POST",
            "/v1/domains/{domain}/privacy/purchase",
            List.of(new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Shopper-Id", xShopperId)),
            body
        );
    }

    public Result recordAdd(Object domain, Object records, Object xShopperId) {
        return call(
            "PATCH",
            "/v1/domains/{domain}/records",
            List.of(new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Shopper-Id", xShopperId)),
            records
        );
    }

    public Result recordReplace(Object domain, Object records, Object xShopperId) {
        return call(
            "PUT",
            "/v1/domains/{domain}/records",
            List.of(new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Shopper-Id", xShopperId)),
            records
        );
    }

    public Result recordGet(Object domain, Object type, Object name, Object xShopperId, Object offset, Object limit) {
        return call(
            "GET",
            "/v1/domains/{domain}/records/{type}/{name}",
            List.of(new Param("domain", domain), new Param("type", type), new Param("name", name)),
            List.of(new Param("offset", offset), new Param("limit", limit)),
            List.of(new Param("X-Shopper-Id", xShopperId)),
            null
        );
    }

    public Result recordReplaceTypeName(Object domain, Object type, Object name, Object records, Object xShopperId) {
        return call(
            "PUT",
            "/v1/domains/{domain}/records/{type}/{name}",
            List.of(new Param("domain", domain), new Param("type", type), new Param("name", name)),
            List.of(),
            List.of(new Param("X-Shopper-Id", xShopperId)),
            records
        );
    }

    public Result recordDeleteTypeName(Object domain, Object type, Object name, Object xShopperId) {
        return call(
            "DELETE",
            "/v1/domains/{domain}/records/{type}/{name}",
            List.of(new Param("domain", domain), new Param("type", type), new Param("name", name)),
            List.of(),
            List.of(new Param("X-Shopper-Id", xShopperId)),
            null
        );
    }

    public Result recordReplaceType(Object domain, Object type, Object records, Object xShopperId) {
        return call(
            "PUT",
            "/v1/domains/{domain}/records/{type}",
            List.of(new Param("domain", domain), new Param("type", type)),
            List.of(),
            List.of(new Param("X-Shopper-Id", xShopperId)),
            records
        );
    }

    public Result renew(Object domain, Object xShopperId, Object body) {
        return call(
            "POST",
            "/v1/domains/{domain}/renew",
            List.of(new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Shopper-Id", xShopperId)),
            body
        );
    }

    public Result transferIn(Object domain, Object body, Object xShopperId) {
        return call(
            "POST",
            "/v1/domains/{domain}/transfer",
            List.of(new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Shopper-Id", xShopperId)),
            body
        );
    }

    public Result verifyEmail(Object domain, Object xShopperId) {
        return call(
            "POST",
            "/v1/domains/{domain}/verifyRegistrantEmail",
            List.of(new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Shopper-Id", xShopperId)),
            null
        );
    }

    public Result getV2CustomersCustomerIdDomainsDomain(Object customerId, Object domain, Object xRequestId, Object includes) {
        return call(
            "GET",
            "/v2/customers/{customerId}/domains/{domain}",
            List.of(new Param("customerId", customerId), new Param("domain", domain)),
            List.of(new Param("includes", includes)),
            List.of(new Param("X-Request-Id", xRequestId)),
            null
        );
    }

    public Result deleteV2CustomersCustomerIdDomainsDomainChangeOfRegistrant(Object customerId, Object domain, Object xRequestId) {
        return call(
            "DELETE",
            "/v2/customers/{customerId}/domains/{domain}/changeOfRegistrant",
            List.of(new Param("customerId", customerId), new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            null
        );
    }

    public Result getV2CustomersCustomerIdDomainsDomainChangeOfRegistrant(Object customerId, Object domain, Object xRequestId) {
        return call(
            "GET",
            "/v2/customers/{customerId}/domains/{domain}/changeOfRegistrant",
            List.of(new Param("customerId", customerId), new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            null
        );
    }

    public Result patchV2CustomersCustomerIdDomainsDomainDnssecRecords(Object customerId, Object domain, Object body, Object xRequestId) {
        return call(
            "PATCH",
            "/v2/customers/{customerId}/domains/{domain}/dnssecRecords",
            List.of(new Param("customerId", customerId), new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            body
        );
    }

    public Result deleteV2CustomersCustomerIdDomainsDomainDnssecRecords(Object customerId, Object domain, Object body, Object xRequestId) {
        return call(
            "DELETE",
            "/v2/customers/{customerId}/domains/{domain}/dnssecRecords",
            List.of(new Param("customerId", customerId), new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            body
        );
    }

    public Result putV2CustomersCustomerIdDomainsDomainNameServers(Object customerId, Object domain, Object body, Object xRequestId) {
        return call(
            "PUT",
            "/v2/customers/{customerId}/domains/{domain}/nameServers",
            List.of(new Param("customerId", customerId), new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            body
        );
    }

    public Result getV2CustomersCustomerIdDomainsDomainPrivacyForwarding(Object customerId, Object domain, Object xRequestId) {
        return call(
            "GET",
            "/v2/customers/{customerId}/domains/{domain}/privacy/forwarding",
            List.of(new Param("customerId", customerId), new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            null
        );
    }

    public Result patchV2CustomersCustomerIdDomainsDomainPrivacyForwarding(Object customerId, Object domain, Object body, Object xRequestId) {
        return call(
            "PATCH",
            "/v2/customers/{customerId}/domains/{domain}/privacy/forwarding",
            List.of(new Param("customerId", customerId), new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            body
        );
    }

    public Result postV2CustomersCustomerIdDomainsDomainRedeem(Object customerId, Object domain, Object xRequestId, Object body) {
        return call(
            "POST",
            "/v2/customers/{customerId}/domains/{domain}/redeem",
            List.of(new Param("customerId", customerId), new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            body
        );
    }

    public Result postV2CustomersCustomerIdDomainsDomainRenew(Object customerId, Object domain, Object body, Object xRequestId) {
        return call(
            "POST",
            "/v2/customers/{customerId}/domains/{domain}/renew",
            List.of(new Param("customerId", customerId), new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            body
        );
    }

    public Result postV2CustomersCustomerIdDomainsDomainTransfer(Object customerId, Object domain, Object body, Object xRequestId) {
        return call(
            "POST",
            "/v2/customers/{customerId}/domains/{domain}/transfer",
            List.of(new Param("customerId", customerId), new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            body
        );
    }

    public Result getV2CustomersCustomerIdDomainsDomainTransfer(Object customerId, Object domain, Object xRequestId) {
        return call(
            "GET",
            "/v2/customers/{customerId}/domains/{domain}/transfer",
            List.of(new Param("customerId", customerId), new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            null
        );
    }

    public Result postV2CustomersCustomerIdDomainsDomainTransferValidate(Object customerId, Object domain, Object body, Object xRequestId) {
        return call(
            "POST",
            "/v2/customers/{customerId}/domains/{domain}/transfer/validate",
            List.of(new Param("customerId", customerId), new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            body
        );
    }

    public Result postV2CustomersCustomerIdDomainsDomainTransferInAccept(Object customerId, Object domain, Object body, Object xRequestId) {
        return call(
            "POST",
            "/v2/customers/{customerId}/domains/{domain}/transferInAccept",
            List.of(new Param("customerId", customerId), new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            body
        );
    }

    public Result postV2CustomersCustomerIdDomainsDomainTransferInCancel(Object customerId, Object domain, Object xRequestId) {
        return call(
            "POST",
            "/v2/customers/{customerId}/domains/{domain}/transferInCancel",
            List.of(new Param("customerId", customerId), new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            null
        );
    }

    public Result postV2CustomersCustomerIdDomainsDomainTransferInRestart(Object customerId, Object domain, Object xRequestId) {
        return call(
            "POST",
            "/v2/customers/{customerId}/domains/{domain}/transferInRestart",
            List.of(new Param("customerId", customerId), new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            null
        );
    }

    public Result postV2CustomersCustomerIdDomainsDomainTransferInRetry(Object customerId, Object domain, Object body, Object xRequestId) {
        return call(
            "POST",
            "/v2/customers/{customerId}/domains/{domain}/transferInRetry",
            List.of(new Param("customerId", customerId), new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            body
        );
    }

    public Result postV2CustomersCustomerIdDomainsDomainTransferOut(Object customerId, Object domain, Object registrar, Object xRequestId) {
        return call(
            "POST",
            "/v2/customers/{customerId}/domains/{domain}/transferOut",
            List.of(new Param("customerId", customerId), new Param("domain", domain)),
            List.of(new Param("registrar", registrar)),
            List.of(new Param("X-Request-Id", xRequestId)),
            null
        );
    }

    public Result postV2CustomersCustomerIdDomainsDomainTransferOutAccept(Object customerId, Object domain, Object xRequestId) {
        return call(
            "POST",
            "/v2/customers/{customerId}/domains/{domain}/transferOutAccept",
            List.of(new Param("customerId", customerId), new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            null
        );
    }

    public Result postV2CustomersCustomerIdDomainsDomainTransferOutReject(Object customerId, Object domain, Object xRequestId, Object reason) {
        return call(
            "POST",
            "/v2/customers/{customerId}/domains/{domain}/transferOutReject",
            List.of(new Param("customerId", customerId), new Param("domain", domain)),
            List.of(new Param("reason", reason)),
            List.of(new Param("X-Request-Id", xRequestId)),
            null
        );
    }

    public Result domainsForwardsDelete(Object customerId, Object fqdn) {
        return call(
            "DELETE",
            "/v2/customers/{customerId}/domains/forwards/{fqdn}",
            List.of(new Param("customerId", customerId), new Param("fqdn", fqdn)),
            List.of(),
            List.of(),
            null
        );
    }

    public Result domainsForwardsGet(Object customerId, Object fqdn, Object includeSubs) {
        return call(
            "GET",
            "/v2/customers/{customerId}/domains/forwards/{fqdn}",
            List.of(new Param("customerId", customerId), new Param("fqdn", fqdn)),
            List.of(new Param("includeSubs", includeSubs)),
            List.of(),
            null
        );
    }

    public Result domainsForwardsPut(Object customerId, Object fqdn, Object body) {
        return call(
            "PUT",
            "/v2/customers/{customerId}/domains/forwards/{fqdn}",
            List.of(new Param("customerId", customerId), new Param("fqdn", fqdn)),
            List.of(),
            List.of(),
            body
        );
    }

    public Result domainsForwardsPost(Object customerId, Object fqdn, Object body) {
        return call(
            "POST",
            "/v2/customers/{customerId}/domains/forwards/{fqdn}",
            List.of(new Param("customerId", customerId), new Param("fqdn", fqdn)),
            List.of(),
            List.of(),
            body
        );
    }

    public Result getV2CustomersCustomerIdDomainsDomainActions(Object customerId, Object domain, Object xRequestId) {
        return call(
            "GET",
            "/v2/customers/{customerId}/domains/{domain}/actions",
            List.of(new Param("customerId", customerId), new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            null
        );
    }

    public Result deleteV2CustomersCustomerIdDomainsDomainActionsType(Object customerId, Object domain, Object type, Object xRequestId) {
        return call(
            "DELETE",
            "/v2/customers/{customerId}/domains/{domain}/actions/{type}",
            List.of(new Param("customerId", customerId), new Param("domain", domain), new Param("type", type)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            null
        );
    }

    public Result getV2CustomersCustomerIdDomainsDomainActionsType(Object customerId, Object domain, Object type, Object xRequestId) {
        return call(
            "GET",
            "/v2/customers/{customerId}/domains/{domain}/actions/{type}",
            List.of(new Param("customerId", customerId), new Param("domain", domain), new Param("type", type)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            null
        );
    }

    public Result getV2CustomersCustomerIdDomainsNotifications(Object customerId, Object xRequestId) {
        return call(
            "GET",
            "/v2/customers/{customerId}/domains/notifications",
            List.of(new Param("customerId", customerId)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            null
        );
    }

    public Result getV2CustomersCustomerIdDomainsNotificationsOptIn(Object customerId, Object xRequestId) {
        return call(
            "GET",
            "/v2/customers/{customerId}/domains/notifications/optIn",
            List.of(new Param("customerId", customerId)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            null
        );
    }

    public Result putV2CustomersCustomerIdDomainsNotificationsOptIn(Object customerId, Object types, Object xRequestId) {
        return call(
            "PUT",
            "/v2/customers/{customerId}/domains/notifications/optIn",
            List.of(new Param("customerId", customerId)),
            List.of(new Param("types", types)),
            List.of(new Param("X-Request-Id", xRequestId)),
            null
        );
    }

    public Result getV2CustomersCustomerIdDomainsNotificationsSchemasType(Object customerId, Object type, Object xRequestId) {
        return call(
            "GET",
            "/v2/customers/{customerId}/domains/notifications/schemas/{type}",
            List.of(new Param("customerId", customerId), new Param("type", type)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            null
        );
    }

    public Result postV2CustomersCustomerIdDomainsNotificationsNotificationIdAcknowledge(Object customerId, Object notificationId, Object xRequestId) {
        return call(
            "POST",
            "/v2/customers/{customerId}/domains/notifications/{notificationId}/acknowledge",
            List.of(new Param("customerId", customerId), new Param("notificationId", notificationId)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            null
        );
    }

    public Result postV2CustomersCustomerIdDomainsRegister(Object customerId, Object body, Object xRequestId) {
        return call(
            "POST",
            "/v2/customers/{customerId}/domains/register",
            List.of(new Param("customerId", customerId)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            body
        );
    }

    public Result getV2CustomersCustomerIdDomainsRegisterSchemaTld(Object customerId, Object tld, Object xRequestId) {
        return call(
            "GET",
            "/v2/customers/{customerId}/domains/register/schema/{tld}",
            List.of(new Param("customerId", customerId), new Param("tld", tld)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            null
        );
    }

    public Result postV2CustomersCustomerIdDomainsRegisterValidate(Object customerId, Object body, Object xRequestId) {
        return call(
            "POST",
            "/v2/customers/{customerId}/domains/register/validate",
            List.of(new Param("customerId", customerId)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            body
        );
    }

    public Result getV2DomainsMaintenances(Object xRequestId, Object status, Object modifiedAtAfter, Object startsAtAfter, Object limit) {
        return call(
            "GET",
            "/v2/domains/maintenances",
            List.of(),
            List.of(new Param("status", status), new Param("modifiedAtAfter", modifiedAtAfter), new Param("startsAtAfter", startsAtAfter), new Param("limit", limit)),
            List.of(new Param("X-Request-Id", xRequestId)),
            null
        );
    }

    public Result getV2DomainsMaintenancesMaintenanceId(Object maintenanceId, Object xRequestId) {
        return call(
            "GET",
            "/v2/domains/maintenances/{maintenanceId}",
            List.of(new Param("maintenanceId", maintenanceId)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            null
        );
    }

    public Result getV2DomainsUsageYyyymm(Object yyyymm, Object xRequestId, Object includes) {
        return call(
            "GET",
            "/v2/domains/usage/{yyyymm}",
            List.of(new Param("yyyymm", yyyymm)),
            List.of(new Param("includes", includes)),
            List.of(new Param("X-Request-Id", xRequestId)),
            null
        );
    }

    public Result patchV2CustomersCustomerIdDomainsDomainContacts(Object customerId, Object domain, Object body, Object xRequestId) {
        return call(
            "PATCH",
            "/v2/customers/{customerId}/domains/{domain}/contacts",
            List.of(new Param("customerId", customerId), new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            body
        );
    }

    public Result postV2CustomersCustomerIdDomainsDomainRegenerateAuthCode(Object customerId, Object domain, Object xRequestId) {
        return call(
            "POST",
            "/v2/customers/{customerId}/domains/{domain}/regenerateAuthCode",
            List.of(new Param("customerId", customerId), new Param("domain", domain)),
            List.of(),
            List.of(new Param("X-Request-Id", xRequestId)),
            null
        );
    }
}
