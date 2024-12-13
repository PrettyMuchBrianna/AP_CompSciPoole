/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("Please enter a number: ");
		Scanner sc=new Scanner (System.in);
		int number1=sc.nextInt();
		System.out.println(number1);
		
		System.out.print("Please enter a number: ");
		int number2=sc.nextInt();
		System.out.println(number2);
		
		if (number1==number2)
			{
				System.out.println("Bobbybobcheesebob");
			}
		else if(number1!=number2)
			{
				System.out.println("FreddyFredpandafred");
			}
	}
}
