/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
      
       Scanner sc= new Scanner(System.in); 
       System.out.println("Please enter your name");
       String name= sc.nextLine();
       System.out.println("Hello " + name + "!");
        System.out.println("Please enter two numbers");
         int number = sc.nextInt();
         sc.nextLine();
       System.out.println(number);
       System.out.println("Please enter two numbers");
         int numb = sc.nextInt();
         sc.nextLine();
       System.out.println(numb);
       System.out.println("The sum of these two numbers are " + (numb+number));
       System.out.println("Enter your favorite food");
       String food=sc.nextLine();
       System.out.println("I love " + food + " too!");
        
	}
}