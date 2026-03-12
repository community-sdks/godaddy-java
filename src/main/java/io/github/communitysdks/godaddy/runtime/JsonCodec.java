package io.github.communitysdks.godaddy.runtime;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class JsonCodec {
    private JsonCodec() {}

    public static Object parse(String text) {
        if (text == null) return null;
        String t = text.trim();
        if (t.isEmpty()) return null;
        if (!(t.startsWith("{") || t.startsWith("["))) return text;
        return new Parser(t).parseValue();
    }

    public static String stringify(Object value) {
        if (value == null) return "null";
        if (value instanceof String s) return quote(s);
        if (value instanceof Number || value instanceof Boolean) return String.valueOf(value);
        if (value instanceof Map<?, ?> map) {
            StringBuilder sb = new StringBuilder("{");
            boolean first = true;
            for (Map.Entry<?, ?> e : map.entrySet()) {
                if (!first) sb.append(',');
                first = false;
                sb.append(quote(String.valueOf(e.getKey()))).append(':').append(stringify(e.getValue()));
            }
            return sb.append('}').toString();
        }
        if (value instanceof Iterable<?> list) {
            StringBuilder sb = new StringBuilder("[");
            boolean first = true;
            for (Object item : list) {
                if (!first) sb.append(',');
                first = false;
                sb.append(stringify(item));
            }
            return sb.append(']').toString();
        }
        return quote(String.valueOf(value));
    }

    private static String quote(String s) {
        return "\"" + s.replace("\\", "\\\\").replace("\"", "\\\"") + "\"";
    }

    private static final class Parser {
        private final String text;
        private int i;

        Parser(String text) {
            this.text = text;
        }

        Object parseValue() {
            skipWs();
            if (i >= text.length()) return null;
            char c = text.charAt(i);
            if (c == '{') return parseObject();
            if (c == '[') return parseArray();
            if (c == '"') return parseString();
            if (c == 't' || c == 'f') return parseBoolean();
            if (c == 'n') {
                i += 4;
                return null;
            }
            return parseNumber();
        }

        private Map<String, Object> parseObject() {
            Map<String, Object> map = new LinkedHashMap<>();
            i++;
            skipWs();
            if (i < text.length() && text.charAt(i) == '}') {
                i++;
                return map;
            }
            while (i < text.length()) {
                String key = parseString();
                skipWs();
                if (i < text.length() && text.charAt(i) == ':') i++;
                Object value = parseValue();
                map.put(key, value);
                skipWs();
                if (i >= text.length()) break;
                char c = text.charAt(i++);
                if (c == '}') break;
            }
            return map;
        }

        private List<Object> parseArray() {
            List<Object> list = new ArrayList<>();
            i++;
            skipWs();
            if (i < text.length() && text.charAt(i) == ']') {
                i++;
                return list;
            }
            while (i < text.length()) {
                list.add(parseValue());
                skipWs();
                if (i >= text.length()) break;
                char c = text.charAt(i++);
                if (c == ']') break;
            }
            return list;
        }

        private String parseString() {
            StringBuilder sb = new StringBuilder();
            i++;
            while (i < text.length()) {
                char c = text.charAt(i++);
                if (c == '"') break;
                if (c == '\\' && i < text.length()) {
                    char n = text.charAt(i++);
                    if (n == '"' || n == '\\' || n == '/') sb.append(n);
                    else if (n == 'b') sb.append('\b');
                    else if (n == 'f') sb.append('\f');
                    else if (n == 'n') sb.append('\n');
                    else if (n == 'r') sb.append('\r');
                    else if (n == 't') sb.append('\t');
                    else sb.append(n);
                    continue;
                }
                sb.append(c);
            }
            return sb.toString();
        }

        private Boolean parseBoolean() {
            if (text.startsWith("true", i)) {
                i += 4;
                return Boolean.TRUE;
            }
            i += 5;
            return Boolean.FALSE;
        }

        private Number parseNumber() {
            int start = i;
            while (i < text.length()) {
                char c = text.charAt(i);
                if ((c >= '0' && c <= '9') || c == '-' || c == '+' || c == '.' || c == 'e' || c == 'E') i++;
                else break;
            }
            String n = text.substring(start, i);
            if (n.contains(".") || n.contains("e") || n.contains("E")) return Double.parseDouble(n);
            return Long.parseLong(n);
        }

        private void skipWs() {
            while (i < text.length() && Character.isWhitespace(text.charAt(i))) i++;
        }
    }
}
