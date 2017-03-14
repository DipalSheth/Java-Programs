package com.sheth.exceptionhandling;

public class TestNullPointerException {
	
	public void printMessage(){
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		TestNullPointerException ne = null;
		try{ne.printMessage(); 		
		}catch(NullPointerException e){
			System.out.println(e);
		}finally{
			System.out.println("Finally Executed");
		}
	}

}
