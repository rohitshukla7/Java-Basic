/******************************************************************************
 *  Compilation:  javac -d bin com/profound/util/Trig.java
 *  Execution:    java -cp bin com.profound.util.Trig angle
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
package com.profound.util;
import java.util.Scanner;
public class Trig
{
		static double degree,radians,sin,cos,tan,r;
	public static void main(String [] args)
	{
		degree=Double.parseDouble(args[0]);
		radians=Math.toRadians(degree);
		sin=Math.sin(radians);
		cos=Math.cos(radians);
		tan=Math.tan(radians);
		r=sin*sin+cos*cos;
		System.out.println("Entered angle in degree:"+degree);
		System.out.println("Angle in Radians:"+radians);
		System.out.println("Sin("+degree+"):"+sin);
		System.out.println("Cos("+degree+"):"+cos);
		System.out.println("tan("+degree+"):"+tan);
		System.out.println("tan("+degree+"):"+(sin/cos));
		System.out.println(sin*sin+"+"+cos*cos+"="+r);
	}//main end
}//lass end