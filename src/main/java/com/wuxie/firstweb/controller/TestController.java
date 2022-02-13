package com.wuxie.firstweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuxie
 */
@RestController
public class TestController {

    @GetMapping("hello")
    public String hello(String name){
        return "你好:"+name;
    }
}
