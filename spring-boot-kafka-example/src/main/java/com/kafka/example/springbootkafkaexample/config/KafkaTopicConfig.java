package com.kafka.example.springbootkafkaexample.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic dustbiinTopic() {
        return TopicBuilder.name("dustbiin").build();
    }

    // @Bean
    // public NewTopic dustbiinTwoTopic() {
    //     return TopicBuilder.name("dustbiin2").build();
    // }
}
