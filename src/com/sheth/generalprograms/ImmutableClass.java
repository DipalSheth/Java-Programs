package com.sheth.generalprograms;

public final class ImmutableClass {//class is final so cannot create subclass
	private final String name; //variable is final so can't change value of it after creating object
	private final int age;
	
	public ImmutableClass(final String name, final int age){
		this.name = name;
		this.age = age;
	} 	
    //no setter method
	public void getName() {
		System.out.println(name);;
	} 

	public void getAge() {
		System.out.println(age);
	} 

	public static void main(String[] args) {
		ImmutableClass ic = new ImmutableClass("Trisha", 21);
		ic.getAge();
		ic.getName();

	}

}
