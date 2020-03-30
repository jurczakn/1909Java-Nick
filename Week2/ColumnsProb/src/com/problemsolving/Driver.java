package com.problemsolving;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		
		String res = "";
		
		while (val > 0) {
			char c = (char) (val%27 + 'A' -1);
			res += c;
			val -= val%27;
		}
		System.out.println(res);

	}

}
