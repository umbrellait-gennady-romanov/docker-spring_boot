package com.umbrellait.docker_spring_boot.repo;

import com.umbrellait.docker_spring_boot.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {
    Message getById(long id);
    List<Message> getByDateAnd3Char(String dateStart, String dateEnd, String search);
}
