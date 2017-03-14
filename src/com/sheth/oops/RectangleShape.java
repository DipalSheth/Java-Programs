package com.sheth.oops;

public class RectangleShape extends AbstractShape {
	
	double width;
	double height;
	
	public RectangleShape(double w, double h){
		width = w;
		height = h;
	}
	
	@Override
	public void calculateArea() {
		area=height*width;
		System.out.println("Area of Rectangle is: "+ area);
		
	}

	@Override
	public void calculatePerimeter() {
		perimeter=2*(height+width);
		System.out.println("Perimeter of Rectangle is :"+ perimeter);
		
	}

	@Override
	public void setSides() {
		
	}
	
	//Method overloading	
	public void perimeter(double a,double b){
		perimeter = 2*(a+b);
		System.out.println("Perimeter1 of Rectangle is: " + perimeter);
	}

}
