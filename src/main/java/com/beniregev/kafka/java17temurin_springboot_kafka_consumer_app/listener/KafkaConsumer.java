package com.beniregev.kafka.java17temurin_springboot_kafka_consumer_app.listener;

import com.beniregev.kafka.java17temurin_springboot_kafka_consumer_app.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "kafka-app-topic", groupId = "myGroup")
    public void consume(String message) {
        System.out.println(String.format("Consumed message \"%s\"", message));

    }

    @KafkaListener(topics = "kafka-app-json-topic",
            groupId = "myGroupJson",
            containerFactory = "userKafkaListenerFactory")
    public void consume(User user) {
        System.out.println("Consumed message " + user);

    }
}
