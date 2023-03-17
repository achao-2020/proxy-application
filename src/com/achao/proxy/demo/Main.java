package com.achao.proxy.demo;

import com.achao.proxy.demo.invotion.MyInvocation;
import com.achao.proxy.demo.service.UserService;

import java.lang.reflect.Proxy;

/**
 * @author licc3
 * @date 2023-3-17 15:44
 */
public class Main {

    public static void main(String[] args) {
        Class[] classes = new Class[]{UserService.class};
        UserService instance = (UserService)Proxy.newProxyInstance(UserService.class.getClassLoader(), classes, new MyInvocation());
        instance.getUsername("achao");
        System.out.println(instance.getClass());
    }
}