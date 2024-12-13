/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!
        printAnimal();
        greeting("Brianna");
        double newSalary=raise(100000.62,3);
        System.out.println(newSalary);
        newSalary=raise(newSalary,6);
        System.out.println(newSalary);
	}
	public static double raise(double salary, int percent){
	   double amount = salary +(salary*(percent/100.0));
	   return amount;
	}
	public static void greeting(String name) {
	    System.out.println("Hi "+name);
	}
	public static void printAnimal(){
	    System.out.println("  |\\__/,|   (`\\");
	    System.out.println("_.|o o  |_   ) )" );
	    System.out.println("-(((---(((--------)"); 
	}
}