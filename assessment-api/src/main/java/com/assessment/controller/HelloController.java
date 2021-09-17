package com.assessment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author FishLi
 * @describe TODO
 * @date 2021-09-14 16:28
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello Spring Boot";
    }
}
