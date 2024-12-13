/* 
    Lecture note example - Classes
*/
package pkg;

import java.util.Scanner;
import java.util.Random;

public class myCharacter{
    String role;
    int strength;
    int dexterity;
    int intelligence;
    int charisma;
        
        public string setRole (String r){
            Scanner sc = new Scanner (System.in);
            System.out.println("What is your role? (Wizard, warrior, or rogue)");
            String role=sc.nextLine();
            if (role.equals("Warrior"))
            {
                System.out.println("You are a "+r);
                strength = 5;
                dexterity = 10;
                intelligence = 20;
                charisma = 15;
        }
        if (role.equals("Wizard"))
            {
                System.out.println("You are a "+role);
                strength = 5;
                dexterity = 10;
                intelligence = 20;
                charisma = 15;
        }
        if (role.equals("Rogue"))
            {
                System.out.println("You are a "+role);
                strength = 5;
                dexterity = 10;
                intelligence = 20;
                charisma = 15;
        }
            
        }
        public int setStrength(int strength){
            if (strength>=0){
                return 0;
            }
        }
        public int setInteligence(int intelligence){
            if (strength>=0){
                return 0;
            }
        }
        public int setCharisma(int charisma){
            if (strength>=0){
                return 0;
            }
        }
        public int setDexterity(int dexerity){
            if (strength>=0){
                return 0;
            }
        }
        public boolean setAll(String r, int strength, int intelligence, int charisma, int dexterity ){
            return true;
        }
        
        public void myToString() {
        System.out.println("Role: " + role);
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Charisma: " + charisma);
    }


    
}

