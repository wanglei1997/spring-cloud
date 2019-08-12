package com.example.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHello(@RequestParam(value = "name",required = false,defaultValue = "wanglei") String name){
        return "hi,"+name+". I am from port "+port;
    }
}
