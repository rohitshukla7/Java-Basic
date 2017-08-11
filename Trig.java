/*
 * JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
 * NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN HEADER, PACKAGE, 
 *        IMPORT STATEMENTS, CLASS DECLARATION, etc
 */

/******************************************************************************
 *  Compilation:  javac Trig.java
 *  Execution:    java Trig angle
 *
 *  @author  Rohit Shukla
 *  @version 1.0
 *  @since   06-08-2017
 *	Output:
 *	Entered angle in degree:30.0
 *	Angle in Radians:0.5235987755982988
 *	Sin(30.0):0.49999999999999994
 *	Cos(30.0):0.8660254037844387
 *	tan(30.0):0.5773502691896257
 *	tan(30.0):0.5773502691896256
 *	0.24999999999999994+0.7500000000000001=1.0
 ******************************************************************************/
import java.util.Scanner;
public class Trig
{
	public static void main(String [] args)
	{
		double degree=Double.parseDouble(args[0]);
		double radians=Math.toRadians(degree);
		double sin=Math.sin(radians);
		double cos=Math.cos(radians);
		double tan=Math.tan(radians);
		double r=sin*sin+cos*cos;
		System.out.println("Entered angle in degree:"+degree);
		System.out.println("Angle in Radians:"+radians);
		System.out.println("Sin("+degree+"):"+sin);
		System.out.println("Cos("+degree+"):"+cos);
		System.out.println("tan("+degree+"):"+tan);
		System.out.println("tan("+degree+"):"+(sin/cos));
		System.out.println(sin*sin+"+"+cos*cos+"="+r);
	}//main end
}//lass end