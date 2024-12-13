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
		int [] arr= new int[1001];
		int i=0;
		while (i<1001){
			arr[i]=(int)(Math.random()*1000);
			System.out.print(i+" ");
			System.out.println(arr[i]);
			i++;
		}


		
	}
}
