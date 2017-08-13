import java.util.Scanner;
public class IntOpt
{ 
        public static void main(String[] args)
        { 
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=Integer.parseInt(args[2]);
			System.out.println("a+b*c:"+(a+b*c));
			System.out.println("a*b+c:"+(a*b+c));
			System.out.println("c+a/b:"+(c+a/b));
			System.out.println("a%b+c:"+(a%b+c));
			
		}
}
