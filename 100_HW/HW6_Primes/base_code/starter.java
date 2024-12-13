/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a integer");
		int a=sc.nextInt();
		printPrimes(a);
	}
	public static boolean checkPrime(int a){
		int b=2;
		while (b<a){
			if (a%b==0){
				return false;
			}
			b++;
		}
		return true;
	}


	public static void printPrimes(int a){
		int b=2;
		while (a>b){
			if(checkPrime(b)){
				System.out.println(b);
			}
			b++;
		}
	}
	
}
