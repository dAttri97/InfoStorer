package com.infostorer.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping
    @RequestMapping("/api/demo")
    public String helloWorld() {
        return "Hello, World!";
    }
}