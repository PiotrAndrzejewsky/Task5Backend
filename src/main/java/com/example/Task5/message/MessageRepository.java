package com.example.Task5.message;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MessageRepository extends CrudRepository<MessageEntity, Long> {
    @Query(value = "SELECT * FROM messages WHERE recipient = :recipient", nativeQuery = true)
    List<MessageEntity> findAllByRecipient(String recipient);
}
