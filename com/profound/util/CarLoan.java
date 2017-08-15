/*
 * JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
 * NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN HEADER, PACKAGE, 
 *        IMPORT STATEMENTS, CLASS DECLARATION, etc
 */

/******************************************************************************
 *  Compilation:  javac -d bin com/profound/util/CarLoan.java
 *  Execution:    java -cp bin com.profound.util.CarLoan P Y R
 *
 *  @author  Rohit Shukla
 *  @version 1.0
 *  @since   06-08-2017
 ******************************************************************************/
package com.profound.util;
import java.util.Scanner;
public class CarLoan
{
		static float principal,year,rate;
	public static void main(String [] args)
	{
		//P=Principal loan amount, Y=Year and R= Interest rate
		principal=Float.parseFloat(args[0]);
		year=Float.parseFloat(args[1]);
		rate=Float.parseFloat(args[2]);
		float n=12*year;
		float r=rate/12/100;
		double payment=(principal*r)/(1-Math.pow((1+r),(-n)));
		System.out.println("Payment:"+payment);
		double interest=payment*n-principal;
		System.out.println("Interest:"+interest);	
	}//main end
}//lass end