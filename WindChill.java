/*
 * JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
 * NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN HEADER, PACKAGE, 
 *        IMPORT STATEMENTS, CLASS DECLARATION, etc
 */

/******************************************************************************
 *  Compilation:  javac WindChill.java
 *  Execution:    java WindChill t v
 *  
 * Given the temperature t (in Fahrenheit) and the wind speed v
 *  (in miles per hour), compute the wind chill w using the formula
 *  from the National Weather Service.
 *
 *  w = 35.74 + 0.6215*t + (0.4275*t - 35.75)  *  v ^ 0.16
 *
 *  @author  Rohit Shukla
 *  @version 1.0
 *  @since   09-08-2017
 ******************************************************************************/
import java.util.Scanner;
public class WindChill
{
	public static void main(String [] args)
	{
		double w;
		double t=Double.parseDouble(args[0]);
		double v=Double.parseDouble(args[1]);
		w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16);
		System.out.println("Temperature:"+t);
		System.out.println("Wind Speed :"+v);
		System.out.println("Wind Chill :"+w);
	}
}