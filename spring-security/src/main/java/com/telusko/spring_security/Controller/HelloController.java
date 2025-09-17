package com.telusko.spring_security.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greet(HttpServletRequest req, HttpServletResponse res) {
        return "Hello : " + req.getSession().getId();
    }
}
