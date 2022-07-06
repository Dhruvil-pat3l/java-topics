package logical;
import java.util.*;

public class IncrementSum {
	public static void main(String[] arg) {
		
		IncrementSum sObj = new IncrementSum();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st numeric value : ");
		int int1= sc.nextInt();
		
		System.out.print("\nEnter 2st numeric value : ");
		int int2= sc.nextInt();
		
		System.out.print("\nEnter bollean value : ");
		boolean bln= sc.nextBoolean();
		
		sc.close();
		
		System.out.print("\nSum = "+sObj.sumOfNumbers(int1, int2, bln));	
	}
	int sumOfNumbers(int a, int b, boolean bn) {
		int sum=0;
		if(bn) {
			if(b==6) {
				b=0;
			}
			sum=a+(++b);
		}
		else {
			sum=a+b;
		}
		return sum;
	}
}