package com.achao.proxy.intercept;

import com.achao.proxy.intercept.executor.Executor;
import com.achao.proxy.intercept.executor.ExecutorFactory;

/**
 * @author licc3
 * @date 2023-3-24 17:27
 */
public class Main {

    public static void main(String[] args) {
        Executor executor = ExecutorFactory.newExecutor();
        executor.insert();
        executor.query();
    }
}