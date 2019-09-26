package com.revature.util;

import com.revature.exception.CalculatorException;

public interface Calculator <T extends Number> {
	
	public T add(T a, T b) throws CalculatorException;
	
	public T sub(T a, T b);
	
	public T mult(T a, T b);
	
	public T div(T a, T b);
	
	public T sqrt(T a);
	
	public T pow(T a, T b);

}
