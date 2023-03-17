package com.achao.proxy.demo.invotion;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author licc3
 * @date 2023-3-17 15:51
 */
public class MyInvocation implements InvocationHandler {
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("动态代理类调用了：【" + method.getName() + "】方法");
        return null;
    }
}