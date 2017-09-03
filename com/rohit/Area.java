package com.rohit;
//import java.util.*;
abstract class Area{
	public abstract void calculateArea();
	public static void main(String args[]){
		Circle c=new Circle();
		c.calculateArea();
		Square s=new Square();
		s.calculateArea();
		Triangle t=new Triangle();
		t.calculateArea();
	}


}

class Circle extends Area{
	double r,area;
	public void calculateArea(){
		r=4;
		area=3.14*r*r;
		System.out.println("Area of Circle:"+area);

	}
}

class Square extends Area{
	int l,b,area;
	public void calculateArea(){
		l=3;b=7;
		area=l*b;
		System.out.println("Area of square:"+area);
	}
}

class Triangle extends Area{
	double l,b,area;
	public void calculateArea(){
		l=4;b=5;
		area=l*b*0.5;
		System.out.println("Area of Triangle:"+area);
	}
}