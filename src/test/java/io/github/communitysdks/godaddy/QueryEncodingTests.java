package io.github.communitysdks.godaddy;

import io.github.communitysdks.godaddy.runtime.Param;
import java.util.List;

final class QueryEncodingTests {
    static void run() {
        var pairs = ApiClient.buildQueryPairs(List.of(new Param("items", List.of("a", "b"))));
        if (pairs.size() != 2) throw new AssertionError("Expected 2 pairs");
        if (!pairs.get(0).key().equals("items") || !pairs.get(0).value().equals("a")) throw new AssertionError("Unexpected first pair");
        if (!pairs.get(1).key().equals("items") || !pairs.get(1).value().equals("b")) throw new AssertionError("Unexpected second pair");
    }
}
