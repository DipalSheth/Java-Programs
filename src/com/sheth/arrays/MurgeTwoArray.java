package com.sheth.arrays;

public class MurgeTwoArray {

	public static void main(String[] args) {
		
		int[] array1={2,7,14,27,36};
		int[] array2={1,4,9,18,22,35};
		int[] merge = new int[array1.length+array2.length];
		int c=0;
		
		for(int i=0;i<array1.length;i++){
			merge[i] = array1[i];
			c++;
		}
		for(int j=0;j<array2.length;j++){
			merge[c++]=array2[j];
		}
		for(int i=0;i<merge.length;i++){
			System.out.println(merge[i]+ " ");
		}
	}

}
