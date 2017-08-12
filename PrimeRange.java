/*
 * JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
 * NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN HEADER, PACKAGE, 
 *        IMPORT STATEMENTS, CLASS DECLARATION, etc
 */

/******************************************************************************
 *  Compilation:  javac PrimeRange.java
 *  Execution:    java PrimeRange
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
import java.util.Scanner;
public class PrimeRange
{
	public static void main(String [] args)
	{
		int s,e;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting number of range:");
		s=sc.nextInt();
		System.out.println("Enter the ending number of range:");
		e=sc.nextInt();
		int ctr=0;
		for(int i=s;i<=e;i++)
		{
			for(int j=1;j<=e;j++)
			{
				if(i%j==0)
				{
					ctr++;
				}
			}
			if(ctr<=2)
			{
				System.out.println(i+" is a prime number in the range of "+s+" and "+e);
			}
			ctr=0;
		}
	}
}