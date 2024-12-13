/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		int x=(int)(Math.random()*1001)+1;
		System.out.println("Guess a number between 1-1000!");
		int number=sc.nextInt();
		
		if (x==number)
		{
			System.out.println("That is correct!");
		}
		else 
		{
			System.out.println("Try again");
		}
	}
}
