/******************************************************************************
 *  Compilation:  javac -d bin com/profound/util/PrimeFactor.java
 *  Execution:    java -cp bin com.profound.util.PrimeFactor
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
package com.profound.util;
import java.util.Scanner;
public class PrimeFactor
 {
 		static int n,ctr=0;
 	public static void main(String [] args)
 	{
	System.out.println("Enter a number:\n");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
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
