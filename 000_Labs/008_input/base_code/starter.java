/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your first name?");
			String name = sc.nextLine();
		System.out.println("Hello " + name);
			
		System.out.println("What is your age?");
			int age= sc.nextInt();
		System.out.println("You are " + age);
		sc.nextLine();
			
		System.out.println("What month were you born in?");
			String birthdaymonth=sc.nextLine();
		System.out.println("You were born in " +birthdaymonth);
		
		System.out.println("What day were you born?");
			int day=sc.nextInt();
		System.out.println("You were born on the " + day);
		sc.nextLine();
		
		System.out.println("What is your birth year");
			int year=sc.nextInt();
		System.out.println("You were born in " + year);
		
		System.out.println("How much is a buck fifty");
			double buck=sc.nextDouble();
		
		
		
		
		
	}
}
