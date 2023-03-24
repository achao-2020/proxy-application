package com.achao.proxy.intercept.interceptor;

import com.achao.proxy.intercept.annocation.InterceptorClass;
import com.achao.proxy.intercept.executor.Executor;
import com.achao.proxy.intercept.executor.ExecutorProxy;

import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author licc3
 * @date 2023-3-24 17:28
 */
public abstract class AbstractInterceptor implements Interceptor{
    /**
     * 生成代理对象
     * @param executor
     * @return
     */
    @Override
    public Executor wrap(Executor executor) {
        InterceptorClass annotation = this.getClass().getAnnotation(InterceptorClass.class);
        if (annotation == null || annotation.methods().length == 0) {
            // 不进行代理
            return executor;
        }

        // 能够代理的类
        Class[] interfaces = annotation.targets();
        return (Executor) Proxy.newProxyInstance(
                Executor.class.getClassLoader(),
                interfaces,
                new ExecutorProxy(executor, this, Arrays.stream(annotation.methods()).collect(Collectors.toSet())));
    }
}