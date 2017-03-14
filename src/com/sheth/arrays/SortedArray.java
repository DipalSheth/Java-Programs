package com.sheth.arrays;

public class SortedArray {
	
	public static boolean isSorted(int[] data){
	    for(int i = 1; i < data.length; i++){
	        if(data[i-1] > data[i]){
	            return false;
	        }
	    }
	    return true;
	}

	public static void main(String[] args) {
		int[] data = {4,6,8,9,10};
		System.out.println(isSorted(data));

	}

}
