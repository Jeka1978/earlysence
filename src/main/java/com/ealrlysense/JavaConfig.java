package com.ealrlysense;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Evegeny on 14/11/2016.
 */
public class JavaConfig implements Config {
    private Map<Class, Class> ifc2Impl = new HashMap<>();

    public JavaConfig() {
        ifc2Impl.put(Speaker.class, ConsoleSpeaker.class);
        ifc2Impl.put(Cleaner.class, PowerCleaner.class);
    }

    @Override
    public <T> Class<T> getImpl(Class<T> type) {
        return ifc2Impl.get(type);
    }
}
