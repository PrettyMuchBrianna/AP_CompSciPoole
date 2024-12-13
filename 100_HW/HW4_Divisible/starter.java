/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num1= sc.nextInt();
		System.out.println(num1);
		
		System.out.println("Enter a number:");
		int num2= sc.nextInt();
		System.out.println(num2);
	if ((num1 % 2==0)||(num2 % 2==0)) {
		System.out.println("The number " + num1 + " is even");
		System.out.println("The number " + num2 + " is even");
		
	}
	else {
		System.out.println("The number " + num1 + " is odd");
		System.out.println("The number " + num2 + " is odd");
	}
     if ((num1 % 3 == 0 && num1 % 4 == 0 && num1 % 5 == 0)||(num2 % 3 == 0 && num2 % 4 == 0 && num2 % 5 == 0))
        {
        	 System.out.println(num1 + " is divisible by 3, 4, and 5.");
        	 System.out.println(num2 + " is divisible by 3, 4, and 5.");
        }
        else {
                System.out.println(num1 + " is NOT divisible by 3, 4, and 5.");
                System.out.println(num2 + " is NOT divisible by 3, 4, and 5.");
        }
		 }
	}

