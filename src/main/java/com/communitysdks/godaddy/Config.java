package com.communitysdks.godaddy;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.Map;

public final class Config {
    public String apiKey = "";
    public String apiSecret = "";
    public String baseUrl = "";
    public Duration timeout = Duration.ofSeconds(30);
    public int maxRetries = 2;
    public Duration retryDelay = Duration.ofMillis(200);
    public Map<String, String> defaultHeaders = new LinkedHashMap<>();
    public String userAgent = "community-sdks/godaddy-java";
}
