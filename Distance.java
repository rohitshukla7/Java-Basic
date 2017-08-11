/*
 * JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
 * NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN HEADER, PACKAGE, 
 *        IMPORT STATEMENTS, CLASS DECLARATION, etc
 */

/******************************************************************************
 *  Compilation:  javac PrimeChecker.java
 *  Execution:    java PrimeChecker n
 *  
 *  Purpose: Determines whether or not n is prime.
 *
 *  @author  Rohit Shukla
 *  @version 1.0
 *  @since   09-08-2017
 ******************************************************************************/
import java.util.Scanner;
public class Distance
{
	public static void main(String [] args)
	{
		double d;
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		System.out.println("The value of the given point is: x="+x+"and y="+y);
		d=Math.pow((x*x+y*y),0.5);
		System.out.println("The euclidean distance of a point from origin is:"+d);
	}
}