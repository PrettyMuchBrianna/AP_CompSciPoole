/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf test = new PooleDwarf();
		test.dwarfToString();
		
		PooleDwarf Dwarf1= new PooleDwarf();
		Dwarf1.randName();
		Dwarf1.dwarfToString();
		
		PooleDwarf Dwarf2= new PooleDwarf();
		Dwarf2.randName();
		Dwarf2.dwarfToString();
		
		PooleDwarf Dwarf3= new PooleDwarf();
		Dwarf3.randName();
		Dwarf3.dwarfToString();
		
		PooleDwarf Dwarf4= new PooleDwarf();
		Dwarf4.randName();
		Dwarf4.dwarfToString();
		
		PooleDwarf Dwarf5= new PooleDwarf();
		Dwarf5.randName();
		Dwarf5.dwarfToString();
		
		PooleDwarf Dwarf6= new PooleDwarf();
		Dwarf6.randName();
		Dwarf6.dwarfToString();
		
		PooleDwarf Dwarf6= new PooleDwarf();
		Dwarf6.randName();
		Dwarf6.dwarfToString();
			
		if ((Dwarf1==Dwarf2)||(Dwarf1==Dwarf3)||(Dwarf1==Dwarf4)||(Dwarf1==Dwarf5)||(Dwarf1==Dwarf6)||(Dwarf1==Dwarf7)){
			System.out.println(Dwarf1.dwarfName());
		}
		
	}
}
