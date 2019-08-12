package com.example.feignclient.controller;

import com.example.feignclient.service.HelloService;
import com.example.feignclient.service.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloServiceImpl helloService;

    @GetMapping("/hi")
    String sayHello(String name){
        return helloService.sayHello(name);
    }
}
