/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

public class myCharacter {
        String role;
        
        public myCharacter(String role){
            Scanner sc = new Scanner (System.in);
            System.out.println("What is your role? (Wizard, warrior, or rogue)");
            String r=sc.nextLine();
            if ((r.equals("Warrior"))||(r.equals("Wizard"))||(r.equals("Rogue")))
            {
                System.out.println("You are a " + role);
        }
    }

  
    
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here



		
	}
}
