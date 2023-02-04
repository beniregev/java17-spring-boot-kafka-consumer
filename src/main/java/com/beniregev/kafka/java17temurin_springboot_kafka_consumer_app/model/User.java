package com.beniregev.kafka.java17temurin_springboot_kafka_consumer_app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private String dept;
    private Integer salary;
}
