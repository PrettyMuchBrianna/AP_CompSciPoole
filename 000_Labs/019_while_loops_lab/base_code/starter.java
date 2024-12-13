/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a name");
		String name= sc.nextLine();
		System.out.println("Welcome "+ name);
		
		int y=0;
		System.out.println("Enter the number of times this name should be outputed");
		int x=sc.nextInt();
		
		while (y<x)
		{
			System.out.println(name);
			y++;
		}



		
	}
}
