package com.rohit;
import java.util.*;
public class SplitExample{ 
	static String str; 
	public static void reverse(String str){  
		//String s1="java string split method by javatpoint";  
		String[] words=str.split("\\s");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		for(String w:words){  
			System.out.println(w);  
		}  
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a string:");
		str="java string split method by javatpoint";
		reverse(str);
	}
}  