/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog test = new Dog();
		test.DogtoString();
		
		Dog meow= new Dog ("Meow", 4, "golden retriever");
		meow.isSleeping();
		if (true)
			{
				meow.isBarking();
			}
		meow.DogtoString();
		
		Dog bob= new Dog ("Bob", 3, "Labordoodle");
		if (meow.isBarking==true){
			bob.isBarking();	
		}
		dog.isSleeping();
		dog.DogtoString();


	}
}
