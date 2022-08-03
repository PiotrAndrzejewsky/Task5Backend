package com.example.Task5.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class MessageController {

    @Autowired
    private MessageService mMessageService;

    @PostMapping("/messages")
    public void sendMessage(@RequestBody MessageEntity messageEntity) {
        mMessageService.sendMessage(messageEntity);
    }

    @GetMapping("/messages/{recipient}")
    public List<MessageEntity> getAllMessages(@PathVariable String recipient) {
        return mMessageService.getAllMessages(recipient);
    }
}
