package com.sheth.loops;

public class PingPong {
	
	public void divisible(int input){
		
		if(input%3==0 && input%5==0){
			System.out.println(" PingPong");
		}else if(input%3==0){
			System.out.println(" Ping");
		}else if(input%5==0){
			System.out.println(" Pong ");
		}else{
			System.out.println("Number is "+ input);
		}
	}	

	public static void main(String[] args) {
		PingPong obj = new PingPong();
		obj.divisible(15);

	}

}
