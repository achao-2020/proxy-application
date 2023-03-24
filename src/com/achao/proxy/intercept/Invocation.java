package com.achao.proxy.intercept;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 代理类的封装对象
 * @author licc3
 * @date 2023-3-24 17:02
 */
public class Invocation {
    private Object target;

    private Method method;

    private Object[] args;

    public Invocation(Object target, Method method, Object[] args) {
        this.target = target;
        this.method = method;
        this.args = args;
    }

    public Object proceed() throws Throwable {
        return this.method.invoke(target, args);
    }

}