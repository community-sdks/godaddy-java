package io.github.communitysdks.godaddy;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.Map;

public final class Config {
    public static final String SANDBOX_BASE_URL = "https://api.ote-godaddy.com";
    public static final String PRODUCTION_BASE_URL = "https://api.godaddy.com";

    public String apiKey = "";
    public String apiSecret = "";
    public String baseUrl = SANDBOX_BASE_URL;
    public Map<String, String> serviceBaseUrls = new LinkedHashMap<>();
    public Duration timeout = Duration.ofSeconds(30);
    public int maxRetries = 2;
    public Duration retryDelay = Duration.ofMillis(200);
    public Map<String, String> defaultHeaders = new LinkedHashMap<>();
    public String userAgent = "community-sdks/godaddy";

    public static Config sandbox(String apiKey, String apiSecret) {
        Config c = new Config();
        c.apiKey = apiKey == null ? "" : apiKey;
        c.apiSecret = apiSecret == null ? "" : apiSecret;
        c.baseUrl = SANDBOX_BASE_URL;
        return c;
    }

    public static Config production(String apiKey, String apiSecret) {
        Config c = new Config();
        c.apiKey = apiKey == null ? "" : apiKey;
        c.apiSecret = apiSecret == null ? "" : apiSecret;
        c.baseUrl = PRODUCTION_BASE_URL;
        return c;
    }
}
