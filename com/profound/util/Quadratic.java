/******************************************************************************
 *  Compilation:  javac Quadratic.java
 *  Execution:    java  Quadratic
 *  
 *  @author  Rohit Shukla
 *  @version 1.0
 *  @since   09-08-2017
 *
 ******************************************************************************/
import java.util.Scanner;
public class Quadratic
{
		static int a,b,c;			//three variables to store the values of quadratic equation
		static double root1,root2,d;	//two variables to store the roots of equation and a variable d to store the value of b^2-4ac.
	public static void main(String[] args)
	{
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
