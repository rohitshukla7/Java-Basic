/******************************************************************************
 *  Compilation:  javac GamblerSimulator.java
 *  Execution:    java GamblerSimulator stake goal trials
 *
 *  @author  Rohit Shukla
 *  @version 1.0
 *  @since   13-08-2017
 * output:
 *	java GamblerSimulator 10000 15000 30
 *	Stake:10000 , Goal:15000 , Number of Trial:30
 *	16 wins of 30
 *	Percentage of games won = 53.333333333333336%

 ******************************************************************************/
import java.util.Scanner;
public class GamblerSimulator
{		
		       
		static int wins=0;				// variable to store the number of wins
		static int stake;				// variable to store the stake amount
		static int goal;				// variable to store the Goal amount 
		static int trials;				// variable to store the number of trials
		static int cash;				// variable to store the same value of stake
	public static void main(String[] args)
	{	//taking three command line arguements as stake, goals and trials respectively
		stake=Integer.parseInt(args[0]);
		goal=Integer.parseInt(args[1]);
		trials=Integer.parseInt(args[2]);
		System.out.println("Stake:"+stake+" , "+"Goal:"+goal+" , "+"Number of Trial:"+trials);
		//running the loop until it reaches the number of trials
		for(int i=0;i<=trials;i++)
		{
			cash=stake;
			while(cash>0 && cash<goal)
			{
				
				if(Math.random()>0.5)			
				{
					cash++;						// incrementing the value of cash if it is greater than  0.5
				}
				else
				{
					cash--;						// decrementing the value of cash if it is lesser than  0.5
				}
			}
			if(cash==goal)					// if the cash becomes equal to the goal amount then increment the number of wins
			{
				wins++;
			}
		}
		
        System.out.println(wins + " wins of "+trials);
        System.out.println("Percentage of games won = "+100.0*wins/trials+"%");

    }
	
}
