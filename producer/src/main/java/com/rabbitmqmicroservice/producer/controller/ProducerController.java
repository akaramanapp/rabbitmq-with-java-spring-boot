package com.rabbitmqmicroservice.producer.controller;

import com.rabbitmqmicroservice.producer.model.Notification;
import com.rabbitmqmicroservice.producer.producer.NotificationProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    @Autowired
    NotificationProducer notificationProducer;

    @PostMapping("/send")
    public ResponseEntity<Notification> send(@RequestBody Notification notification){
        notificationProducer.sendToNotificationMessage(notification);
        return ResponseEntity.ok(notification);
    }
}
