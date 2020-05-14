package ru.ariona.springkafkaproducer.sheduler;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.ariona.springkafkaproducer.service.MessageService;

@Component
@EnableScheduling
@RequiredArgsConstructor
public class MessageScheduler {
    private final MessageService messageService;
    private Long count = 0L;

    @Scheduled(cron = "*/3 * * * * *")
    public void sendMessage() {
        messageService.sendMessageToKafka(String.valueOf(count));
        count++;
    }
}
