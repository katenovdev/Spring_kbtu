package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo", "com.example.Config"})
public class DemoApplication {
	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

//	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//	}
	public static void main(String[] args) {
		log.info("Starting the application...");
		SpringApplication.run(DemoApplication.class, args);
		log.info("Application started successfully!");
	}
}
