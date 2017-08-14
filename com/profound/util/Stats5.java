/******************************************************************************
 *  Compilation:  javac -d bin com/profound/util/Stats5.java
 *  Execution:    java -cp bin com.profound.util.Stats5

 *  @author  Rohit Shukla
 *  @version 1.0
 *  @since   09-08-2017
     0.9575263032372164
     0.2863629241295599
     0.35854281273696087
     0.8740653038057022
     0.49297737904164884
     Min     = 0.2863629241295599
     Max     = 0.9575263032372164
     Average = 0.5938949445902176

 ******************************************************************************/
package com.profound.util;
import java.util.Scanner;
public class Stats5
{
		static double x1,x2,x3,x4,x5;
		static int N=5;
	public static void main(String [] args)
	{
		x1 = Math.random();
		x2 = Math.random();
		x3 = Math.random();
		x4 = Math.random();
		x5 = Math.random();
		
		//print 5 values
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		System.out.println(x5);
		
		//computes stats
		double min = Math.min(x1, Math.min(x2, Math.min(x3, Math.min(x4,x5))));
		double max = Math.max(x1, Math.max(x2, Math.max(x3, Math.max(x4,x5))));
		double average = (x1 + x2 + x3 + x4 + x5) / N;
		
		//prints stats
		System.out.println("Min 	= " + min);
		System.out.println("Max 	= " + max);
		System.out.println("Average = " + average);
	}
}