package com.qiancy.kafka.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootTest
class SpringbootApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@Test
	public void test() {
		kafkaTemplate.send("qiancytest","spring-kafka","hello spring kafka");
	}
}
