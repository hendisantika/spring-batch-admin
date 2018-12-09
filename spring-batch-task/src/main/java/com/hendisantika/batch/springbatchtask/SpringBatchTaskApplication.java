package com.hendisantika.batch.springbatchtask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;

@SpringBootApplication
@EnableTask
public class SpringBatchTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchTaskApplication.class, args);
	}
}
