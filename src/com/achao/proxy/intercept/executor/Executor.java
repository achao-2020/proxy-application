package com.achao.proxy.intercept.executor;

/**
 * 执行器抽象类
 * @author licc3
 * @date 2023-3-24 15:36
 */
public interface Executor {

    /**
     * 查询方法
     */
    void query();

    /**
     * 插入方法
     */
    void insert();
}
