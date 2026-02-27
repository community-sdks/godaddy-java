package com.communitysdks.godaddy;

import com.communitysdks.godaddy.runtime.Response;
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
        try { createClient(t1).abuse().getTickets(null, null, null, null, null, null, null, null); } catch (ValidationException ex) { threw = true; }
        if (!threw) throw new AssertionError("Expected ValidationException");

        var t2 = new MockTransport();
        t2.push(new Response(401, Map.of("content-type", "application/json"), "{}"));
        threw = false;
        try { createClient(t2).abuse().getTickets(null, null, null, null, null, null, null, null); } catch (UnauthorizedException ex) { threw = true; }
        if (!threw) throw new AssertionError("Expected UnauthorizedException");

        var t3 = new MockTransport();
        t3.push(new Response(404, Map.of("content-type", "application/json"), "{}"));
        threw = false;
        try { createClient(t3).abuse().getTickets(null, null, null, null, null, null, null, null); } catch (NotFoundException ex) { threw = true; }
        if (!threw) throw new AssertionError("Expected NotFoundException");

        var t4 = new MockTransport();
        t4.push(new Response(429, Map.of("content-type", "application/json"), "{}"));
        threw = false;
        try { createClient(t4).abuse().getTickets(null, null, null, null, null, null, null, null); } catch (RateLimitException ex) { threw = true; }
        if (!threw) throw new AssertionError("Expected RateLimitException");

        var t5 = new MockTransport();
        t5.push(new Response(500, Map.of("content-type", "application/json"), "{}"));
        threw = false;
        try { createClient(t5).abuse().getTickets(null, null, null, null, null, null, null, null); } catch (ServerException ex) { threw = true; }
        if (!threw) throw new AssertionError("Expected ServerException");
    }
}
