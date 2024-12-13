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
		int [] arr= new int[201];
		int min= Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=51; i<201;i++){
			System.out.print(i+" ");
			arr[i]=(int)(Math.random()*101);
			System.out.println(arr[i]);
			if (arr[i]<min){
				min=arr[i];
				System.out.println("Minimum: "+min);
			}
			if(arr[i]>max){
				max=arr[i];
				System.out.println("Max: "+max);
			}
			int sum = 0;
    		 for (int num : arr) {
        	 sum += num;
    		 }
    		 double average = sum /100;
    		 System.out.println("Average: "+ average);
		}
		
		
	}
}
