package ru.ariona.springkafkaproducer.domain;

import lombok.Data;

@Data
public class Message {
    private Long id;
    private String message;
}
