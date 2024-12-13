/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc= new Scanner (System.in);
		System.out.print("Please enter a number:");
		int number1=sc.nextInt();
		System.out.println(number1);
		
		System.out.print("Please enter a number:");
		int number2=sc.nextInt();
		System.out.println(number2);
		
		System.out.print("Please enter a number:");
		int number3=sc.nextInt();
		System.out.println(number3);
	
	if ((number1>number2)||(number1>number3))
	{
		System.out.println("The biggest number is "+number1);
	}
	else if((number2>number1)||(number2>number3))
	{
		System.out.println("The biggest number is "+number2);
	}
	else if ((number3>number2)||(number3>number1))
	{
		System.out.println("The biggest number is "+number3);
	}
	
		if ((number1<number2)||(number1<number3))
	{
		System.out.println("The smallest number is "+number1);
	}
	else if((number2<number1)||(number2<number3))
	{
		System.out.println("The smallest number is "+number2);
	}
	else if ((number3<number2)||(number3<number1))
	{
		System.out.println("The smallest number is "+number3);
	}
		
		
	}
}
