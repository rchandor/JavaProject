package com.example.DemoJson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages="com.example.**")
@EnableAutoConfiguration
@EntityScan(basePackages="com.example.bean.*")
@ComponentScan(basePackages="com.example.**")
public class DemoJsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJsonApplication.class, args);
	}
}
