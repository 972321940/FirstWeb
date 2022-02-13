package com.wuxie.firstweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstWebApplication {

    public static void main(String[] args) {
        System.err.println("****启动第一个web项目*****");
        SpringApplication.run(FirstWebApplication.class, args);
    }

}
