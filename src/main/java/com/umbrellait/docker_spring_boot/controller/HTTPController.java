package com.umbrellait.docker_spring_boot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HTTPController {

    @GetMapping
    public String responseGet() {
        return "{“method”:“GET”, “text”: “Hello world”}";
    }

    @PutMapping
    public String responsePut() {
        return "{“method”:“PUT”, “text”: “Hello world”}";
    }

    @PostMapping
    public String responsePost() {
        return "{“method”:“POST”, “text”: “Hello world”}";
    }

}
