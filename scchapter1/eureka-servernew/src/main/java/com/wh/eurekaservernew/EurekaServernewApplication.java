package com.wh.eurekaservernew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServernewApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServernewApplication.class, args);
	}

}

