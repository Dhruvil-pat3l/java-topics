package logical;
import java.util.Scanner;

public class ZigZag {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String Input : ");
		String str=sc.nextLine();					//String input
		
		System.out.print("\nEnter Number of Row : ");
		int row = sc.nextInt();						// Row input
		
		sc.close();
		
		StringBuilder strOut = new StringBuilder("");
 
        if (str == null || row <= 0) {
           strOut.append("");
        }
        else if (row == 1) {
            strOut.append(str);
        }
        else {
	        int n = (2*row) - 2;
	        int ln = str.length();
	      
	        for (int i = 0; i < row; i++) {			// Foe each row
	           
	            for (int j = i; j < ln; j =j+ n) {  // For each character in a row
	            	strOut.append(str.charAt(j));
	            	
	            	int temp = n +j - (2*i);
	            	if (i != 0 && i != row - 1 && temp <ln) {
	                	strOut.append(str.charAt(temp));
	                }
	            }
	        }
        }
        System.out.print("\nOutput : "+strOut);
    }
}