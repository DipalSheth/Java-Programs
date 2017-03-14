package com.sheth.generalprograms;

public class StaticBlockNMethod {
	int id;
	static String topic;
	String name;
	
	//static block
	static{ 
		System.out.println("This week Student information");
	}
	
	//constructor
	public StaticBlockNMethod(int i,String n){ 
		id = i;
		name = n;
	}
	
	//static Method
	public static String gettopic(){ 
		topic = "Java";
		return topic;
	}
	
	public void getresult(){
		System.out.println("StudentID:" + id +" "+ "StudentName:" + name +" " + "Topic:" + gettopic() );
	}

	public static void main(String[] args) {
		StaticBlockNMethod obj = new StaticBlockNMethod(632,"Trisha");
		obj.getresult();
		
		

	}

}
