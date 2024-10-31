package com.spring.boot.demo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
    @GetMapping("/getName")
    public String getNameDemo()
    {
        return "Hello Pratik";
    }
}
