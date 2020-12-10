package com.umbrellait.docker_spring_boot.repo;

import com.umbrellait.docker_spring_boot.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {

    @Query(
            value = "Select * from message m where m.date Between :startDate and :endDate AND method LIKE ':search%'",
            nativeQuery = true)
    List<Message> getMessageList(LocalDateTime startDate, LocalDateTime endDate, String search);
}
