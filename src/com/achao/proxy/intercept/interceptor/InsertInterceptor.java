package com.achao.proxy.intercept.interceptor;

import com.achao.proxy.intercept.annocation.InterceptorClass;
import com.achao.proxy.intercept.executor.Executor;
import com.achao.proxy.intercept.Invocation;
import com.achao.proxy.intercept.executor.ExecutorProxy;

import java.lang.reflect.Proxy;

/**
 * @author licc3
 * @date 2023-3-24 17:17
 */
@InterceptorClass(targets = Executor.class, methods = "insert")
public class InsertInterceptor extends AbstractInterceptor{
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println(this.getClass().getSimpleName() + "执行了拦截插入的方法");
        return invocation.proceed();
    }
}