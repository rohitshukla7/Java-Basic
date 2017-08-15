/******************************************************************************
 *  Compilation:  javac -d bin com/profound/util/IntOpt.java
 *  Execution:    java -cp bin com.profound.util.IntOpt 1 2 3
 *
 *  @author  Rohit Shukla
 *  @version 1.0
 *  @since   13-08-2017
 * output:
 *	a+b*c:7
 *	a*b+c:5
 *	c+a/b:3
 *	a%b+c:4
 ******************************************************************************/
package com.profound.util;
import java.util.Scanner;
public class IntOpt
{ 
		static int a,b,c;				//three variables to store the value of a,b and c
    public static void main(String[] args)
    { 
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		System.out.println("a+b*c:"+(a+b*c));
		System.out.println("a*b+c:"+(a*b+c));
		System.out.println("c+a/b:"+(c+a/b));
		System.out.println("a%b+c:"+(a%b+c));
			
	}
}
