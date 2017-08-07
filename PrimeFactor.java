import java.util.Scanner;


public class PrimeFactor
 {
 	public static void main(String [] args)
 	{
	int i,j,n,ctr=0;
	System.out.println("Enter a number:\n");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
			if(i%j==0)
			{
				ctr++;
			}
		}
		if(ctr<=2 && n%i==0)
		{
		    System.out.println(i+"is a prime factor \n");	
		}
		ctr=0;
	}
	
    }
}        