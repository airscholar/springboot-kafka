package com.airscholar.kafkasample.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic airscholarTopic() {
        return TopicBuilder.name("airscholar")
//                .partitions(3)
//                .replicas(1)
                .build();
    }
}
