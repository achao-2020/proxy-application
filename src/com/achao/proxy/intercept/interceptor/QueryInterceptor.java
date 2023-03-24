package com.achao.proxy.intercept.interceptor;

import com.achao.proxy.intercept.annocation.InterceptorClass;
import com.achao.proxy.intercept.executor.Executor;
import com.achao.proxy.intercept.Invocation;

/**
 * @author licc3
 * @date 2023-3-24 17:16
 */
@InterceptorClass(targets = Executor.class, methods = "query")
public class QueryInterceptor extends AbstractInterceptor{
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println(this.getClass().getSimpleName() + "执行了拦截查询的方法");
        return invocation.proceed();
    }
}