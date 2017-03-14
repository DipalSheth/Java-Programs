package com.sheth.loops;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int number = 29;
		int i;
		
		for(i=2;i<=number-1;i++){
			if(number%i==0){
				break;
			  }
		    }if(i<number){
				System.out.println("It's not a Prime number");
			}else{
				System.out.println("It's a Prime number");
			}
	}

}
