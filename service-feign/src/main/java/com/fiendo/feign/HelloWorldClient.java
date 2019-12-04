package com.fiendo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author fiendo
 * @version 1.0 (2019/12/4)
 */
@FeignClient(name = "service-helloworld")
public interface HelloWorldClient {

    @RequestMapping(value = "/helloworld" , method = RequestMethod.GET)
    String helloWorld();

    @RequestMapping(value = "/helloworld_ex" , method = RequestMethod.GET)
    String helloWorldException();

    @RequestMapping(value = "/helloworld_timeout" , method = RequestMethod.GET)
    String helloWorldTimeout();

}
