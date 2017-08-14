/******************************************************************************
 *  Compilation:  javac -d bin com/profound/util/SpringSeason.java
 *  Execution:    java -cp bin com.profound.util.SpringSeason day month

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
package com.profound.util;
import java.util.Scanner;
public class SpringSeason 
{ 
        static int day,month;
    public static void main(String[] args) 
    { 
        month=Integer.parseInt(args[0]);
        day=Integer.parseInt(args[1]);
        boolean isSpring=(month==3 && day>=20 && day<=31)
        				|| (month==4 && day>=1 && day<=30)
        				|| (month==5 && day>=1 && day<=31)
        				|| (month==6 && day>=1 && day<=20);
        System.out.println(isSpring);
    }
}