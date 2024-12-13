/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr= new int[21];
		int elements=(int)(Math.random()*10)+1;
		int dupes=0;
		for(int i=0; i<21;i++){
			System.out.print(i+" ");
			arr[i]=(int)(Math.random()*10)+1;
			System.out.println(arr[i]);
			if (elements==arr[i]){
				dupes ++;
			}
		}
		for(int i=0; i<20;i++){
			int consecutive=arr[i+1];
			int counter=1;
			if (consecutive==arr[i]){
				counter++;
				System.out.println("------------------------------------");
				System.out.println("The number " + arr[i] + " is consecutive "+ counter + " times");
			}
		}
		System.out.println("------------------------------------");
		System.out.println(elements+" has " + dupes+ " dupes ");
	}
}
