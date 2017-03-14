package com.sheth.loops;

public class Fibonaci {

	public void printFibonaci(int count){
		int[] fb = new int[count];
		fb[0]=0;
		fb[1]=1;
		
		for(int i=2; i<count; i++){
			fb[i] = fb[i-1] + fb[i-2];
		}
		for(int i=0; i<count; i++){
			System.out.println(fb[i] + " ");
		}
	}
	public static void main(String[] args) {
		Fibonaci obj = new Fibonaci();
		obj.printFibonaci(20);

	}

}
