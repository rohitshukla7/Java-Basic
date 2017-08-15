/*
 * JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
 * NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN HEADER, PACKAGE, 
 *        IMPORT STATEMENTS, CLASS DECLARATION, etc
 */

/******************************************************************************
 *  Compilation:  javac -d bin com/profound/util/PrimeRange.java
 *  Execution:    java -cp bin com.profound.util.PrimeRange
 *  
 *  @author  Rohit Shukla
 *  @version 1.0
 *  @since   06-08-2017
 * output:
 *	Enter the starting number of range:
 *	4
 *	Enter the ending number of range:
 *	35
 *	5 is a prime number in the range of 4 and 35
 *	7 is a prime number in the range of 4 and 35
 *	11 is a prime number in the range of 4 and 35
 *	13 is a prime number in the range of 4 and 35
 *	17 is a prime number in the range of 4 and 35
 *	19 is a prime number in the range of 4 and 35
 *	23 is a prime number in the range of 4 and 35
 *	29 is a prime number in the range of 4 and 35
 *	31 is a prime number in the range of 4 and 35
 * *****************************************************************************/
package com.profound.util;
import java.util.Scanner;
public class PrimeRange
{
		static int startnum,endnum,ctr=0;
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting number of range:");
		startnum=sc.nextInt();			//taking the starting number of range from the user
		System.out.println("Enter the ending number of range:");
		endnum=sc.nextInt();			//taking the ending number of range from the user
		for(int i=startnum;i<=endnum;i++)
		{
			for(int j=1;j<=endnum;j++)
			{
				if(i%j==0)
				{
					ctr++;
				}
			}
			if(ctr<=2)	//if ctr becomes greater than two it means the number is divisible by more than two numbers hence not a prime number
			{
				System.out.println(i+" is a prime number in the range of "+startnum+" and "+endnum);
			}
			ctr=0;
		}
	}
}