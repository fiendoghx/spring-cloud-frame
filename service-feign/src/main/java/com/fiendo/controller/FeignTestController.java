package com.fiendo.controller;

import com.fiendo.feign.HelloWorldClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author fiendo
 * @version 1.0 (2019/12/4)
 */
@RestController
public class FeignTestController {

    @Resource
    private HelloWorldClient helloWorldClient;

    @RequestMapping("sayHelloWorld")
    @ResponseBody
    public String sayHelloWorld(){
        return "feign : " + helloWorldClient.helloWorld();
    }


    @RequestMapping("sayHelloWorldException")
    @ResponseBody
    public String sayHelloWorldException(){
        return "feign : " + helloWorldClient.helloWorldException();
    }

    @RequestMapping("sayHelloWorldTimeout")
    @ResponseBody
    public String sayHelloWorldTimeout(){
        return "feign : " + helloWorldClient.helloWorldTimeout();
    }



}
