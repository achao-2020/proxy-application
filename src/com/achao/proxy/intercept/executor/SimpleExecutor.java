package com.achao.proxy.intercept.executor;

import com.achao.proxy.intercept.executor.Executor;

/**
 * 简单的实现
 * @author licc3
 * @date 2023-3-24 16:31
 */
public class SimpleExecutor implements Executor {
    @Override
    public void query() {
        System.out.println("执行了查询方法...");
    }

    @Override
    public void insert() {
        System.out.println("执行了插入方法...");
    }
}