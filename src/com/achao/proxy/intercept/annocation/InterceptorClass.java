package com.achao.proxy.intercept.annocation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/**
 * @author licc3
 * @date 2023-3-24 17:31
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface InterceptorClass {
    /**
     * 支持的接口
     * @return
     */
    Class[] targets();

    /**
     * 支持的方法
     * @return
     */
    String[] methods();
}
