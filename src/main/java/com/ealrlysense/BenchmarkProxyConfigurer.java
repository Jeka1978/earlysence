package com.ealrlysense;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Evegeny on 14/11/2016.
 */
public class BenchmarkProxyConfigurer implements ProxyConfigurer {
    @Override
    public <T> T wrapWithProxy(T t, Class<T> originalClass) {
        if (originalClass.isAnnotationPresent(Benchmark.class)) {
            return (T) Proxy.newProxyInstance(originalClass.getClassLoader(), originalClass.getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    System.out.println("*************BENCHMARK********** "+method.getName() + " STARTED");
                    long before = System.nanoTime();
                    Object retVal = method.invoke(t, args);
                    long after = System.nanoTime();
                    System.out.println(after-before);
                    System.out.println("*************BENCHMARK********** "+method.getName() + " FINISHED");
                    return retVal;
                }
            });
        }
        return t;
    }
}
