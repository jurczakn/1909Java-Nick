package com.revature.main;

import java.util.HashMap;

public class HelloWorld {

	static public void main(String pirateSounds[]) {
		System.out.println("Hello World");
		System.out.println(pirateSounds[0]);
		String str = "Hello World";
		System.out.println(str.substring(2).toUpperCase().replace(str.toUpperCase().substring(6, 9), "new").concat(str.split(" ")[0]).concat(str.replace('e', '2').substring(0, 3)).intern());
	}

}
