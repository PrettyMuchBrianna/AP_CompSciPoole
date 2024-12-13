/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		System.out.println("What is your character name?");
		String name=sc.nextLine();
		System.out.println("Welcome "+name);
		System.out.println("What is your character title?");
		String title=sc.nextLine();
		System.out.println("Welcome "+title);
		System.out.println("Do you want to be wizard,warrior, or a rogue?");
			String role=sc.nextLine();
			
			if ((role.equals("warrior"))||(role.equals("wizard"))||(role.equals("rogue")))
				{
					System.out.println("You are a "+role);
				}
			else
				{
					System.out.println("Please choose a role");
				}
		System.out.println("Would you like to buy strength, agility, inteligence, or charisma?(Each are 10 points)");
		String traits=sc.nextLine();
		int points=20;
			if ((traits.equals("strength"))||(traits.equals("agility"))||(traits.equals("inteligence"))||(traits.equals("charisma")))	
				{
					int points2=(points-10);
					System.out.println("You selected " + traits+ " You have "+points2+" points. You can choose one more trait. Which one would you like to choose?");
					sc.nextLine();
				}
				System.out.println("Would you like to buy strength, agility, inteligence, or charisma?(Each are 10 points)");
				String traits2=sc.nextLine();
		 if ((traits2.equals("strength"))||(traits2.equals("agility"))||(traits2.equals("inteligence"))||(traits2.equals("charisma")))
						{
							System.out.println("You selected " + traits2);
							System.out.println("You have no points left");
						}
		else {
			System.out.println("Please choose a role");
		}
				}
	
}
