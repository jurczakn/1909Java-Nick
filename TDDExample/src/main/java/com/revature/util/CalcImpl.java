package com.revature.util;

public class CalcImpl<T extends Number> implements Calculator<T> {

	@Override
	public T add(T a, T b) {

		Number ret = a.doubleValue() + b.doubleValue();

		if (!(a instanceof Double) && !(a instanceof Float)) {
			ret = Math.floor(ret.doubleValue());
			
			if (a instanceof Integer) {
				ret = ret.intValue();
			}
			
		}

		return (T) ret;
	}

	@Override
	public T sub(T a, T b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T mult(T a, T b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T div(T a, T b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T sqrt(T a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T pow(T a, T b) {
		// TODO Auto-generated method stub
		return null;
	}

}
