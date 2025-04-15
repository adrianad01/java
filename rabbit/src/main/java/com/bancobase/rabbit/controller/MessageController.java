package com.bancobase.rabbit.controller;

import com.bancobase.rabbit.publisher.RabbitMQProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MessageController {

    //Paso 5: Crear el controlador para enviar el mensaje
    public MessageController(RabbitMQProducer rabbitMQProducer) {
        this.rabbitMQProducer = rabbitMQProducer;
    }

    private RabbitMQProducer rabbitMQProducer;


    @GetMapping("/publish")
    public ResponseEntity<String> sendMessage(@RequestParam ("message") String message) {
        rabbitMQProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to Rabbit");
    }
}
