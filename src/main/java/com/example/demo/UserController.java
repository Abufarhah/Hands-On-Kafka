package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    private static final String TOPIC = "Example_Topic";

    @PostMapping("/produce")
    public String produce(@RequestBody User user) {
        kafkaTemplate.send(TOPIC, user);
        return "produced successfully";
    }

}
