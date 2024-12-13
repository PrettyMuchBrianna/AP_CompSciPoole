/*
   * Author:
   * Date:
   * Collaborator(s):
*/import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a word (all lowercase):");
		String x=sc.nextLine();
		String part1=x.substring(0,2);
		String 1letter=x.substring(0,1);
		boolean yaur=false;
		boolean yaur1=false;
		if ((part1.equals("wh"))||(part1.equals("ch"))||(part1.equals("th"))){
			System.out.println(x.substring(2,x.length())" " + part1+ "ay");
			boolean yaur=true;
		}
		if ((1letter.equals("a"))||(1letter.equals("o"))||(1letter.equals("u"))||(1letter.equals("i"))||(1letter.equals("e"))){
			System.out.prinntln(x+" way");
			boolean yaur1=true;
		}
		if ((yaur1==false)&&(yaur==false)){
			System.out.println(x+ " ay");
		}
	}
}
