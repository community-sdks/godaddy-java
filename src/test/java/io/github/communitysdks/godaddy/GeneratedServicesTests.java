package io.github.communitysdks.godaddy;

import io.github.communitysdks.godaddy.runtime.Response;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
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

        assertServiceRequests(client.abuse(), transport);
        assertServiceRequests(client.aftermarket(), transport);
        assertServiceRequests(client.agreements(), transport);
        assertServiceRequests(client.ans(), transport);
        assertServiceRequests(client.auctions(), transport);
        assertServiceRequests(client.certificates(), transport);
        assertServiceRequests(client.countries(), transport);
        assertServiceRequests(client.domains(), transport);
        assertServiceRequests(client.orders(), transport);
        assertServiceRequests(client.parking(), transport);
        assertServiceRequests(client.shoppers(), transport);
        assertServiceRequests(client.subscriptions(), transport);
    }

    private static void assertServiceRequests(Object service, MockTransport transport) {
        for (Method method : service.getClass().getDeclaredMethods()) {
            if (!java.lang.reflect.Modifier.isPublic(method.getModifiers())) continue;
            if (method.getParameterCount() != 1) continue;
            if (!method.getParameterTypes()[0].getSimpleName().endsWith("Request")) continue;
            try {
                Object requestObj = buildRequestObject(method.getParameterTypes()[0]);
                transport.push(new Response(200, Map.of("content-type", "application/json"), "{}"));
                int before = transport.requests.size();
                method.invoke(service, requestObj);
                var request = transport.requests.get(before);
                if (!"sso-key key:secret".equals(request.headers.get("Authorization"))) throw new AssertionError(method.getName() + " auth");
                if (request.url.contains("{")) throw new AssertionError(method.getName() + " unresolved path");
                if (!(request.method.equals("GET") || request.method.equals("POST") || request.method.equals("PUT") || request.method.equals("PATCH") || request.method.equals("DELETE"))) {
                    throw new AssertionError(method.getName() + " invalid method");
                }
            } catch (Exception ex) {
                throw new RuntimeException("Generated service test failed for " + service.getClass().getSimpleName() + "." + method.getName(), ex);
            }
        }
    }

    private static Object buildRequestObject(Class<?> requestClass) throws Exception {
        Constructor<?>[] constructors = requestClass.getDeclaredConstructors();
        Constructor<?> best = null;
        for (Constructor<?> ctor : constructors) {
            if (best == null || ctor.getParameterCount() > best.getParameterCount()) {
                best = ctor;
            }
        }
        if (best == null || best.getParameterCount() == 0) {
            return requestClass.getDeclaredConstructor().newInstance();
        }

        Object[] args = new Object[best.getParameterCount()];
        Class<?>[] types = best.getParameterTypes();
        for (int i = 0; i < types.length; i++) {
            args[i] = sampleValue(types[i]);
        }
        return best.newInstance(args);
    }

    private static Object sampleValue(Class<?> type) {
        if (type == String.class) return "value";
        if (type == Long.class || type == long.class) return 1L;
        if (type == Integer.class || type == int.class) return 1;
        if (type == Double.class || type == double.class) return 1.0;
        if (type == Boolean.class || type == boolean.class) return Boolean.TRUE;
        if (List.class.isAssignableFrom(type)) return new ArrayList<>(List.of("value"));
        if (Map.class.isAssignableFrom(type)) return Map.of("key", "value");
        return "value";
    }
}
