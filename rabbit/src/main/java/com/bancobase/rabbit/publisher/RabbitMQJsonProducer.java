package com.bancobase.rabbit.publisher;

import com.bancobase.rabbit.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RabbitMQJsonProducer {

    @Value("${rabbitmq.exchange.name}")
    private String exchangeName;

    @Value("${rabbitmq.json.routing.key}")
    private String jsonRoutingKey;

    private RabbitTemplate rabbitTemplate;

    public RabbitMQJsonProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendJsonMessage(User user) {
        log.info(":bandeja_de_salida: Enviando mensaje a exchange: {}, con routingKey: {}", exchangeName, jsonRoutingKey);
        rabbitTemplate.convertAndSend(exchangeName, jsonRoutingKey, user);
    }
}
