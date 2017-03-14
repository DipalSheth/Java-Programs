package com.sheth.loops;

public class SwapNumbers {
	
	public void swapnumbersusingthirdVariable(){
		int x = 8;
		int y =15;
		int z = 16;
		
	    z=x;
		x=y;
		y=z;
		
		System.out.println("X is " + x + "  and Y is "+ y);
		
	}
	
	public void swapnumberswithoutthirdVariable(){
		int x=8;
		int y=15;
		
		x=x+y;//23
		y=x-y;//8
		x=x-y;//15
		
		System.out.println("X is " + x + "  and Y is "+ y);
		
	}

	public static void main(String[] args) {
		SwapNumbers obj = new SwapNumbers();
		obj.swapnumbersusingthirdVariable();
		obj.swapnumberswithoutthirdVariable();
	}

}
