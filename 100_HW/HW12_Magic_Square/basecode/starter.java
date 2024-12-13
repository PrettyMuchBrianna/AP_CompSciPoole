import pkg.*;

class starter {
	public static void main(String args[]) {
		// CVMath.specialSquare(5);
		System.out.println(CVMath.findMid(2,3,1));
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to check if it is a perfect square");
		int number=sc.nextInt();
		CVMath.specialSquares(number);
		
	}
}
