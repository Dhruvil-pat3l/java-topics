package logical;
import java.util.Scanner;

class SplitClass{
	
	 boolean isPldm(String str1) {   // Check substring is palindrome or not
		 	String str2="";
		 	boolean x=false;
	        for(int i=(str1.length())-1; i>=0; i--){
	            str2= str2 + str1.charAt(i);
	        }	       
	        if(str1!="" && str1.equalsIgnoreCase(str2)) {
	        	x= true;
	        } 
	 return x;   
	 }
	 
	 void split(String strSP) {		// split into various substring
		String strOut="";			
		int count=0, ln=strSP.length();
		
		for(int i=0; i<ln;i++) {	// substring of every character 
			StringBuilder tempStr = new StringBuilder(""); // temp substring 
			tempStr.append(strSP.charAt(i));			
			
			for(int j=i;j<ln-1;j++) {		
				
				tempStr.append(strSP.charAt(j+1));		// assign substring
				if(isPldm(tempStr.toString())) {
					 if(count<(tempStr.length())) {
						 strOut = tempStr.toString(); 	// longest substring
						 count=tempStr.length();
					 }
				 }
			}
		}
		System.out.println("\nLongest Palindromic Substring : "+strOut);	// Output
	 }
}

public class LongestPldm {
	 public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	        String str;
	        System.out.print("Enter String : "); 
	        str= sc.nextLine();			// String Input
	        sc.close();
	        
	        SplitClass sp = new SplitClass();	
	        sp.split(str);				// Method call
	 }       
}
