package com.fiendo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author fiendo
 * @version 1.0 (2019/12/4)
 */

@EnableFeignClients(basePackages = "com.fiendo.feign")
@SpringBootApplication(scanBasePackages = "com.fiendo")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
