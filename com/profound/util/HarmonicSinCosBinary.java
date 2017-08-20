package com.profound.util;
import java.util.Scanner;
import java.lang.Math;
public class HarmonicSinCosBinary{
	static int harmonicNumber,choice,decimalNumber,temp=0,lenghtOfSeries,p=1,sign=1;
	static double sum=0.0,sinAngle,cosAngle;

	public static Double harmonic(int n){
		for(int i=1;i<=harmonicNumber;i++){
			sum+=1.0/i;
		}
		return sum;
	}

	public static void binary(int decimalNumber){
		int i=0;
		int array[]=new int[10];
		while(decimalNumber>0){
			array[i]=decimalNumber%2;
			decimalNumber/=2;
			temp++;
			i++;
		}
		for(i=temp-1;i>=0;i--){
			System.out.print(array[i]);
		}
	}

	public static Double sin(int lenghtOfSeries,double sinAngle){
		sinAngle=sinAngle%(2*Math.PI);
		for(int i=1;i<=lenghtOfSeries;i++){
			sum+=sign*(Math.pow(sinAngle,p)/fact(p));
			sign=-sign;
			p+=2;
		}
		return Math.sin(sum);
	}

	public static Double cos(int lenghtOfSeries,double cosAngle){
		cosAngle=cosAngle%(2*Math.PI);
		if(int i==1){
			sum+=1;
			sign=-sign;
			p+=2;
		}

		for(int i=1;i<=lenghtOfSeries;i++){
			sum+=sign*(Math.pow(cosAngle,p)/fact(p));
			sign=-sign;
			p+=2;
		}
		return Math.cos(sum);
	}

	//calculate factorial
    public static int fact(int p){
       int fact=1;
       if(p==0||p==1){
           return 1;
       }
       else{
           while(p>0){
               fact+=p;
               p--;
           }
           return fact;
       	}
    }

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Harmonic Number");
		System.out.println("2.Sin");
		System.out.println("3.Cos");
		System.out.println("4.Binary");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice){
			case 1:
				System.out.println("Enter a number");
				harmonicNumber=sc.nextInt();
				System.out.println(harmonic(harmonicNumber));
				break;
			case 2:
				System.out.println("Enter lenght of taylor series:");
       			lenghtOfSeries=sc.nextInt();
        		System.out.println("Enter angle:");
        		sinAngle=sc.nextDouble();
        		System.out.println("Sin"+sinAngle+"="+sin(lenghtOfSeries,sinAngle));
        		break;
        	case 3:
				System.out.println("Enter lenght of taylor series:");
       			lenghtOfSeries=sc.nextInt();
        		System.out.println("Enter angle:");
        		cosAngle=sc.nextDouble();
        		System.out.println("Cos"+cosAngle+"="+cos(lenghtOfSeries,cosAngle));
        		break;
			case 4:
				System.out.println("Enter a decimal number");
				decimalNumber=sc.nextInt();
				binary(decimalNumber);
				break;
			default:
				System.out.println("Invalid input......");
		}
	}
}