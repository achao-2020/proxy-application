package com.achao.proxy.intercept.executor;

import com.achao.proxy.intercept.interceptor.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author licc3
 * @date 2023-3-24 17:00
 */
public class ExecutorFactory {

    public static Executor newExecutor() {
        // 代理目标执行器实例
        SimpleExecutor executor = new SimpleExecutor();
        // 两个拦截器
        QueryInterceptor queryInterceptor = new QueryInterceptor();
        InsertInterceptor insertInterceptor = new InsertInterceptor();
        List<Interceptor> interceptors = new ArrayList<>(2);
        interceptors.add(queryInterceptor);
        interceptors.add(insertInterceptor);
        InterceptorChain interceptorChain = new InterceptorChain(interceptors);
        // 生成代理执行器
        return interceptorChain.plugin(executor);
    }
}