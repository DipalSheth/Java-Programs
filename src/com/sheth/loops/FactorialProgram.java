package com.sheth.loops;

public class FactorialProgram {
	
	public void factorialexample(){
		int i;
		int fact =1;
		int number = 7;
		
		for(i=1;i<=number;i++){
			fact=fact*i;
		}
		System.out.println("Factorial of " + number + " is " + fact);
		
	}
	
	public static int factorialRecursion(int number){
		
		if(number==0){
			return 1;
		}
	     return(number*factorialRecursion(number-1));
	}

	public static void main(String[] args) {
		FactorialProgram obj = new FactorialProgram();
		obj.factorialexample();
		System.out.println(factorialRecursion(5));
		
	}

}
