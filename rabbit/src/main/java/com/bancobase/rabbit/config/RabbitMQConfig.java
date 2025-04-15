package com.bancobase.rabbit.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Bean for rabbitmq queue
 * Bean for rabbitmq exchange
 * Bean for binding
 */
@Configuration
public class RabbitMQConfig {

    //Paso 1.1: Asignar el nombre de la cola, se define en el application properties
    @Value("${rabbitmq.queue.name}")
    private String queue;

    @Value("${rabbitmq.json.queue.name}")
    private String jsonQueue;

    //Paso 2.1: Asignar el nombre del exchange, se define en el application properties
    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    //Paso 3.1: Asignar el nombre del exchange, se define en el application properties
    @Value("${rabbitmq.routing.key}")
    private String routingKey;

    @Value("${rabbitmq.json.routing.key}")
    private String jsonRoutingKey;


    //Paso 1: Configurar una queue y asignarle el nombre
    @Bean
    public Queue queue() {
        return new Queue(queue);
    }

    @Bean
    public Queue jsonQueue() {
        return new Queue(jsonQueue);
    }

    //Paso 2: Configurar el exchange
    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(exchange);
    }

    //Paso 3: Configurar el binding entre la queue y exchange usando la routing key
    @Bean
    public Binding binding() {
        return BindingBuilder
                .bind(queue())
                .to(exchange())
                .with(routingKey);
    }

    @Bean
    public Binding bindingJson() {
        return BindingBuilder
                .bind(jsonQueue())
                .to(exchange())
                .with(jsonRoutingKey);
    }

    //Convertir los mensajes hacia json
    @Bean
    public MessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public AmqpTemplate amqpTemplate(ConnectionFactory connectionFactory) {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(messageConverter());
        return rabbitTemplate;
    }
}
