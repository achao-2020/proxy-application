package com.achao.proxy.demo.service;

/**
 * @author licc3
 * @date 2023-3-17 15:48
 */
public class UserServiceImp implements UserService{
    @Override
    public String getUsername(String uesrname) {
        return "用户名：username";
    }
}