package com.keltenfalez;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "kafkaTopic",
            groupId = "foo"
    )
    void listener(String data) {
        System.out.println("Listener received: " + data + " 🎊");
    }
}