package com.revature.exception;

public class MyMoreSpecificException extends MyException {

	private static String message = "THIS IS CAUSED BY REASONS UNKNOWN";
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}
	
	

	
	
}
