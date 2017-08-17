 /****************************************
   program:Decimal2binary
   Authur: Rohit Shukla
   Version:1.0
   Date:10/08/17
  ******************************************/
package com.profound.util;
import java.util.Scanner;

public class Binary 
{ 
    static int decimalNumber;
    static int temp=0;          //temp count lenght of division on  number
    static int i=0;
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter decimal number:");
        decimalNumber=sc.nextInt();
        int array[]=new int[10];          //array to store bit value
        //decomposing number
        while(decimalNumber>0)
        {
            array[i]=decimalNumber%2;
            decimalNumber/=2;
            temp++;
            i++;
        }
       for(i=temp-1;i>=0;i--)         //displaying the elements of array in reverse order 
       {
           System.out.print(array[i]);
       }
    }
}