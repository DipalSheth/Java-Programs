package com.sheth.oops;

public class CircleShape extends AbstractShape implements ShapeConstants {
	
	private double radius;
	
	public CircleShape(double r){
		radius = r;
	}
	
	@Override
	public void calculateArea(){
		area = PI*radius*radius;
		System.out.println("Area of Circle is: " + area);
		
	}
	
	@Override
	public void calculatePerimeter(){
		perimeter = 2*PI*radius;
		System.out.println("Perimeter of Circle is: " + perimeter);
		
	}
	
	@Override
	public void setSides(){
		
	}
}
