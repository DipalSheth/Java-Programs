package com.sheth.arrays;

public class SortingArray {
	
	public void sortingArray(int[] num){
		int tem=0;
        
		for(int i=num.length-1;i>=0;i--){
			for(int j=1;j<=i;j++){
				if(num[j]<num[j-1]){
					
					tem = num[j];
					num[j] = num[j-1];
					num[j-1] = tem;
				}
			}
			
			}
		for(int i=0;i<num.length;i++){
			System.out.println(num[i]);
		}
	}

	public static void main(String[] args) {
		int num[] = {7,3,-20,9,1,4,19,-56};
		SortingArray sa = new SortingArray();
		sa.sortingArray(num);
	
	}

}
