package com.fiendo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
