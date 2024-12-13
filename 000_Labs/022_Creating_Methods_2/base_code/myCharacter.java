/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
public static int pow(int x,int y){
		return (int)(Math.pow(x,y));
	}

	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter a number");
	int x= sc.nextInt();
	System.out.println("Enter the number of times this name is printed");
	int y=sc.nextInt();
	System.out.println(pow(x,y));
	

	}
}
	
		
	

