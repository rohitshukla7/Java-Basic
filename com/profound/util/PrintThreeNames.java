/*************************************
    Program:print three names in a single sentence
    Author: Rohit Shukla
    Date:14/08/2017
**************************************/
package com.profound.util;

import java.util.Scanner;
import java.lang.String;

public class PrintThreeNames 
{
        static String name1,name2,name3;            //three string variables to store the three names
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        //Taking three names from user
        System.out.println("Enter first name:");
        name1=in.nextLine();
        System.out.println("Enter second name:");
        name2=in.nextLine();
        System.out.println("Enter third name:");
        name3=in.nextLine();
        System.out.println("Hi,"+name3+","+name2+" and "+name1);        //printing the three names
    }
}