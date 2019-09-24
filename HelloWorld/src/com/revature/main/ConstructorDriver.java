package com.revature.main;

import com.revature.pojos.Quadralateral;

public class ConstructorDriver {
	
	public static void main(String[] args) {
		//Quadralateral q;  Decalration
		//new Quadralateral();  Instantiation
		//q = null;  Initialization
		Quadralateral q = new Quadralateral();
		
		System.out.println(q.getAngles());
		System.out.println(q.getSideLengths());
		
	}

}
