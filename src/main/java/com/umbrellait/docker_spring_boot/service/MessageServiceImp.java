package com.umbrellait.docker_spring_boot.service;

import com.umbrellait.docker_spring_boot.model.Message;
import com.umbrellait.docker_spring_boot.repo.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MessageServiceImp implements MessageService {
    @Autowired
    MessageRepository messageRepository;

    public MessageServiceImp(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    @Transactional
    public Message getById(long id) {
        return messageRepository.getOne(id);
    }

    @Override
    public List<Message> getByDateAnd3Char(String dateStart, String dateEnd, String search) {
        return null;
    }
}
