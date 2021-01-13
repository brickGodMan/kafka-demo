package com.qiancy.kafka.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author qcyki
 */
@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
//		SpringApplication application = new SpringApplication(SpringbootApplication.class);
//		application.setWebApplicationType(WebApplicationType.NONE);
//		application.run(args);

		SpringApplication.run(SpringbootApplication.class,args);

	}

}
