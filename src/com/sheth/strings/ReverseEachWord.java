package com.sheth.strings;

public class ReverseEachWord {
	
	public static void reverseeachwordofString(String str){
		
		String a[] = str.split(" ");
		
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+ " ");
		}
		System.out.println("");
		
		for(int i=a.length-1;i>=0;i--){
			System.out.print(a[i] + " ");
		}
		
		}	
	
	public static void main(String[] args) {
		String str = "I love my son most";
		reverseeachwordofString(str);

	}

}
