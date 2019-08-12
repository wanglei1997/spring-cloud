package com.example.feignclient.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client")
public interface HelloService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHello(@RequestParam(value = "name",required = false,defaultValue = "wanglei") String name);
}
