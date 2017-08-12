/*
 * JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
 * NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN HEADER, PACKAGE, 
 *        IMPORT STATEMENTS, CLASS DECLARATION, etc
 */

/******************************************************************************
 *  Compilation:  javac PrimeFactor.java
 *  Execution:    java PrimeFactor
 * 
 *  @author  Rohit Shukla
 *  @version 1.0
 *  @since   06-08-2017
 *  Enter a number:

 *	14
 *	1 is a prime factor

 *	2 is a prime factor

 *	7 is a prime factor
 *
 ******************************************************************************/
import java.util.Scanner;
public class PrimeFactor
 {
 	public static void main(String [] args)
 	{
	int i,j,n,ctr=0;
	System.out.println("Enter a number:\n");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
			if(i%j==0)
			{
				ctr++;
			}
		}
		if(ctr<=2 && n%i==0)
		{
		    System.out.println(i+" is a prime factor");	
		}
		ctr=0;
	}
	
    }
}  