package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringJenkinApplication.class, args);
		System.out.println("Running");
	}

}
