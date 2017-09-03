package com.profound.util;
import java.util.Scanner;
public class FibPrime{
	static int i,j,size,first,second,fin;
	static int array[]=new int[50];
	public static void main(String[] args){
		/*for(i=0;i<=10;i++){
			first=i;
			second=i+1;
			fin=first+second;
			array[i]=fin;
			first=fin;
			second=first;
		}*/
		while(i<=10){
			i=0;
			first=i;
			second=i+1;
			fin=first+second;
			array[i]=fin;
			first=fin;
			second=first;
			i++;
		}
		System.out.println(array);
	}
}