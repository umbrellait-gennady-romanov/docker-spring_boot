package com.umbrellait.docker_spring_boot.service;


import com.umbrellait.docker_spring_boot.model.Message;

import java.util.List;

public interface MessageService {
    Message getById(long id);
    List<Message> getByDateAnd3Char(String dateStart, String dateEnd, String search);
}
