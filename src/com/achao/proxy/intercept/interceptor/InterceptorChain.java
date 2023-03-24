package com.achao.proxy.intercept.interceptor;

import com.achao.proxy.intercept.executor.Executor;

import java.util.List;

/**
 * @author licc3
 * @date 2023-3-24 17:18
 */
public class InterceptorChain {
    private List<Interceptor> interceptors;

    public InterceptorChain(List<Interceptor> interceptors) {
        this.interceptors = interceptors;
    }


    public Executor plugin(Executor executor) {
        for (Interceptor interceptor : interceptors) {
            // 循环返回代理对象，套娃
            executor = interceptor.wrap(executor);
        }
        return executor;
    }
}