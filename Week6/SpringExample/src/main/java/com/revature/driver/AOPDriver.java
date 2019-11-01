package com.revature.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.service.StockMarketService;

public class AOPDriver {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("annotate.xml");
		
		StockMarketService sms = (StockMarketService) ac.getBean("stockMarketService");
		
		System.out.println(sms.getPrice("APPL"));
		
	}

}
