package com.city;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication			//initiation of string boot application
@EnableEurekaClient				//enabling eureka client
public class HeritageTourCityCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeritageTourCityCustomerApplication.class, args);
	}

}
