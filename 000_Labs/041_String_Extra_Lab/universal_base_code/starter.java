/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a phrase:");
		String x=sc.nextLine();
		int space1= x.indexOf(" ");
		String reverse=x.substring(0,space1);
		int space2=x.indexOf(space1+1," ");
		String reverse2=x.substring(space1+1,space2);
		for (i=0;i<i.length;i++){
			if (reverse2==" "){
				System.out.println(reverse2);
				x=0;
			}
		}


		
	}
}
