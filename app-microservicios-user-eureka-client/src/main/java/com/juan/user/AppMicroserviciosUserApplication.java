package com.juan.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.juan.user.entity"})
public class AppMicroserviciosUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppMicroserviciosUserApplication.class, args);
	}

}
