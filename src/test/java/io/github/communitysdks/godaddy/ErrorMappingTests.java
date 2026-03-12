package io.github.communitysdks.godaddy;

import io.github.communitysdks.godaddy.dto.abuse.requests.GetTicketsRequest;
import io.github.communitysdks.godaddy.errors.abuse.AbuseBadRequestException;
import io.github.communitysdks.godaddy.errors.abuse.AbuseNotFoundException;
import io.github.communitysdks.godaddy.errors.abuse.AbuseRateLimitException;
import io.github.communitysdks.godaddy.errors.abuse.AbuseServerException;
import io.github.communitysdks.godaddy.errors.abuse.AbuseUnauthorizedException;
import io.github.communitysdks.godaddy.runtime.Response;
import java.util.Map;

final class ErrorMappingTests {
    private static Client createClient(MockTransport transport) {
        Config config = new Config();
        config.apiKey = "key";
        config.apiSecret = "secret";
        config.maxRetries = 0;
        return new Client(config, transport);
    }

    static void run() {
        var t1 = new MockTransport();
        t1.push(new Response(400, Map.of("content-type", "application/json"), "{}"));
        boolean threw = false;
        try { createClient(t1).abuse().getTickets(new GetTicketsRequest()); } catch (AbuseBadRequestException ex) { threw = true; }
        if (!threw) throw new AssertionError("Expected AbuseBadRequestException");

        var t2 = new MockTransport();
        t2.push(new Response(401, Map.of("content-type", "application/json"), "{}"));
        threw = false;
        try { createClient(t2).abuse().getTickets(new GetTicketsRequest()); } catch (AbuseUnauthorizedException ex) { threw = true; }
        if (!threw) throw new AssertionError("Expected AbuseUnauthorizedException");

        var t3 = new MockTransport();
        t3.push(new Response(404, Map.of("content-type", "application/json"), "{}"));
        threw = false;
        try { createClient(t3).abuse().getTickets(new GetTicketsRequest()); } catch (AbuseNotFoundException ex) { threw = true; }
        if (!threw) throw new AssertionError("Expected AbuseNotFoundException");

        var t4 = new MockTransport();
        t4.push(new Response(429, Map.of("content-type", "application/json"), "{}"));
        threw = false;
        try { createClient(t4).abuse().getTickets(new GetTicketsRequest()); } catch (AbuseRateLimitException ex) { threw = true; }
        if (!threw) throw new AssertionError("Expected AbuseRateLimitException");

        var t5 = new MockTransport();
        t5.push(new Response(500, Map.of("content-type", "application/json"), "{}"));
        threw = false;
        try { createClient(t5).abuse().getTickets(new GetTicketsRequest()); } catch (AbuseServerException ex) { threw = true; }
        if (!threw) throw new AssertionError("Expected AbuseServerException");
    }
}
