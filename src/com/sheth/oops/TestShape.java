package com.sheth.oops;

public class TestShape {

	public static void main(String[] args) {
		CircleShape cs = new CircleShape(4);
		cs.calculateArea();
		cs.calculatePerimeter();
		
		RectangleShape rs = new RectangleShape(6,8);
		rs.calculateArea();
		rs.calculatePerimeter();
		rs.setSides();
		
		//Method overloading
		rs.perimeter(2,4);

	}

}
