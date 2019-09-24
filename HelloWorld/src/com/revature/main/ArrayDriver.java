package com.revature.main;

import java.util.Arrays;

public class ArrayDriver {
	
	//An Array is an Object
	//A collection of like objects/values
	//Contiguous block of memory
	//Allows for random access
	public static void main(String[] args) {
		int[] intArr = new int[500000];
		int[] intArr2 = {3, 4, 5, 6, 2, 43, 54, 3, 6, 21345,23, 45,324624};
		System.out.println(intArr2[9]);
		for (int x = 0; x < intArr2.length; x++) {
			System.out.println(x+": "+intArr2[x]);
		}
		
		intArr2[0] = -67;
		
		//enhanced for loop
		for (int x : intArr2) {
			System.out.println(x);
		}
		
		int[][][][][][][][] matrix = new int[20][][][][][][][];
		
		Arrays.parallelSort(intArr2);
		
		System.out.println("index: " + Arrays.binarySearch(intArr2, 45));
		
		for (int x : intArr2) {
			System.out.println(x);
		}
		
		//System.out.println(intArr2[-1]);
	}
	

}
