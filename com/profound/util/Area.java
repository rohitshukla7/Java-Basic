package com.rohit;
import java.util.*;
abstract class Area{
	public abstract float calculateArea();
	public static void main(String args[]){
		Circle c=new Circle();
		c.calculateArea(5.0);
	}


}
class Circle extends Area{
	public float calculateArea(float r){
		area=3.14*r*r;
		System.out.println("Area:"+area);
	}
}