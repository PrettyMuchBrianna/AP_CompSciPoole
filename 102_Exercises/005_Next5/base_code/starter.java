/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	System.out.println("Please enter a number!");
	Scanner sc = new Scanner (System.in);
	int number=sc.nextInt();
	System.out.println("Here are the next five numbers!");
	System.out.println(number);
	System.out.println(number+1 );
	System.out.println(number+2 );
	System.out.println(number+3 );
	System.out.println(number+4);
	System.out.println("Here are the multiples of " + number);
	System.out.println(number);
	System.out.println(number+number);
	System.out.println(number+number+number);
	System.out.println(number+number+number+number);
	System.out.println(number+number+number+number+number);
	System.out.println("Here is "+number+ " divided by 100");
	sc.nextLine();
	System.out.println(number/100.0);
	System.out.println("Here is 100 divided by "+number);
	System.out.println(100.0/number);
	
	}
}
