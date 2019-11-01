package com.revature.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StockMarketAspect {

	@Before("execution(double com.revature.service.StockMarketService.getPrice(String))")
	public void beforeCheckingPrice() {
		System.out.println("Grabbing stock price");
	}
	
	@After("execution(double com.revature.service.StockMarketService.getPrice(String))")
	public void afterCheckingPrice() {
		System.out.println("after getting stock price");
	}
	
}
