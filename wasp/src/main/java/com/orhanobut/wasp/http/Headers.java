package com.orhanobut.wasp.http;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Add a static header to request
 *
 * @author Orhan Obut
 */
@Documented
@Target(METHOD)
@Retention(RUNTIME)
public @interface Headers {
    String[] value();
}
