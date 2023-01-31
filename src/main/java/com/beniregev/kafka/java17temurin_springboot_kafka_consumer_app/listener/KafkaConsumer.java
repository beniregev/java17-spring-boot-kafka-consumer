package com.beniregev.kafka.java17temurin_springboot_kafka_consumer_app.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "kafka-app-topic", groupId = "myGroup")
    public void comsume(String message) {
        System.out.println(String.format("Consumed message \"%s\"", message));

    }
}
