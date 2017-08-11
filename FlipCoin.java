/*
 * JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
 * NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN HEADER, PACKAGE, 
 *        IMPORT STATEMENTS, CLASS DECLARATION, etc
 */

/******************************************************************************
 *  Compilation:  javac FlipCoin.java
 *  Execution:    java FlipCoin
 *
 *  @author  Rohit Shukla
 *  @version 1.0
 *  @since   06-08-2017
 * output:
 *  HEADS
 *  TAILS
 ******************************************************************************/
import java.util.Scanner;
public class FlipCoin
{
	public static void main(String [] args)
	{
		int c;
		c=(int)(Math.random()*2)+1;
		if(c==1)
		{
			System.out.println("HEADS");
		}
		else
		{
			System.out.println("TAILS");
		}
	}//main end
}//lass end