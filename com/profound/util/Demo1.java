package com.profound.util;
import java.util.Scanner;
public class Demo1
{
        public static void main(String [] args)
        {
		// declaring variables i,j,n and ctr
                int n,i,j,ctr=0;
		System.out.println("Enter a no.");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<n;i++)
		{
			for(j=1;j<n;j++)
			{
				if(i%j==0)	
				{
				ctr++;
				}
			}
		        if(ctr<=2)
			{
			System.out.println(n+"is a prime number \n");
			}
		}
			
        }
}

