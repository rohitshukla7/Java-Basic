package com.rohit;
import java.util.*;
abstract class Vehicle{
	public abstract void drive();
	public static void main(String args[]){
		Car c=new Car();
		c.drive();
		Bike b=new Bike();
		b.drive();
	}


}

class Car extends Vehicle{
	public void drive(){
		System.out.println("Car drive......");
	}
}
class Bike extends Vehicle{
	public void drive(){
		System.out.println("Bike drive......");
	}
}