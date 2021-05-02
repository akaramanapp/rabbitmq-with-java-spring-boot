package com.rabbitmqmicroservice.producer.model;

import java.io.Serializable;

public class Notification implements Serializable {
    private String message;
    private String messageType;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    @Override
    public String toString() {
        return "notification{" +
                "message='" + message + '\'' +
                ", messageType='" + messageType + '\'' +
                '}';
    }
}
