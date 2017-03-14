package com.sheth.generalprograms;

public class GCDemo {
	static int i = 1;
	
	protected void finalize(){
		System.out.println("Farbage collected from object"+ i);
		i++;
	}

	public static void main(String[] args) {
		GCDemo gc1 = new GCDemo();
		GCDemo gc2 = new GCDemo();
		gc1 = null;
		gc2 = null;
		System.gc();

	}

}
