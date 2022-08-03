package com.example.Task5.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
        List<MessageEntity> messages = new ArrayList<MessageEntity>();
        mMessageRepository.findAll().forEach(messages::add);
        for (int i = 0; i < messages.size(); i++) {
            if (!Objects.equals(messages.get(i).getRecipient(), recipient)) {
                messages.remove(i);
            }
        }
        return messages;
    }
}
