package com.server.hotel_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HotelServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelServerApplication.class, args);
	}

}
