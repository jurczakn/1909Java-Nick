package com.revature.service;

import com.revature.bean.Purchase;

public interface PurchaseService {
	
	public Purchase createPurchase(Purchase purchase);
	
	public Purchase viewPurchase(String orderNumber);

}
