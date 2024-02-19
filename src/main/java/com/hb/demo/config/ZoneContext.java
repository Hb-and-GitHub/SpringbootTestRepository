package com.hb.demo.config;

import java.time.ZoneId;
import java.util.Objects;

public class ZoneContext {

    private static final ThreadLocal<ZoneId> CTX = new ThreadLocal<>();

    private ZoneContext() {}

    public static ZoneId get() throws Exception {
        ZoneId zoneId = CTX.get();
        if (Objects.isNull(zoneId)) {
            throw new Exception("time zone missing.");

        }
        return zoneId;
    }

    public static void set(ZoneId zoneId) {
        CTX.remove();
        CTX.set(zoneId);
    }
}