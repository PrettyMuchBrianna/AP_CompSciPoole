/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int x= (int)Math.random()*1001;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("I am thinking of a number between 0-1000");
		int y= sc.nextInt();
		while (y!=x)
		{
			System.out.println("try again!");
			y=sc.nextInt();
			if (x==y)
			{
				break;
			}
		}
		


		
	}
}
