package ru.ariona.springkafkaproducer.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message {
    private Long id;
    private String message;
}
