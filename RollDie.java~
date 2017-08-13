import java.util.Scanner;
public class RollDie
{ 
        public static void main(String[] args)
        { 
				int n,greatest;
				int arr[]=new int[6];
				Scanner sc=new Scanner(System.in);
				System.out.println("enter how many times you want to roll a die..");
				n=sc.nextInt();
				for(int i=1;i<=n;i++)
				{
                int d=(int)(Math.random()*6)+1;
				switch(d)
				{
					case 1:
						arr[0]++;
						break;
					case 2:
						arr[1]++;
						break;
					case 3:
						arr[2]++;
						break;
					case 4:
						arr[3]++;
						break;
					case 5:
						arr[4]++;
						break;
					case 6:
						arr[5]++;
				}
				}
				
				greatest=arr[0];
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i]>greatest);
					greatest=arr[i];
					
				}
				System.out.println("The number which appers most number of times is :"+greatest);
        }
}

