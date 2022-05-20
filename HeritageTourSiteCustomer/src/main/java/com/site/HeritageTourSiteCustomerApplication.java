package com.site;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HeritageTourSiteCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeritageTourSiteCustomerApplication.class, args);
	}

}
