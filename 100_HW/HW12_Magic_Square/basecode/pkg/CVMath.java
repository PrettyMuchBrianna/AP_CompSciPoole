package pkg;

public class CVMath {		
	public static boolean perfectSquare(int num){
		int s=(int)(Math.sqrt(num));
		return s*s==num;
	}
	public static boolean perfectThree(int num){
		int i=1;
		int sum=0;
		while (sum<num){
			sum=sum+i;
			i++;
		}
		return sum==num;
	}
	public static void specialSquares(int n){
		int count=1;
		int i=0;
		while (i<n){
			if ((perfectThree(count))&&(perfectSquare(count))){
				System.out.println(count);
			}
			else {
				System.out.println("It is not a special square");
			}
		}
	}
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
}
