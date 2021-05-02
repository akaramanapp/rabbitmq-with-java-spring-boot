package com.rabbitmqmicroservice.producer.producer;

import com.rabbitmqmicroservice.producer.model.Notification;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class NotificationProducer {

    @Value("${producer.rabbit.routing.name}")
    private String routingName;

    @Value("${producer.rabbit.exchange.name}")
    private String exchangeName;


    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendToNotificationMessage(Notification notification) {
        rabbitTemplate.convertAndSend(exchangeName, routingName, notification);
    }
}
