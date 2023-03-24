package com.achao.proxy.intercept.executor;

import com.achao.proxy.intercept.Invocation;
import com.achao.proxy.intercept.interceptor.Interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Set;

/**
 * @author licc3
 * @date 2023-3-24 17:25
 */
public class ExecutorProxy implements InvocationHandler {

    private Object target;

    private Interceptor interceptor;

    private Set<String> supportMethods;

    public ExecutorProxy(Object target, Interceptor interceptor, Set<String> supportMethods) {
        this.target = target;
        this.interceptor = interceptor;
        this.supportMethods = supportMethods;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        // 执行拦截器方法
        if (supportMethods.contains(method.getName())) {
            return interceptor.intercept(new Invocation(target, method, objects));
        }
        return method.invoke(target, objects);
    }
}