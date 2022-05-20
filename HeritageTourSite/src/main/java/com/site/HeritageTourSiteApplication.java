package com.site;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HeritageTourSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeritageTourSiteApplication.class, args);
	}

}
