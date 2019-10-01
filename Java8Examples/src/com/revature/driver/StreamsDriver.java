package com.revature.driver;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StreamsDriver {
	
	public static void main(String[] args) {
		
		int[] iArr = {4, 5, 123, 6, 22, 45, 672543, 435, 6, -929, -544};
		
		System.out.println("Entire array: " + Arrays.toString(iArr));
		
		int[] evenArr = Arrays.stream(iArr).filter((i) -> { return (i%2 == 0)?true:false;}).toArray();
		
		System.out.println("Only Even Numbers: " + Arrays.toString(evenArr));
		
		int numberOfOdds = Arrays.stream(iArr).filter((i) -> (i%2!=0)).map(i->1).sum();
		
		System.out.println("Number of odds: " + numberOfOdds);
		
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		
		int differenceOfEvensAndOdds = Arrays.stream(iArr).map(i -> (i%2==0)?1:-1).sum();
		
		System.out.println("difference between evens and odds: " + differenceOfEvensAndOdds);
		
		myMap.entrySet().stream();
		
		
		
	}

}
