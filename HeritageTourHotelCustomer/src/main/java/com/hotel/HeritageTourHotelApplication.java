package com.hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication			//initiation of string boot application
@EnableEurekaClient				//enabling eureka client
public class HeritageTourHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeritageTourHotelApplication.class, args);
	}

}
