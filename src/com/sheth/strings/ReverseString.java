package com.sheth.strings;

public class ReverseString {
	
	public String reverseString(String str){
		
		if(str.length() == 1){
			return str;
		}else{
			String reverse = str.charAt(str.length()-1)
					+reverseString(str.substring(0,str.length()-1));
			return reverse;
		}
		
	}

	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		System.out.println("Reverse string is: "+ rs.reverseString("JavaProgramOnStrings"));

	}

}
