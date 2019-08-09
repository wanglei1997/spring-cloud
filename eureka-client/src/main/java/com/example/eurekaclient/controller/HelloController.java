package com.example.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    String port;
    @GetMapping("/hi")
    String sayHello(@RequestParam(value = "name",required = false,defaultValue = "wanglei") String name){
        return "hi,"+name+". I am from port "+port;
    }
}
