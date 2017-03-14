package com.sheth.exceptionhandling;

public class ArithmeticExceptionTest {
	
	public void dog(String name, String color){
		System.out.println("Dog details: " + name + color);
	}
	
	public void cat(String name, String color){
		System.out.println("Cat details: " + name + color);
	}
	
	public void animal(String name, String color){
		try{dog(name,color);
		}catch(Exception e){
			System.out.println(e);
		}
		cat(name,color);
	
	}

	public static void main(String[] args) {
		ArithmeticExceptionTest ae = new ArithmeticExceptionTest();
		ae.animal("Cookie", "white");
	}

}
