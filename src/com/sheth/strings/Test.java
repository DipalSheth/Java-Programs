//implement hashcode() and equals()

package com.sheth.strings;

public class Test {
	
   private int age ;
	
	public void Emp( int age )
	{
		//super();
		this.age = age;
	}
	
	public int hashCode()
	{
		return age;
	}
	
	public boolean equals( Object obj )
	{
		boolean flag = false;
		Test emp = ( Test )obj;
		if( emp.age == age )
			flag = true;
		return flag;
	}

	

	
  public static void main(String[] args) {
	  Test emp1 = new Test();
		Test emp2 = new Test();
		System.out.println("Output: "+emp1.equals(emp2));
		
	}

}
