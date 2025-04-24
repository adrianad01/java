package com.bancobase.rabbit.publisher;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Clase que creara el producer para construir el mensaje y enviarlo al exchange
 */
@Service
@Slf4j
public class RabbitMQProducer {

    //Paso 4: Crear el producer

    @Value("${rabbitmq.exchange.name}")
    private String exchangeName;

    @Value("${rabbitmq.routing.key}")
    private String routingKey;

    private final RabbitTemplate rabbitTemplate;

    public RabbitMQProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }


    public void sendMessage(String message) {
        log.info("Sending message: {}", message);
        rabbitTemplate.convertAndSend(exchangeName, routingKey, message);
    }
}
