package com.spring.boot.demo.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
    @GetMapping("/getName")
    public String getNameDemo(HttpServletRequest request)
    {
        return "Hello Pratik"+request.getRequestedSessionId();
    }
}
