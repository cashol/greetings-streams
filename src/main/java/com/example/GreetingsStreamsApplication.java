package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.test.binder.TestSupportBinderAutoConfiguration;

@SpringBootApplication(exclude = TestSupportBinderAutoConfiguration.class)
public class GreetingsStreamsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingsStreamsApplication.class, args);
	}
}
