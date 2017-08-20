/******************************************************************************
 *  Compilation:  javac -d bin com/profound/util/Calendar.java
 *  Execution:    java -cp bin com.profound.util.Calendar month year
 *  @author  Rohit Shukla
 *  @version 1.0
 *  @since   09-08-2017
 ****************************************************************************/
package com.profound.util;
import java.util.Arrays;
import java.util.Scanner;
public class Calendar{
	static int y,m,d,x;
	static int month,year;
	//method to return a day of a date
	public static int day(int M, int D, int Y) {
        y = Y - (14 - M) / 12;
        x = y + y/4 - y/100 + y/400;
        m = M + 12 * ((14 - M) / 12) - 2;
        d = (D + x + (31*m)/12) % 7;
        return d;
    }
    //method to check a year is leap year or not
    public static boolean isLeapYear(int year){
    	if((year%400==0) || ((year%4==0) && (year%100!=0)))
    		return true;
    	else
    		return false;
    }
    //main method
    public static void main(String[] args){
    	month=Integer.parseInt(args[0]);
    	year=Integer.parseInt(args[1]);
    	//first field is kept blank so that we can start january from 1
    	String[] months={
    		" ","January","February","March","April",
    		"May","June","July","August","September","October",
    		"November","December"
    	};

    	int[] days={0,31,28,31,30,31,30,31,31,30,31,30,31};

    	if(month==2 && isLeapYear(year))
    		days[month]=29;				// if year is leap year then february month will be of 29 days

    	System.out.println("  "+months[month]+" "+year);
    	System.out.println("S M T W Th F S");

    	int d=day(month,1,year);

    	for(int i=0;i<d;i++)
    		System.out.println("   ");
    	for(int i=1;i<=days[month];i++){
    		System.out.println("%d",i);
    		if(((i+d)%7==0) || (i==days[month]))
    			System.out.println();
    	}
    }
}