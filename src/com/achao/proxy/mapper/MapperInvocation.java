package com.achao.proxy.mapper;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author licc3
 * @date 2023-3-17 18:12
 */
public class MapperInvocation implements InvocationHandler {
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        if (Object.class.equals(method.getDeclaringClass())) {
            // toString, equals等方法，直接调用本方法
            return method.invoke(this, objects);
        }
        // 调用的方法，通过mapperMethod解析
        MapperMethod mapperMethod = new MapperMethod(o.getClass().getInterfaces()[0], method, objects);
        return mapperMethod.invoke();
    }
}