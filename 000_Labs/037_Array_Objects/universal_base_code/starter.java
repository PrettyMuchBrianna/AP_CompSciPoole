/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		int num=101;
		Warrior[] warriors= new Warrior[100];
		Wizard [] wizards= new Wizard [100];
		
		for(a=0;a<a.length-1;a++){
			warriors[a]=new Warrior ("Gimal");
			wizards[a]=new Wizard ("Gandolf");
		}
		int wi=0;
		int wa=0;
	while ((warriors[wa].isDead()==false)&&(wizards[wi].isDead()==false)){
		if (wi<wizards.length){
			wizards[wi].attack(warriors[wa]);
			if (warriors[wa].isDead()){
				wa++;
			}
		}
		if (wa<warriors.length){
            System.out.println("Warriors win!");
            System.out.println("Remaining Warriors: " + (num - wa));
        } 
        else {
            System.out.println("Wizards win!");
            System.out.println("Remaining Wizards: " + (num - wi));
        }

	}
}
