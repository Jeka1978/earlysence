package com.ealrlysense;

/**
 * Created by Evegeny on 14/11/2016.
 */
public interface ProxyConfigurer {
    <T> T wrapWithProxy(T t, Class<T> originalClass);
}
