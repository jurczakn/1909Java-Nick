package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulExampleApplication.class, args);
	}

}
