package com.sheth.arrays;

public class CommonNumber {

	public static void main(String[] args) {
		
		
	        int[] arr1 = {5,88,31,19,28};
	        int[] arr2 = {13,28,12,19,40,32,5};
	        for(int i=0;i<arr1.length;i++){
	            for(int j=0;j<arr2.length;j++){
	                if(arr1[i]==arr2[j]){
	                    System.out.println(arr1[i]);
	                }
	            }
	        }
	        
	}

}
