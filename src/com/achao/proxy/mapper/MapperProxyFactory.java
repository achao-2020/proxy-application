package com.achao.proxy.mapper;

import java.lang.reflect.Proxy;

/**
 * @author licc3
 * @date 2023-3-17 18:10
 */
public class MapperProxyFactory {

    private static final MapperInvocation mapperInvocation = new MapperInvocation();

    /**
     * 获取mapper动态代理类
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T> T getMapper(Class<T> tClass) {
        return (T) Proxy.newProxyInstance(MapperProxyFactory.class.getClassLoader(), new Class[]{tClass}, mapperInvocation);
    }

}