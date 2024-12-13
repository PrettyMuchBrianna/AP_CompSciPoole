/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
			Scanner sc=new Scanner (System.in);
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
		
	}
}
