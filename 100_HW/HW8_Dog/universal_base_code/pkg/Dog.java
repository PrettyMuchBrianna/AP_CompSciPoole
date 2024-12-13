package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String Name;
	String Breed;
	int age;
	
	public Dog() {
		Name=("Clifford");
		Breed=("big red dog");
		age=3;
	}
	
	public Dog(String n, String b, int a){
		Scanner sc=new Scanner (System.in);
		Name=n;
		Breed=b;
		age=a;
	}
	
	public String getName(){
		return Name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getBreed(){
		return Breed;
	}
	
	public boolean isSleeping(){
		int sleep=(int)(Math.random()*2);
		if (sleep==1){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void String isBarking(){
		System.out.println(Name+" it barks!");
	}
	public void DogToString(){					// Prints all values of the Employee	
		System.out.println("------------------------------");
		System.out.println("Dog Name: " + Name);
		System.out.println("Dog Breed: " + Breed);
		System.out.println("Age: " + age);
		System.out.println("------------------------------");
		System.out.println("");
	}

}
