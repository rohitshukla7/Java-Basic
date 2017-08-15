
/******************************************************************************
 *  Compilation:  javac -d bin com/profound/util/FlipCoin.java
 *  Execution:    java -cp bin com.profound.util.FlipCoin
 *
 *  @author  Rohit Shukla
 *  @version 1.0
 *  @since   06-08-2017
 * output:
 * Enter how many times you want to flip a coin:
 *	9
 *	Number of Heads:2
 *	Number of Tails:7
 *	Percentage of Heads:22%
 *	Percentage of Tails:77%
 ******************************************************************************/
package com.profound.util;
import java.util.Scanner;
public class FlipCoin
{
		static int coin,n,head=0,tail=0;		//variable coin stores the outcome of the flipped coin ie. heads or tails
	public static void main(String [] args)
	{
		System.out.println("Enter how many times you want to flip a coin:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		coin=(int)(Math.random()*2)+1;
		if(coin==1)
		{
			head++;                        // h is counter variable to count the heads
			
		}
		else
		{
			
			tail++;						// t is counter variable to count the tails
		}
		}
		System.out.println("Number of Heads:"+head);
		System.out.println("Number of Tails:"+tail);
		System.out.println("Percentage of Heads:"+(head*100)/n+"%");
		System.out.println("Percentage of Tails:"+(tail*100)/n+"%");
	}//main end
}//lass end
