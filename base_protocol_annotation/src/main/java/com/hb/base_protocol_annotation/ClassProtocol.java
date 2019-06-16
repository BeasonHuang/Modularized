package com.hb.base_protocol_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author huangbiao
 * @data 2019 2019-06-15 22:13
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
public @interface ClassProtocol {

    String[] types();

    int id() default 0;

}
