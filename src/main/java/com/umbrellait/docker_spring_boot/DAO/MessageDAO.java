package com.umbrellait.docker_spring_boot.DAO;

import com.umbrellait.docker_spring_boot.model.Message;

public interface MessageDAO {
    Message getMessageById(long id);
//    void addMessage(Message message);

}
