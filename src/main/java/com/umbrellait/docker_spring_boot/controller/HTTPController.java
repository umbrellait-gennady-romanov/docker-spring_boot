package com.umbrellait.docker_spring_boot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HTTPController {

    @GetMapping
    public String responseGet() {

        return "{“method”:“GET”, “text”: “Queries using Get can only retrieve data”}";
    }

    @PutMapping
    public String responsePut() {
        return "{“method”:“PUT”, “text”: “Used to replace an existing object.”}";
    }

    @PostMapping
    public String responsePost() {
        return "{“method”:“POST”, “text”: “Sends data to the server to create a new object.”}";
    }

    @DeleteMapping
    public String responseDelete() {
        return "{“method”:“Delete”, “text”: “Delete removes the specified resource.”}";
    }

    @PatchMapping
    public String responsePatch() {
        return "{“method”:“Patch”, “text”: “Used to partially modify a resource.”}";
    }
}
