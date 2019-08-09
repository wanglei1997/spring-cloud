package com.example.eurekaribbonclient.controller;

import com.example.eurekaribbonclient.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class RibbonController {
    @Autowired
    RibbonService service;

    @GetMapping("/hi")
    String sayHi(){
        return "你好"+service.sayHi();
    }
}
