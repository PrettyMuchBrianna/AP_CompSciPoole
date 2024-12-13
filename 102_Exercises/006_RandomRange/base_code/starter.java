/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Enter two numbers to create a range for your random number"); 
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter a number:");
		int number1=sc.nextInt();
		System.out.println(number1);
		System.out.print("Please enter another number (greater than the first):");
		int number2=sc.nextInt();
		System.out.println(number2);
		System.out.println("Your range is "+number1 +" to " +number2);
		System.out.println("Here are five numbers generated in that range");
		int x = (int)(Math.random()*number2-number1)+number1;
		System.out.println(x);
		
		int y = (int)(Math.random()*number2-number1)+number1;
		System.out.println(y);

		int w = (int)(Math.random()*number2-number1)+number1;
		System.out.println(w);
	
		int z = (int)(Math.random()*number2-number1)+number1;
		System.out.println(z);
	
		int v = (int)(Math.random()*number2-number1)+number1;
		System.out.println(v);
		
		
		
		
		
	}
}
