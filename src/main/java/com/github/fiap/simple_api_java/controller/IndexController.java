package com.github.fiap.simple_api_java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class IndexController {
    
    @GetMapping
    public String home() {
        return "home";
    }
}
