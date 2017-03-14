package com.sheth.generalprograms;

public class AccessModifiersTest {

	public static void main(String[] args) {
		AccessModifiers a = new AccessModifiers();
		a.animal();
		//a.dog();not accessible
		a.cat();
		a.rabbit();
		

	}

}
