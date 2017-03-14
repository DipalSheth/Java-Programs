package com.sheth.arrays;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,5,7};
		
		int missingNumber = getMissingNumber(array,7);
		System.out.println("Missing number in" + Arrays.toString(array) + " Array is: " + missingNumber);

	}

	private static int getMissingNumber(int[] array, int n) {
		int actualSum=0;
		int expectedSum = (n*(n+1)/2);
		for(int i:array){
			actualSum = actualSum + i;
		}
		return expectedSum - actualSum;
	}

}
