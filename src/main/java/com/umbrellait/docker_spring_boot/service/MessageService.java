package com.umbrellait.docker_spring_boot.service;


import com.umbrellait.docker_spring_boot.model.Message;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface MessageService {
    void addMessage(Message message);
    Optional<Message> getById(long id);
    List<Message> getMessageList(LocalDateTime startDate, LocalDateTime endDate, String search);
}
