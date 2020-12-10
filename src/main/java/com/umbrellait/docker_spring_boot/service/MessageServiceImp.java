package com.umbrellait.docker_spring_boot.service;

import com.umbrellait.docker_spring_boot.model.Message;
import com.umbrellait.docker_spring_boot.repo.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class MessageServiceImp implements MessageService {
    @Autowired
    MessageRepository messageRepository;

    public MessageServiceImp(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    @Transactional
    public void addMessage(Message message) {
        messageRepository.save(message);
    }

    @Override
    @Transactional
    public Optional<Message> getById(long id) {
        return messageRepository.findById(id);
    }

    @Override
    public List<Message> getMessageList(LocalDateTime startDate, LocalDateTime endDate, String search) {
        return messageRepository.getMessageList(startDate, endDate, search);
    }
}
