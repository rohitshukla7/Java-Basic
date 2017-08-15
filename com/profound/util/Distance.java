
/******************************************************************************
 *  Compilation:  javac -d bin com/profound/util/PrimeChecker.java
 *  Execution:    java -cp bin com.profound.util.PrimeChecker n
 *  
 *  Purpose: Determines whether or not n is prime.
 *
 *  @author  Rohit Shukla
 *  @version 1.0
 *  @since   09-08-2017
 ******************************************************************************/
package com.profound.util;
import java.util.Scanner;
public class Distance
{
		static double distance;
		static int x,y;
	public static void main(String [] args)
	{
		x=Integer.parseInt(args[0]);
		y=Integer.parseInt(args[1]);
		System.out.println("The value of the given point is: x="+x+"and y="+y);
		distance=Math.pow((x*x+y*y),0.5);
		System.out.println("The euclidean distance of a point from origin is:"+distance);
	}
}