package com.communitysdks.godaddy;

import java.util.List;
import java.util.Map;

final class GeneratedServicesTests {
    static void run() {
        var transport = new MockTransport();
        Config config = new Config();
        config.apiKey = "key";
        config.apiSecret = "secret";
        config.maxRetries = 0;
        var client = new Client(config, transport);

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.abuse().getTickets("sample", Boolean.TRUE, "sample", "sample", "sample", "sample", 1L, 1L);
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("abuse.getTickets method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("abuse.getTickets auth");
            if (request.url.contains("{")) throw new AssertionError("abuse.getTickets unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.abuse().createTicket(Map.of("sample", true));
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("abuse.createTicket method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("abuse.createTicket auth");
            if (request.url.contains("{")) throw new AssertionError("abuse.createTicket unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.abuse().getTicketInfo("sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("abuse.getTicketInfo method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("abuse.getTicketInfo auth");
            if (request.url.contains("{")) throw new AssertionError("abuse.getTicketInfo unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.abuse().getTicketsV2("sample", Boolean.TRUE, "sample", "sample", "sample", "sample", 1L, 1L);
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("abuse.getTicketsV2 method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("abuse.getTicketsV2 auth");
            if (request.url.contains("{")) throw new AssertionError("abuse.getTicketsV2 unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.abuse().createTicketV2(Map.of("sample", true));
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("abuse.createTicketV2 method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("abuse.createTicketV2 auth");
            if (request.url.contains("{")) throw new AssertionError("abuse.createTicketV2 unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.abuse().getTicketInfoV2("sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("abuse.getTicketInfoV2 method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("abuse.getTicketInfoV2 auth");
            if (request.url.contains("{")) throw new AssertionError("abuse.getTicketInfoV2 unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.aftermarket().getListings("sample", List.of("sample"), List.of("sample"), "sample", "sample", 1L, 1L);
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("aftermarket.getListings method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("aftermarket.getListings auth");
            if (request.url.contains("{")) throw new AssertionError("aftermarket.getListings unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.aftermarket().deleteListings(List.of("sample"));
            var request = transport.requests.get(before);
            if (!request.method.equals("DELETE")) throw new AssertionError("aftermarket.deleteListings method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("aftermarket.deleteListings auth");
            if (request.url.contains("{")) throw new AssertionError("aftermarket.deleteListings unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.aftermarket().addExpiryListings(List.of("sample"));
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("aftermarket.addExpiryListings method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("aftermarket.addExpiryListings auth");
            if (request.url.contains("{")) throw new AssertionError("aftermarket.addExpiryListings unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.agreements().get(List.of("sample"), "header-value", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("agreements.get method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("agreements.get auth");
            if (request.url.contains("{")) throw new AssertionError("agreements.get unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.ans().searchAnsName("sample", "sample", "sample", "sample", 1L, 1L);
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("ans.searchAnsName method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("ans.searchAnsName auth");
            if (request.url.contains("{")) throw new AssertionError("ans.searchAnsName unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.ans().registerAgent(Map.of("sample", true));
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("ans.registerAgent method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("ans.registerAgent auth");
            if (request.url.contains("{")) throw new AssertionError("ans.registerAgent unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.ans().resolveAnsName(Map.of("sample", true));
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("ans.resolveAnsName method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("ans.resolveAnsName auth");
            if (request.url.contains("{")) throw new AssertionError("ans.resolveAnsName unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.ans().getAgent("sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("ans.getAgent method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("ans.getAgent auth");
            if (request.url.contains("{")) throw new AssertionError("ans.getAgent unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.ans().validateRegistration("sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("ans.validateRegistration method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("ans.validateRegistration auth");
            if (request.url.contains("{")) throw new AssertionError("ans.validateRegistration unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.ans().verifyDnsRecords("sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("ans.verifyDnsRecords method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("ans.verifyDnsRecords auth");
            if (request.url.contains("{")) throw new AssertionError("ans.verifyDnsRecords unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.ans().getAgentIdentityCertificateByAgentId("sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("ans.getAgentIdentityCertificateByAgentId method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("ans.getAgentIdentityCertificateByAgentId auth");
            if (request.url.contains("{")) throw new AssertionError("ans.getAgentIdentityCertificateByAgentId unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.ans().submitAgentIdentityCsrByAgentId("sample", Map.of("sample", true));
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("ans.submitAgentIdentityCsrByAgentId method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("ans.submitAgentIdentityCsrByAgentId auth");
            if (request.url.contains("{")) throw new AssertionError("ans.submitAgentIdentityCsrByAgentId unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.ans().getAgentServerCertificateByAgentId("sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("ans.getAgentServerCertificateByAgentId method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("ans.getAgentServerCertificateByAgentId auth");
            if (request.url.contains("{")) throw new AssertionError("ans.getAgentServerCertificateByAgentId unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.ans().submitAgentServerCsrByAgentId("sample", Map.of("sample", true));
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("ans.submitAgentServerCsrByAgentId method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("ans.submitAgentServerCsrByAgentId auth");
            if (request.url.contains("{")) throw new AssertionError("ans.submitAgentServerCsrByAgentId unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.ans().getAgentCsrStatusByAgentId("sample", "sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("ans.getAgentCsrStatusByAgentId method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("ans.getAgentCsrStatusByAgentId auth");
            if (request.url.contains("{")) throw new AssertionError("ans.getAgentCsrStatusByAgentId unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.ans().getAgentEvents("header-value", "sample", "sample", 1L);
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("ans.getAgentEvents method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("ans.getAgentEvents auth");
            if (request.url.contains("{")) throw new AssertionError("ans.getAgentEvents unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.auctions().placeBids("sample", Map.of("sample", true));
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("auctions.placeBids method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("auctions.placeBids auth");
            if (request.url.contains("{")) throw new AssertionError("auctions.placeBids unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().certificateCreate(Map.of("sample", true), "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("certificates.certificateCreate method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.certificateCreate auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.certificateCreate unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().certificateValidate(Map.of("sample", true), "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("certificates.certificateValidate method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.certificateValidate auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.certificateValidate unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().certificateGet("sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("certificates.certificateGet method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.certificateGet auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.certificateGet unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().certificateActionRetrieve("sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("certificates.certificateActionRetrieve method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.certificateActionRetrieve auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.certificateActionRetrieve unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().certificateResendEmail("sample", "sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("certificates.certificateResendEmail method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.certificateResendEmail auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.certificateResendEmail unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().certificateAlternateEmailAddress("sample", List.of("sample"));
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("certificates.certificateAlternateEmailAddress method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.certificateAlternateEmailAddress auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.certificateAlternateEmailAddress unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().certificateResendEmailAddress("sample", "sample", List.of("sample"));
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("certificates.certificateResendEmailAddress method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.certificateResendEmailAddress auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.certificateResendEmailAddress unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().certificateEmailHistory("sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("certificates.certificateEmailHistory method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.certificateEmailHistory auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.certificateEmailHistory unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().certificateCallbackDelete("sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("DELETE")) throw new AssertionError("certificates.certificateCallbackDelete method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.certificateCallbackDelete auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.certificateCallbackDelete unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().certificateCallbackGet("sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("certificates.certificateCallbackGet method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.certificateCallbackGet auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.certificateCallbackGet unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().certificateCallbackReplace("sample", "sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("PUT")) throw new AssertionError("certificates.certificateCallbackReplace method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.certificateCallbackReplace auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.certificateCallbackReplace unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().certificateCancel("sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("certificates.certificateCancel method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.certificateCancel auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.certificateCancel unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().certificateDownload("sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("certificates.certificateDownload method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.certificateDownload auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.certificateDownload unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().certificateReissue("sample", Map.of("sample", true));
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("certificates.certificateReissue method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.certificateReissue auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.certificateReissue unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().certificateRenew("sample", Map.of("sample", true));
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("certificates.certificateRenew method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.certificateRenew auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.certificateRenew unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().certificateRevoke("sample", Map.of("sample", true));
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("certificates.certificateRevoke method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.certificateRevoke auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.certificateRevoke unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().certificateSitesealGet("sample", "sample", "sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("certificates.certificateSitesealGet method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.certificateSitesealGet auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.certificateSitesealGet unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().certificateVerifydomaincontrol("sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("certificates.certificateVerifydomaincontrol method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.certificateVerifydomaincontrol auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.certificateVerifydomaincontrol unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().certificateGetEntitlement("sample", Boolean.TRUE);
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("certificates.certificateGetEntitlement method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.certificateGetEntitlement auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.certificateGetEntitlement unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().certificateCreateV2(Map.of("sample", true), "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("certificates.certificateCreateV2 method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.certificateCreateV2 auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.certificateCreateV2 unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().certificateDownloadEntitlement("sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("certificates.certificateDownloadEntitlement method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.certificateDownloadEntitlement auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.certificateDownloadEntitlement unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().getCustomerCertificatesByCustomerId("sample", 1L, 1L);
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("certificates.getCustomerCertificatesByCustomerId method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.getCustomerCertificatesByCustomerId auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.getCustomerCertificatesByCustomerId unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().getCertificateDetailByCertIdentifier("sample", "sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("certificates.getCertificateDetailByCertIdentifier method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.getCertificateDetailByCertIdentifier auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.getCertificateDetailByCertIdentifier unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().getDomainInformationByCertificateId("sample", "sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("certificates.getDomainInformationByCertificateId method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.getDomainInformationByCertificateId auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.getDomainInformationByCertificateId unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().getDomainDetailsByDomain("sample", "sample", "sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("certificates.getDomainDetailsByDomain method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.getDomainDetailsByDomain auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.getDomainDetailsByDomain unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().getAcmeExternalAccountBinding("sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("certificates.getAcmeExternalAccountBinding method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.getAcmeExternalAccountBinding auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.getAcmeExternalAccountBinding unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().retrieveSslByDomainReseller(1L, 1L, "sample", List.of("sample"), "sample", "sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("certificates.retrieveSslByDomainReseller method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.retrieveSslByDomainReseller auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.retrieveSslByDomainReseller unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.certificates().retrieveSslByDomainSubscriptionReseller("sample", 1L, 1L, "sample", List.of("sample"), "sample", "sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("certificates.retrieveSslByDomainSubscriptionReseller method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("certificates.retrieveSslByDomainSubscriptionReseller auth");
            if (request.url.contains("{")) throw new AssertionError("certificates.retrieveSslByDomainSubscriptionReseller unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.countries().getCountries("sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("countries.getCountries method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("countries.getCountries auth");
            if (request.url.contains("{")) throw new AssertionError("countries.getCountries unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.countries().getCountry("sample", "sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("countries.getCountry method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("countries.getCountry auth");
            if (request.url.contains("{")) throw new AssertionError("countries.getCountry unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().list("header-value", List.of("sample"), List.of("sample"), 1L, "sample", List.of("sample"), "sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("domains.list method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.list auth");
            if (request.url.contains("{")) throw new AssertionError("domains.list unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().getAgreement(List.of("sample"), Boolean.TRUE, "header-value", Boolean.TRUE);
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("domains.getAgreement method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.getAgreement auth");
            if (request.url.contains("{")) throw new AssertionError("domains.getAgreement unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().available("sample", "sample", Boolean.TRUE);
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("domains.available method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.available auth");
            if (request.url.contains("{")) throw new AssertionError("domains.available unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().availableBulk(List.of("sample"), "sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("domains.availableBulk method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.availableBulk auth");
            if (request.url.contains("{")) throw new AssertionError("domains.availableBulk unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().contactsValidate(Map.of("sample", true), "header-value", "sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("domains.contactsValidate method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.contactsValidate auth");
            if (request.url.contains("{")) throw new AssertionError("domains.contactsValidate unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().purchase(Map.of("sample", true), "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("domains.purchase method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.purchase auth");
            if (request.url.contains("{")) throw new AssertionError("domains.purchase unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().schema("sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("domains.schema method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.schema auth");
            if (request.url.contains("{")) throw new AssertionError("domains.schema unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().validate(Map.of("sample", true));
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("domains.validate method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.validate auth");
            if (request.url.contains("{")) throw new AssertionError("domains.validate unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().suggest("header-value", "sample", "sample", "sample", List.of("sample"), List.of("sample"), 1L, 1L, 1L, 1L);
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("domains.suggest method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.suggest auth");
            if (request.url.contains("{")) throw new AssertionError("domains.suggest unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().tlds();
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("domains.tlds method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.tlds auth");
            if (request.url.contains("{")) throw new AssertionError("domains.tlds unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().cancel("sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("DELETE")) throw new AssertionError("domains.cancel method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.cancel auth");
            if (request.url.contains("{")) throw new AssertionError("domains.cancel unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().get("sample", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("domains.get method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.get auth");
            if (request.url.contains("{")) throw new AssertionError("domains.get unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().update("sample", Map.of("sample", true), "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("PATCH")) throw new AssertionError("domains.update method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.update auth");
            if (request.url.contains("{")) throw new AssertionError("domains.update unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().updateContacts("sample", Map.of("sample", true), "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("PATCH")) throw new AssertionError("domains.updateContacts method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.updateContacts auth");
            if (request.url.contains("{")) throw new AssertionError("domains.updateContacts unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().cancelPrivacy("sample", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("DELETE")) throw new AssertionError("domains.cancelPrivacy method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.cancelPrivacy auth");
            if (request.url.contains("{")) throw new AssertionError("domains.cancelPrivacy unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().purchasePrivacy("sample", Map.of("sample", true), "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("domains.purchasePrivacy method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.purchasePrivacy auth");
            if (request.url.contains("{")) throw new AssertionError("domains.purchasePrivacy unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().recordAdd("sample", Map.of("sample", true), "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("PATCH")) throw new AssertionError("domains.recordAdd method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.recordAdd auth");
            if (request.url.contains("{")) throw new AssertionError("domains.recordAdd unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().recordReplace("sample", Map.of("sample", true), "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("PUT")) throw new AssertionError("domains.recordReplace method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.recordReplace auth");
            if (request.url.contains("{")) throw new AssertionError("domains.recordReplace unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().recordGet("sample", "sample", "sample", "header-value", 1L, 1L);
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("domains.recordGet method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.recordGet auth");
            if (request.url.contains("{")) throw new AssertionError("domains.recordGet unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().recordReplaceTypeName("sample", "sample", "sample", Map.of("sample", true), "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("PUT")) throw new AssertionError("domains.recordReplaceTypeName method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.recordReplaceTypeName auth");
            if (request.url.contains("{")) throw new AssertionError("domains.recordReplaceTypeName unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().recordDeleteTypeName("sample", "sample", "sample", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("DELETE")) throw new AssertionError("domains.recordDeleteTypeName method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.recordDeleteTypeName auth");
            if (request.url.contains("{")) throw new AssertionError("domains.recordDeleteTypeName unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().recordReplaceType("sample", "sample", Map.of("sample", true), "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("PUT")) throw new AssertionError("domains.recordReplaceType method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.recordReplaceType auth");
            if (request.url.contains("{")) throw new AssertionError("domains.recordReplaceType unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().renew("sample", "header-value", Map.of("sample", true));
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("domains.renew method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.renew auth");
            if (request.url.contains("{")) throw new AssertionError("domains.renew unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().transferIn("sample", Map.of("sample", true), "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("domains.transferIn method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.transferIn auth");
            if (request.url.contains("{")) throw new AssertionError("domains.transferIn unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().verifyEmail("sample", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("domains.verifyEmail method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.verifyEmail auth");
            if (request.url.contains("{")) throw new AssertionError("domains.verifyEmail unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().getV2CustomersCustomerIdDomainsDomain("sample", "sample", "header-value", List.of("sample"));
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsDomain method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsDomain auth");
            if (request.url.contains("{")) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsDomain unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().deleteV2CustomersCustomerIdDomainsDomainChangeOfRegistrant("sample", "sample", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("DELETE")) throw new AssertionError("domains.deleteV2CustomersCustomerIdDomainsDomainChangeOfRegistrant method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.deleteV2CustomersCustomerIdDomainsDomainChangeOfRegistrant auth");
            if (request.url.contains("{")) throw new AssertionError("domains.deleteV2CustomersCustomerIdDomainsDomainChangeOfRegistrant unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().getV2CustomersCustomerIdDomainsDomainChangeOfRegistrant("sample", "sample", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsDomainChangeOfRegistrant method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsDomainChangeOfRegistrant auth");
            if (request.url.contains("{")) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsDomainChangeOfRegistrant unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().patchV2CustomersCustomerIdDomainsDomainDnssecRecords("sample", "sample", Map.of("sample", true), "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("PATCH")) throw new AssertionError("domains.patchV2CustomersCustomerIdDomainsDomainDnssecRecords method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.patchV2CustomersCustomerIdDomainsDomainDnssecRecords auth");
            if (request.url.contains("{")) throw new AssertionError("domains.patchV2CustomersCustomerIdDomainsDomainDnssecRecords unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().deleteV2CustomersCustomerIdDomainsDomainDnssecRecords("sample", "sample", Map.of("sample", true), "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("DELETE")) throw new AssertionError("domains.deleteV2CustomersCustomerIdDomainsDomainDnssecRecords method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.deleteV2CustomersCustomerIdDomainsDomainDnssecRecords auth");
            if (request.url.contains("{")) throw new AssertionError("domains.deleteV2CustomersCustomerIdDomainsDomainDnssecRecords unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().putV2CustomersCustomerIdDomainsDomainNameServers("sample", "sample", Map.of("sample", true), "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("PUT")) throw new AssertionError("domains.putV2CustomersCustomerIdDomainsDomainNameServers method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.putV2CustomersCustomerIdDomainsDomainNameServers auth");
            if (request.url.contains("{")) throw new AssertionError("domains.putV2CustomersCustomerIdDomainsDomainNameServers unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().getV2CustomersCustomerIdDomainsDomainPrivacyForwarding("sample", "sample", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsDomainPrivacyForwarding method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsDomainPrivacyForwarding auth");
            if (request.url.contains("{")) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsDomainPrivacyForwarding unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().patchV2CustomersCustomerIdDomainsDomainPrivacyForwarding("sample", "sample", Map.of("sample", true), "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("PATCH")) throw new AssertionError("domains.patchV2CustomersCustomerIdDomainsDomainPrivacyForwarding method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.patchV2CustomersCustomerIdDomainsDomainPrivacyForwarding auth");
            if (request.url.contains("{")) throw new AssertionError("domains.patchV2CustomersCustomerIdDomainsDomainPrivacyForwarding unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().postV2CustomersCustomerIdDomainsDomainRedeem("sample", "sample", "header-value", Map.of("sample", true));
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainRedeem method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainRedeem auth");
            if (request.url.contains("{")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainRedeem unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().postV2CustomersCustomerIdDomainsDomainRenew("sample", "sample", Map.of("sample", true), "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainRenew method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainRenew auth");
            if (request.url.contains("{")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainRenew unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().postV2CustomersCustomerIdDomainsDomainTransfer("sample", "sample", Map.of("sample", true), "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainTransfer method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainTransfer auth");
            if (request.url.contains("{")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainTransfer unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().getV2CustomersCustomerIdDomainsDomainTransfer("sample", "sample", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsDomainTransfer method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsDomainTransfer auth");
            if (request.url.contains("{")) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsDomainTransfer unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().postV2CustomersCustomerIdDomainsDomainTransferValidate("sample", "sample", Map.of("sample", true), "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainTransferValidate method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainTransferValidate auth");
            if (request.url.contains("{")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainTransferValidate unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().postV2CustomersCustomerIdDomainsDomainTransferInAccept("sample", "sample", Map.of("sample", true), "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainTransferInAccept method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainTransferInAccept auth");
            if (request.url.contains("{")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainTransferInAccept unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().postV2CustomersCustomerIdDomainsDomainTransferInCancel("sample", "sample", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainTransferInCancel method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainTransferInCancel auth");
            if (request.url.contains("{")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainTransferInCancel unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().postV2CustomersCustomerIdDomainsDomainTransferInRestart("sample", "sample", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainTransferInRestart method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainTransferInRestart auth");
            if (request.url.contains("{")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainTransferInRestart unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().postV2CustomersCustomerIdDomainsDomainTransferInRetry("sample", "sample", Map.of("sample", true), "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainTransferInRetry method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainTransferInRetry auth");
            if (request.url.contains("{")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainTransferInRetry unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().postV2CustomersCustomerIdDomainsDomainTransferOut("sample", "sample", "sample", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainTransferOut method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainTransferOut auth");
            if (request.url.contains("{")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainTransferOut unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().postV2CustomersCustomerIdDomainsDomainTransferOutAccept("sample", "sample", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainTransferOutAccept method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainTransferOutAccept auth");
            if (request.url.contains("{")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainTransferOutAccept unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().postV2CustomersCustomerIdDomainsDomainTransferOutReject("sample", "sample", "header-value", "sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainTransferOutReject method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainTransferOutReject auth");
            if (request.url.contains("{")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainTransferOutReject unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().domainsForwardsDelete("sample", "sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("DELETE")) throw new AssertionError("domains.domainsForwardsDelete method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.domainsForwardsDelete auth");
            if (request.url.contains("{")) throw new AssertionError("domains.domainsForwardsDelete unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().domainsForwardsGet("sample", "sample", Boolean.TRUE);
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("domains.domainsForwardsGet method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.domainsForwardsGet auth");
            if (request.url.contains("{")) throw new AssertionError("domains.domainsForwardsGet unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().domainsForwardsPut("sample", "sample", Map.of("sample", true));
            var request = transport.requests.get(before);
            if (!request.method.equals("PUT")) throw new AssertionError("domains.domainsForwardsPut method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.domainsForwardsPut auth");
            if (request.url.contains("{")) throw new AssertionError("domains.domainsForwardsPut unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().domainsForwardsPost("sample", "sample", Map.of("sample", true));
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("domains.domainsForwardsPost method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.domainsForwardsPost auth");
            if (request.url.contains("{")) throw new AssertionError("domains.domainsForwardsPost unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().getV2CustomersCustomerIdDomainsDomainActions("sample", "sample", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsDomainActions method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsDomainActions auth");
            if (request.url.contains("{")) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsDomainActions unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().deleteV2CustomersCustomerIdDomainsDomainActionsType("sample", "sample", "sample", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("DELETE")) throw new AssertionError("domains.deleteV2CustomersCustomerIdDomainsDomainActionsType method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.deleteV2CustomersCustomerIdDomainsDomainActionsType auth");
            if (request.url.contains("{")) throw new AssertionError("domains.deleteV2CustomersCustomerIdDomainsDomainActionsType unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().getV2CustomersCustomerIdDomainsDomainActionsType("sample", "sample", "sample", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsDomainActionsType method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsDomainActionsType auth");
            if (request.url.contains("{")) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsDomainActionsType unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().getV2CustomersCustomerIdDomainsNotifications("sample", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsNotifications method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsNotifications auth");
            if (request.url.contains("{")) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsNotifications unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().getV2CustomersCustomerIdDomainsNotificationsOptIn("sample", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsNotificationsOptIn method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsNotificationsOptIn auth");
            if (request.url.contains("{")) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsNotificationsOptIn unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().putV2CustomersCustomerIdDomainsNotificationsOptIn("sample", List.of("sample"), "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("PUT")) throw new AssertionError("domains.putV2CustomersCustomerIdDomainsNotificationsOptIn method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.putV2CustomersCustomerIdDomainsNotificationsOptIn auth");
            if (request.url.contains("{")) throw new AssertionError("domains.putV2CustomersCustomerIdDomainsNotificationsOptIn unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().getV2CustomersCustomerIdDomainsNotificationsSchemasType("sample", "sample", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsNotificationsSchemasType method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsNotificationsSchemasType auth");
            if (request.url.contains("{")) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsNotificationsSchemasType unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().postV2CustomersCustomerIdDomainsNotificationsNotificationIdAcknowledge("sample", "sample", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsNotificationsNotificationIdAcknowledge method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsNotificationsNotificationIdAcknowledge auth");
            if (request.url.contains("{")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsNotificationsNotificationIdAcknowledge unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().postV2CustomersCustomerIdDomainsRegister("sample", Map.of("sample", true), "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsRegister method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsRegister auth");
            if (request.url.contains("{")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsRegister unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().getV2CustomersCustomerIdDomainsRegisterSchemaTld("sample", "sample", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsRegisterSchemaTld method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsRegisterSchemaTld auth");
            if (request.url.contains("{")) throw new AssertionError("domains.getV2CustomersCustomerIdDomainsRegisterSchemaTld unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().postV2CustomersCustomerIdDomainsRegisterValidate("sample", Map.of("sample", true), "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsRegisterValidate method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsRegisterValidate auth");
            if (request.url.contains("{")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsRegisterValidate unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().getV2DomainsMaintenances("header-value", List.of("sample"), "sample", "sample", 1L);
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("domains.getV2DomainsMaintenances method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.getV2DomainsMaintenances auth");
            if (request.url.contains("{")) throw new AssertionError("domains.getV2DomainsMaintenances unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().getV2DomainsMaintenancesMaintenanceId("sample", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("domains.getV2DomainsMaintenancesMaintenanceId method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.getV2DomainsMaintenancesMaintenanceId auth");
            if (request.url.contains("{")) throw new AssertionError("domains.getV2DomainsMaintenancesMaintenanceId unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().getV2DomainsUsageYyyymm("sample", "header-value", List.of("sample"));
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("domains.getV2DomainsUsageYyyymm method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.getV2DomainsUsageYyyymm auth");
            if (request.url.contains("{")) throw new AssertionError("domains.getV2DomainsUsageYyyymm unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().patchV2CustomersCustomerIdDomainsDomainContacts("sample", "sample", Map.of("sample", true), "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("PATCH")) throw new AssertionError("domains.patchV2CustomersCustomerIdDomainsDomainContacts method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.patchV2CustomersCustomerIdDomainsDomainContacts auth");
            if (request.url.contains("{")) throw new AssertionError("domains.patchV2CustomersCustomerIdDomainsDomainContacts unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.domains().postV2CustomersCustomerIdDomainsDomainRegenerateAuthCode("sample", "sample", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainRegenerateAuthCode method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainRegenerateAuthCode auth");
            if (request.url.contains("{")) throw new AssertionError("domains.postV2CustomersCustomerIdDomainsDomainRegenerateAuthCode unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.orders().list("header-value", "sample", "sample", "sample", "sample", "sample", "sample", 1L, 1L, "sample", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("orders.list method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("orders.list auth");
            if (request.url.contains("{")) throw new AssertionError("orders.list unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.orders().get("sample", "header-value", "header-value", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("orders.get method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("orders.get auth");
            if (request.url.contains("{")) throw new AssertionError("orders.get unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.parking().getMetrics("sample", "sample", "sample", 1L, 1L, "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("parking.getMetrics method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("parking.getMetrics auth");
            if (request.url.contains("{")) throw new AssertionError("parking.getMetrics unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.parking().getMetricsByDomain("sample", "sample", "sample", List.of("sample"), "sample", "sample", 1L, 1L, "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("parking.getMetricsByDomain method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("parking.getMetricsByDomain auth");
            if (request.url.contains("{")) throw new AssertionError("parking.getMetricsByDomain unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.shoppers().createSubaccount(Map.of("sample", true));
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("shoppers.createSubaccount method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("shoppers.createSubaccount auth");
            if (request.url.contains("{")) throw new AssertionError("shoppers.createSubaccount unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.shoppers().get("sample", List.of("sample"));
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("shoppers.get method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("shoppers.get auth");
            if (request.url.contains("{")) throw new AssertionError("shoppers.get unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.shoppers().update("sample", Map.of("sample", true));
            var request = transport.requests.get(before);
            if (!request.method.equals("POST")) throw new AssertionError("shoppers.update method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("shoppers.update auth");
            if (request.url.contains("{")) throw new AssertionError("shoppers.update unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.shoppers().delete("sample", "sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("DELETE")) throw new AssertionError("shoppers.delete method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("shoppers.delete auth");
            if (request.url.contains("{")) throw new AssertionError("shoppers.delete unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.shoppers().getStatus("sample", "sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("shoppers.getStatus method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("shoppers.getStatus auth");
            if (request.url.contains("{")) throw new AssertionError("shoppers.getStatus unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.shoppers().changePassword("sample", Map.of("sample", true));
            var request = transport.requests.get(before);
            if (!request.method.equals("PUT")) throw new AssertionError("shoppers.changePassword method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("shoppers.changePassword auth");
            if (request.url.contains("{")) throw new AssertionError("shoppers.changePassword unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.subscriptions().list("header-value", "header-value", "header-value", List.of("sample"), List.of("sample"), 1L, 1L, "sample");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("subscriptions.list method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("subscriptions.list auth");
            if (request.url.contains("{")) throw new AssertionError("subscriptions.list unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.subscriptions().productGroups("header-value", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("subscriptions.productGroups method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("subscriptions.productGroups auth");
            if (request.url.contains("{")) throw new AssertionError("subscriptions.productGroups unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.subscriptions().cancel("sample", "header-value", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("DELETE")) throw new AssertionError("subscriptions.cancel method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("subscriptions.cancel auth");
            if (request.url.contains("{")) throw new AssertionError("subscriptions.cancel unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.subscriptions().get("sample", "header-value", "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("GET")) throw new AssertionError("subscriptions.get method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("subscriptions.get auth");
            if (request.url.contains("{")) throw new AssertionError("subscriptions.get unresolved path");
        }

        {
            transport.push(new com.communitysdks.godaddy.runtime.Response(200, java.util.Map.of("content-type", "application/json"), "{}"));
            int before = transport.requests.size();
            client.subscriptions().update("sample", "header-value", Map.of("sample", true), "header-value");
            var request = transport.requests.get(before);
            if (!request.method.equals("PATCH")) throw new AssertionError("subscriptions.update method");
            if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError("subscriptions.update auth");
            if (request.url.contains("{")) throw new AssertionError("subscriptions.update unresolved path");
        }
    }
}
