package com.profound.util;
import java.util.Scanner;
public class StringRev{
	static String str,word;
	static int i,j;

	public static void reverse(String str){
		char ch[]=new char[str.length()];
		for(i=str.length()-1;i>=0;i--){
			System.out.println(ch[i];
		}
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(String[] args);
		System.out.println("Enter a string:");
		str=sc.next();
		reverse(str);
	}
}