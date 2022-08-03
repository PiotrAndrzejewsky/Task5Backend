package com.example.Task5.message;

import javax.persistence.*;

@Entity
@Table(name = "messages")
public class MessageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private Long mMessageId;

    @Column(name = "recipient")
    private String mRecipient;

    @Column(name = "sender")
    private String mSender;

    @Column(name = "title")
    private String mTitle;

    @Column(name = "message")
    private String mMessage;

    public MessageEntity() {
    }

    public MessageEntity(String recepient, String sender, String title, String message) {
        mRecipient = recepient;
        mSender = sender;
        mTitle = title;
        mMessage = message;
    }

    public Long getMessageId() {
        return mMessageId;
    }

    public void setMessageId(Long messageId) {
        mMessageId = messageId;
    }

    public String getRecipient() {
        return mRecipient;
    }

    public void setRecipient(String recipient) {
        mRecipient = recipient;
    }

    public String getSender() {
        return mSender;
    }

    public void setSender(String sender) {
        mSender = sender;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(String message) {
        mMessage = message;
    }
}
