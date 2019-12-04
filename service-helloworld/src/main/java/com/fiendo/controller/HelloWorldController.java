package com.fiendo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author fiendo
 * @version 1.0 (2019/10/18)
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/helloworld")
    public String helloWorld(){
        return "Hello World!";
    }


    @RequestMapping("/helloworld_ex")
    public String helloWorldException() throws IOException {
        throwException();
        return "Hello World!";
    }

    @RequestMapping("/helloworld_timeout")
    public String helloWorldTimeout() throws Exception {
        Thread.sleep(10 * 1000);
        return "Hello World!";
    }

    private void throwException() throws IOException {
        throw new IOException("helloworld Exception method");
    }

}
