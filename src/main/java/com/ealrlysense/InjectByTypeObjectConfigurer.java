package com.ealrlysense;

import lombok.SneakyThrows;

import java.lang.reflect.Field;

/**
 * Created by Evegeny on 14/11/2016.
 */
public class InjectByTypeObjectConfigurer implements ObjectConfigurer {
    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> type = t.getClass();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectByType.class)) {
                Object value = ObjectFactory.getInstance().createObject(field.getType());
                field.setAccessible(true);
                field.set(t,value);
            }
        }
    }
}


