package com.example.feignclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl {
    @Autowired
    HelloService helloService;

    public String sayHello(String name){
        return helloService.sayHello(name);
    }
}
