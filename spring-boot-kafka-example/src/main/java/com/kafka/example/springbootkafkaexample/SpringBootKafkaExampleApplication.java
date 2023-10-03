package com.kafka.example.springbootkafkaexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootKafkaExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaExampleApplication.class, args);
	}

	// @Bean
	// public CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
	// 	return args -> {
	// 		for (int i = 0; i < 10; i++) {
	// 			kafkaTemplate.send("dustbiin", "Hello From first Example: " + i);
	// 		}
	// 	};
	// }

}
