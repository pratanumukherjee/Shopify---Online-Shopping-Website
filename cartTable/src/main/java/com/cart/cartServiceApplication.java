package com.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class cartServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(cartServiceApplication.class, args);
	}

}
