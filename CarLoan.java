/*
 * JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
 * NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN HEADER, PACKAGE, 
 *        IMPORT STATEMENTS, CLASS DECLARATION, etc
 */

/******************************************************************************
 *  Compilation:  javac CarLoan.java
 *  Execution:    java CarLoan P Y R
 *
 *  @author  Rohit Shukla
 *  @version 1.0
 *  @since   06-08-2017
 ******************************************************************************/
import java.util.Scanner;
public class CarLoan
{
	public static void main(String [] args)
	{
		//P=Principal loan amount, Y=Year and R= Interest rate
		float P=Float.parseFloat(args[0]);
		float Y=Float.parseFloat(args[1]);
		float R=Float.parseFloat(args[2]);
		float n=12*Y;
		float r=R/12/100;
		double payment=(P*r)/(1-Math.pow((1+r),(-n)));
		System.out.println("Payment:"+payment);
		double interest=payment*n-P;
		System.out.println("Interest:"+interest);	
	}//main end
}//lass end