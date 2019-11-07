package com.revature.controller;

import com.revature.bean.Purchase;
import com.revature.bean.PurchaseDTO;

public interface PurchaseController {
	
	public PurchaseDTO getPurchase(String orderNumber);
	
	public Purchase makePurchase(Purchase purchase);

}
