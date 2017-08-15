/*
 * JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
 * NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN HEADER, PACKAGE, 
 *        IMPORT STATEMENTS, CLASS DECLARATION, etc
 */

/******************************************************************************
 *  Compilation:  javac -d bin com/profound/util/PowerOf2.java
 *  Execution:    java -cp bin com.profound.util.PowerOf2 6
 *
 *  @author  Rohit Shukla
 *  @version 1.0
 *  @since   06-08-2017
 *  output:
 *	1.0
 *	2.0
 *	4.0
 *	8.0
 *	16.0
 *	32.0
 *	64.0
 ******************************************************************************/
package com.profound.util;
import java.util.Scanner;
public class PowerOf2
{
		static int n;
	public static void main(String [] args)
	{
		//taking a command line arguement as a positive integer
		n=Integer.parseInt(args[0]);
		for(int i=0;i<=n;i++)
		{
			System.out.print("2^"+i+"=");
			System.out.println(Math.pow(2,i));
		}
	}//main end
}//lass end