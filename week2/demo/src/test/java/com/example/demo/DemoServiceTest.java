package com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class DemoServiceTest {

	private static final Logger log = LoggerFactory.getLogger(DemoServiceTest.class);

	@Autowired
	private DemoService demoService1;

	@Autowired
	private DemoService demoService2;

	@Test
	public void testServiceSingleton() {
		// Log the instances
		log.info("demoService1 instance: {}", demoService1);
		log.info("demoService2 instance: {}", demoService2);

		// Check if both instances are the same
		assertThat(demoService1).isSameAs(demoService2);
		log.info("Both services are the same instance: {}", demoService1 == demoService2);
	}
}
