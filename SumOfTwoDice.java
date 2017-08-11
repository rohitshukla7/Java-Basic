/*
 * JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
 * NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN HEADER, PACKAGE, 
 *        IMPORT STATEMENTS, CLASS DECLARATION, etc
 */

/******************************************************************************
 *  Compilation:  javac SumOfTwoDice.java
 *  Execution:    java SumOfTwoDice
 *
 *  @author  Rohit Shukla
 *  @version 1.0
 *  @since   06-08-2017
 * output:
 *  The value of Dice 1 is:5
 *	The value of Dice 2 is:1
 *	The Sum of the two Dice is:6
 ******************************************************************************/
import java.util.Scanner;
public class SumOfTwoDice
{
	public static void main(String [] args)
	{
		int d1,d2,s;
		d1=(int)(Math.random()*6)+1;
		d2=(int)(Math.random()*6)+1;
		s=d1+d2;
		System.out.println("The value of Dice 1 is:"+d1);
		System.out.println("The value of Dice 2 is:"+d2);
		System.out.println("The Sum of the two Dice is:"+s);
	}//main end
}//lass end