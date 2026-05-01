package com.example.fsdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Task15Client1StudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Task15Client1StudentServiceApplication.class, args);
	}

}
