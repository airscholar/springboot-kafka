package com.airscholar.kafkasample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "airscholar", groupId = "groupId")
    void listener(String message) {
        System.out.println("Message received: " + message + " 🎉");
    }
}
