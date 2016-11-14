package com.ealrlysense;

/**
 * Created by Evegeny on 14/11/2016.
 */
public interface Config {
    <T> Class<T> getImpl(Class<T> type);
}
