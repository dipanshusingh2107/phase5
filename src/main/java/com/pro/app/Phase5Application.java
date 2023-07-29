package com.pro.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.pro.controller")
public class Phase5Application {

	public static void main(String[] args) {
		SpringApplication.run(Phase5Application.class, args);
	}

}
