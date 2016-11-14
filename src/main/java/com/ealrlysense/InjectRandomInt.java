package com.ealrlysense;/**
 * Created by Evegeny on 14/11/2016.
 */

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
public @interface InjectRandomInt {
    int min();
    int max();
}
