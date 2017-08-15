/******************************************************************************
 *  Compilation:  javac -d bin com/profound/util/LeapYear.java
 *  Execution:    java -cp bin com.profound.util.LeapYear n
 *  @author  Rohit Shukla
 *  @version 1.0
 *  @since   09-08-2017
 *  
 *  Prints true if n corresponds to a leap year, and false otherwise.
 *  Assumes n >= 1582, corresponding to a year in the Gregorian calendar.
 *
 *  % java LeapYear 2004
 *  2004 is a leap year
 *
 *  % java LeapYear 1900
 *  1900 is not a leap year
 ******************************************************************************/
package com.profound.util;
import java.util.Scanner;
public class LeapYear
{
		static int year;
	public static void main(String [] args)
	{
		//Taking the year input as command line argument
		year=Integer.parseInt(args[0]);

		if((year%400==0) || ((year%4==0) && (year%100!=0)))
		{
			System.out.println(year+" is a leap year");
		}
		else
		{
			System.out.println(year+" is not a leap year");
		}
		
	}
}