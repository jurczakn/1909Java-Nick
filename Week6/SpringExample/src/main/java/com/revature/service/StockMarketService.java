package com.revature.service;

import org.springframework.stereotype.Service;

@Service
public class StockMarketService {

	public double getPrice(String stock) {
		System.out.println("Inside grabbing stock price");
		switch (stock) {

		case "APPL":
			return 600.54;

		case "GOOG":
			return 786.43;

		case "AMZN":
			return 4000.00;

		default:
			return 0.0;

		}
	}

	public double debtRatio(String stock) {
		switch (stock) {

		case "APPL":
			return 2.0;

		case "GOOG":
			return -0.32;

		case "AMZN":
			return 0.23;

		default:
			return 0.0;

		}
	}

}
