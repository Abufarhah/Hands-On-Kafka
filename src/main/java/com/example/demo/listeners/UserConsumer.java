package com.example.demo.listeners;

import com.example.demo.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserConsumer {

    private static final String TOPIC = "Example_Topic";

    @KafkaListener(topics = TOPIC, groupId = "user_group")
    public void consume(User message) {
        System.out.println("Consumed message: " + message);
    }
}
