package ru.ariona.springkafkaproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.ariona.springkafkaproducer.service.MessageService;

@SpringBootApplication
public class SpringKafkaProducerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringKafkaProducerApplication.class, args);
        MessageService service = context.getBean(MessageService.class);
        service.sendMessageToKafka("123");
//        String topic = "kafka-demo";
//        MyProducer producer = new MyProducer(topic);
//
//        new Thread(() -> {
//            for (int i = 0; i < 100; i++) {
//                producer.send(String.valueOf(i), "Hello from MyProducer" + i);
//            }
//        }).start();
    }

}
