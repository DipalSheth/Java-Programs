package com.sheth.arrays;

public class LargestNumber {

	public static void main(String[] args) {
		 
		int array[] = {20,27,15,4,89,67,30};
		
		int temp=array[0];
		
		for(int i=0;i<array.length;i++){
			if(temp<array[i]){
				temp=array[i];
			}
		}
		System.out.println("Larget number is: " + temp);

	}

}
