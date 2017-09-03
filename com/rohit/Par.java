package com.rohit;
class Par{
	Par(){
		System.out.println("Parents default constructor....");
	}
	public static void main(String args[]){
		Child c=new Child();
		c.display();
	}
}
class Child extends Par{
	public void display(){
		System.out.println("Child ....");
	}
}