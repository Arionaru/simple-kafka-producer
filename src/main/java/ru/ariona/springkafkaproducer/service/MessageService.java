package ru.ariona.springkafkaproducer.service;

import lombok.RequiredArgsConstructor;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageService {
    private final KafkaTemplate<String, String> kafkaTemplate;

    @Value("${topic}")
    private String topic;

    public void sendMessageToKafka(String message) {
        kafkaTemplate.send(topic, message);
    }
}
