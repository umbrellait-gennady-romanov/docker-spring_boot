package com.umbrellait.docker_spring_boot.controller;

import com.umbrellait.docker_spring_boot.model.Message;
import com.umbrellait.docker_spring_boot.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class HTTPController {
    MessageService messageService;

    @Autowired
    public HTTPController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping(value = "/message/{id}")
    public ResponseEntity<Message> responseGetId(@PathVariable Long id) {
        Optional<Message> message = messageService.getById(id);
            if(message.isPresent())
                return ResponseEntity.ok(message.get());
            return ResponseEntity.notFound().build();
    }

    @GetMapping(value = "/message/{startDate}/{endDate}/{search}")
    public ResponseEntity<Iterable<Message>> responseGetId(@PathVariable LocalDateTime startDate,
                                                           @PathVariable LocalDateTime endDate,
                                                           @PathVariable String search) {
        return ResponseEntity.ok(messageService.getMessageList(startDate, endDate, search));
    }

    @GetMapping
    public String responseGet () {
        Message message = new Message("Get", "Queries using Get can only retrieve data", LocalDateTime.now());
        messageService.addMessage(message);
        return "method GET added " + LocalDateTime.now();
    }

    @PutMapping
    public String responsePut() {
        Message message = new Message("Put", "Used to replace an existing object.", LocalDateTime.now());
        messageService.addMessage(message);
        return "method PUT added " + LocalDateTime.now();
    }

    @PostMapping
    public String responsePost() {
        Message message = new Message("Post", "Sends data to the server to create a new object.", LocalDateTime.now());
        messageService.addMessage(message);
        return "method Post added " + LocalDateTime.now();
    }

    @DeleteMapping
    public String responseDelete() {
        Message message = new Message("Delete", "Delete removes the specified resource.", LocalDateTime.now());
        messageService.addMessage(message);
        return "method Delete added " + LocalDateTime.now();
    }

    @PatchMapping
    public String responsePatch() {
        Message message = new Message("Patch", "Used to partially modify a resource.", LocalDateTime.now());
        messageService.addMessage(message);
        return "method Patch added " + LocalDateTime.now();
    }
}
