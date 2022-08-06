package com.example.Task5.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository mMessageRepository;

    public MessageService(MessageRepository messageRepository) {
        mMessageRepository = messageRepository;
    }

    public void sendMessage(MessageEntity messageEntity) {
        mMessageRepository.save(messageEntity);
    }

    public List<MessageEntity> getAllMessages(String recipient) {
        return mMessageRepository.findAllByRecipient(recipient);
    }
}
