package com.tiou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class ApacheCamelRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApacheCamelRestApplication.class, args);
	}
}
