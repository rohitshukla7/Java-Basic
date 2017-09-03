package com.rohit;
import java.util.Scanner;
public class StringRev{
	static String str;
	static int i,j;

	public static void reverse(String str){
		/*char ch[]=new char[str.length()];
		for(i=0;i<str.length();i++){
			ch[i]=str.charAt(i);
		}*/
		String[] word=str.split(" ");
		//ch=str.toCharArray();
		for(String w:word){
			//for(i=w.length()-1;i>=0;i--){
				System.out.print(w);
			//}
		}
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		str=sc.next();
		reverse(str);
	}
}