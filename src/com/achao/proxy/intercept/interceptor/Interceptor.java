package com.achao.proxy.intercept.interceptor;

import com.achao.proxy.intercept.executor.Executor;
import com.achao.proxy.intercept.Invocation;

/**
 * @author licc3
 * @date 2023-3-24 17:01
 */
public interface Interceptor {

    /**
     * 拦截逻辑方法
     * @param invocation
     * @return
     * @throws Throwable
     */
    public Object intercept(Invocation invocation) throws Throwable;

    /**
     * 生成代理对象
     * @param executor
     * @return
     */
    Executor wrap(Executor executor);
}