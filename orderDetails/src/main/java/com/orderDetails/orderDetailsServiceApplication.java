package com.orderDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class orderDetailsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(orderDetailsServiceApplication.class, args);
	}

}
