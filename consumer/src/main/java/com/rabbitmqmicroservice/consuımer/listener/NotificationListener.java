package com.rabbitmqmicroservice.consuımer.listener;

import com.rabbitmqmicroservice.consuımer.model.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {

    @RabbitListener(queues = "${consumer.rabbit.queue.name}")
    public void handleMessage(Notification notification) {
        System.out.println("Message received: " + notification.toString());
    }
}
