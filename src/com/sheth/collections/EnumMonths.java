package com.sheth.collections;

public class EnumMonths {
	
	public enum Month{
		JAN,FEB,MAR,APRIL,MAY,JUN,JULY,AUG,SEP,OCT,NOV,DEC}


	private static final Month[] monthCode = null;;
		

	public static void main(String[] args) {
		for (Month months : Month.values()){
		if (Month.values() == monthCode){
			return;
		}
		System.out.println(months);
		}
	
		
			

	}

}
