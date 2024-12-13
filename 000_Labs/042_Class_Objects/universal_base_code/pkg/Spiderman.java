/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;
	
public class Spiderman {
	String actor;	
	int age;			
	String villain;		
	
	
	public Spiderman(String act, int a, String vil){
		actor=act;
		age=a;
		villain=vil;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	public void setVillain(String villain){
		this.villain=villain;
	}
	
	public void setActor(String actor){
		this.actor=actor;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getActor(){
		return actor;
	}
	
	public String getVillain(){
		return villain;
	}
	
	public void print(){
		System.out.println("The actor "+actor +" is "+ age + " years old.");
		System.out.println("They play Spiderman whos villain is the " + villain);
	}
	}