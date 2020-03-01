package com.codve.provider;

import com.codve.api.HelloService;

/**
 * @author admin
 * @date 2020/2/26 14:36
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "hello " + name;
    }
}
