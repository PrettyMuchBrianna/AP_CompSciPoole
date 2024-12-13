/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int money=100;
		System.out.println("Welcome to slots.");
		
		while (money>0)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Would you like to wager?");
			String answer= sc.nextLine();
			if ((answer.equals("Y"))||(answer.equals("y"))||(answer.equals("yes"))||(answer.equals("y")))
			{
				System.out.println("How much would you like to wager?");
				int wager=sc.nextInt();
				int dice1=(int)(Math.random()*6);
				int dice2=(int)(Math.random()*6);
				int dice3=(int)(Math.random()*6);
				System.out.println(dice1);
				System.out.println(dice2);
				System.out.println(dice3);
			
				if ((dice1==dice2)&&(dice1==dice3)&&(dice2==dice3))
				{
					int jackpot=money + wager*3;
					System.out.println("Jackpot!You now have "+jackpot);
					
				}
				else if ((dice1==dice2)||(dice2==dice1)||(dice1==dice3)){
					int sum=money+wager*2;
					System.out.println("Congrats! You now have " + sum);
				}
				else {
					int lostsum=money-wager;
					System.out.println("Oops!You now have "+lostsum);
				}	
			
			}
			else {
				break;
			}
			
		}
		
	}
}
