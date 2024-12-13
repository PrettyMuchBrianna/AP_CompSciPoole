import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		myCharacter character1 = new myCharacter();
        System.out.println("Character 1 role: " + character1.getRole());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your character's role (Wizard, Warrior, Rogue): ");
        String nameChoice = scanner.nextLine();

        myCharacter character2 = new myCharacter(userInput);
        System.out.println("Character 2 role: " + character2.getRole());

	}
}
