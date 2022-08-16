package com.merrulul.springboothelloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: SpringBootHelloWorld
 * @BelongsPackage: com.merrulul.springboothelloworld.controller
 * @Author: dengzhiqiang
 * @CreateTime: 2022-08-16  17:48
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
public class HelloSpringBoot {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }
}
