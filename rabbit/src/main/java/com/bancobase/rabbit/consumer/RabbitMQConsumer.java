package com.bancobase.rabbit.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * Clase que abarca la lógica del consumer
 */
@Service
@Slf4j
public class RabbitMQConsumer {

//    @RabbitListener(queues = {"${rabbitmq.queue.name}"})
//    public void receiveMessage(String message) {
//        log.info("Received message: {}", message);
//    }
}
