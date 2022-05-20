package com.city;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication  	//initiation of string boot application
@EnableEurekaClient			//enabling Eureka client
public class HeritageTourCityApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeritageTourCityApplication.class, args);
	}

}
