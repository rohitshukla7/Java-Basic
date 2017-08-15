
/******************************************************************************
 *  Compilation:  javac -d bin com/profound/util/HarmonicNumber.java
 *  Execution:    java -cp bin com.profound.util.HarmonicNumber n
 *  @author  Rohit Shukla
 *  @version 1.0
 *  @since   06-08-2017
 *  
 *  Prints the nth harmonic number: 1/1 + 1/2 + ... + 1/n.
 * 
 *  % java HarmonicNumber 10
 *  2.9289682539682538
 *
 *  % java HarmonicNumber 10000
 *  9.787606036044348
 *
 ******************************************************************************/
package com.profound.util;
import java.util.Scanner;
public class HarmonicNumber
 { 
    public static void main(String[] args)
     { 

        // command-line argument
        int n = Integer.parseInt(args[0]);

        // compute 1/1 + 1/2 + 1/3 + ... + 1/n
        double sum = 0;
        for (int i = 1; i <= n; i++) 
        {
            sum += 1 / i;
        }

        // print the nth harmonic number
        System.out.println(sum);
    }

}
