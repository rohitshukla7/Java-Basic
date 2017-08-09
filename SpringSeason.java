/******************************************************************************
 *  Compilation:  javac SpringSeason.java
 *  Execution:    java day month

 *  @author  Rohit Shukla
 *  @version 1.0
 *  @since   09-08-2017
 *  
 *  Prints true if the given day and month fall between March 20 (inclusive)
 *  and June 20 (inclusive).
 * 
 *  % java SpringSeason 3 20
 *  true
 ******************************************************************************/

public class SpringSeason 
{ 
    public static void main(String[] args) 
    { 
        int m=Integer.parseInt(args[0]);
        int d=Integer.parseInt(args[1]);
        boolean isSpring=(m==3 && d>=20 && d<=31)
        				|| (m==4 && d>=1 && d<=30)
        				|| (m==5 && d>=1 && d<=31)
        				|| (m==6 && d>=1 && d<=20);
        System.out.println(isSpring);
    }
}