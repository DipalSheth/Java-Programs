package com.sheth.generalprograms;

public class AccessModifiers {
	
	public void animal(){
		System.out.println("public access modifier");
	}
	
	private void dog(){
		System.out.println("private access modifier");
	}
	
	void cat(){
		System.out.println("default access modifier");
	}
	
	protected void rabbit(){
		System.out.println("protected access modifier");
	}





	public static void main(String[] args) {
		AccessModifiers a = new AccessModifiers();
		a.animal();
		a.dog();
		a.cat();
		a.rabbit();
	}

}
