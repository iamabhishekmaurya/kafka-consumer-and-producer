package com.kafka.consumer.springkafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "dustbiin", groupId = "groupId")
    void listener1(String data) {
        System.out.println("Listener Data: " + data);
    }

    // @KafkaListener(topics = "dustbiin2", groupId = "groupId2")
    // void listener2(String data) {
    //     System.out.println("Listener Data: " + data);
    // }
}
