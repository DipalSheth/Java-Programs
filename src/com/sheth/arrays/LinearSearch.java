package com.sheth.arrays;

public class LinearSearch {
	
	public static int linearTest(int arr[],int ser){
		
		int size = arr.length;
		for(int i=0;i<size;i++){
			if(arr[i]==ser){
				return i;
			}
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		//LinearSearch ls = new LinearSearch();
		int ars[] = {34,19,15,26,3};
		int res =linearTest(ars,3);
		System.out.println("Linear search result is: "+ res);
		

	}

}
