 /****************************************
   program:Temperature Conversion
   Authur: Rohit Shukla
   Version:1.0
   Date:10/08/17
  ******************************************/
package com.profound.util;

import java.util.Scanner;

public class TemperatureConversion 
{
        static double fahrenheit,celcius,result;
        static int choice;
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("1:Fareinheit to Celcius");
        System.out.println("2: Celcius to Fareinheit");
        choice=in.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("Enter fahrenheit:");
                fahrenheit=in.nextInt();
                result=(fahrenheit-32)*5/9;
                System.out.println(result+" "+"degree celcius");
                break;
            }
            
            case 2:
            System.out.println("Enter celcius:");
                celcius=in.nextInt();
                result=(celcius*9/5)+32;
                System.out.println(result+" "+"degree fahrenheit");
                break;
          
            default:
            {
                System.out.println("Invalid input");
            }
        }
        
    }
}