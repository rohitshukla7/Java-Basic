/*
 * JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
 * NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN HEADER, PACKAGE, 
 *        IMPORT STATEMENTS, CLASS DECLARATION, etc
 */

/******************************************************************************
 *  Compilation:  javac -d bin PrimeChecker.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrimeChecker n
 *  
 *  Purpose: Determines whether or not n is prime.
 *
 *  @author  Rohit Shukla
 *  @version 1.0
 *  @since   09-08-2017
 *
 ******************************************************************************/
import java.util.Scanner;
public class Quadratic
{
	public static void main(String[] args)
	{
		int a,b,c;
		double root1,root2,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of a:");
		a=sc.nextInt();
		System.out.println("Enter the values of b:");
		b=sc.nextInt();
		System.out.println("Enter the values of c:");
		c=sc.nextInt();

		d=(b*b)-(4*a*c);

		if(d>0)
		{
			System.out.println("The roots are real and unequal");
			root1=(-b+Math.sqrt(d))/(2*a);
			root2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("The frst root is:"+root1);
		    System.out.println("The second root is:"+root2);
        }
        else if(d==0)
        {
        	System.out.println("The roots are real and equal");
        	root1=(-b+Math.sqrt(d))/(2*a);
        	System.out.println("Root is:"+root1);
        }
        else
        {
        	System.out.println("The roots are imaginary..");
        }

	}
}