package com.achao.proxy.mapper;

/**
 * @author licc3
 * @date 2023-3-17 18:25
 */
public class Main {
    public static void main(String[] args) {
        DemoMapper demoMapper = MapperProxyFactory.getMapper(DemoMapper.class);
        demoMapper.select();
    }
}