/******************************************************************************
 *  Compilation:  javac Sqrt.java
 *  Execution:    java Sqrt c
 *  @author  Rohit Shukla
 *  @version 1.0
 *  @since   06-08-2017
 *  
 *  Computes the square root of a nonnegative number c using
 *  Newton's method:
 *     - initialize t = c
 *     - replace t with the average of c/t and t
 *     - repeat until desired accuracy reached
 * 
 *  % java Sqrt 2
 *  1.414213562373095
 *
 *  % java Sqrt 1000000
 *  1000.0
 ******************************************************************************/
import java.util.Scanner;
public class Sqrt
{
	public static void main(String [] args)
	{
		double c=Double.parseDouble(args[0]);
		double epsilon=1e-15;
		double t=c;

		while(Math.abs(t-c/t)>epsilon*t)
		{
			t=(c/t+t)/2.0;
		}
		System.out.println(t);
	}
}