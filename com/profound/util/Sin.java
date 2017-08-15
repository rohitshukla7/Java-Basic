/****************************************
   program:Sin of taylor series
   Authur: Rohit Shukla
   Version:1.0
   Date:13/08/17
  ******************************************/
package com.profound.util;

import java.lang.Math;
import java.util.Scanner;

public class Sin 
{
        static int lenghtOfSeries;  //variable to control lenght of series
        static double x;            //get an angle from user
        static int p=1;             //variable computes power of x
        static int sign=1;          //assign sign + or -
        static double sum=0.0;      //calculate sum of series

    public static void main(String[] args) 
    {
        
        //scan inputs
        Scanner in=new Scanner(System.in);
        System.out.println("Enter lenght of taylor series:");
        lenghtOfSeries=in.nextInt();
        System.out.println("Enter angle:");
        x=in.nextDouble();
        //convert x to be between -2PI to 2PI for precision
        x=x%(2*Math.PI);
        for(int i=1;i<=lenghtOfSeries;i++)
        {  //Here fact method is called
            sum+=sign*(Math.pow(x,p)/fact(p));
            sign=-sign;
            p+=2;
        }
        System.out.println("Sinx="+Math.sin(sum));
    }
    //calculate factorial
   public static int fact(int p)
   {
       int fact=1;
       if(p==0||p==1)
       {
           return 1;
       }
       else
       {
           while(p>0)
           {
               fact+=p;
               p--;
           }
           return fact;
       }
   }
}