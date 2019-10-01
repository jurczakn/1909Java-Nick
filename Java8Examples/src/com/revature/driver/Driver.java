package com.revature.driver;

import com.revature.lambda.DoStuff;

public class Driver {

	public static void main(String[] args) {

		DoStuff doStuff = (object) -> {
		};
		doStuff.doTheThing(new Object());
		doStuff = object -> {
			System.out.println("My object is " + object.toString());
		};

		callDoStuff(doStuff);

		callDoStuff((o) -> {
			if (o.equals("true")) {
				System.out.println("ok");
			} else {
				System.out.println("false");
			}
		});
	}

	public static void callDoStuff(DoStuff ds) {
		ds.doTheThing(new int[] { 3, 4, 5, 23, 6523, 4, 323 });
	}

}
