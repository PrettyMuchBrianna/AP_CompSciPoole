/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class PooleDwarf{
	private String name;
	private int age;

	public PooleDwarf() {		// Default Constructor
		name = new String("");
		age = 0;
	}

	public PooleDwarf(String name, int age){
		this.name=name;
		this.age=age;
	}

	/*	Accessor Methods */
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	/*	Mutator Methods	*/
	public void setName(String nane){
		this.name=name;
	}
	
	public void setAge(int age){
		this.age=age;
	}

	public boolean isSameName(String name){
		if (this.name.equals(name)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void dwarfToString(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println();
	}
	
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
	
	public void dwarfName(){
		System.out.println("Name: "+name);
	}
}

