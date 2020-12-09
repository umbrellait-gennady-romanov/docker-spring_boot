package com.umbrellait.docker_spring_boot.DAO;

import com.umbrellait.docker_spring_boot.model.Message;
import org.springframework.stereotype.Repository;

@Repository
public class MessageDAOImp implements MessageDAO {
    @Override
    public Message getMessageById(long id) {
        return null;
    }
}
