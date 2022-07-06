package logical;
import java.util.*;
class Pldm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1, str2="";
        System.out.println("Enter String : "); 
        str1= sc.nextLine();
        sc.close();
        for(int i=(str1.length())-1; i>=0; i--){
            str2= str2 + str1.charAt(i);
        }
       
        if(str1!="" && str1.equalsIgnoreCase(str2)) {
        	System.out.println("Given String is Palindrome."); 
        } 
        else if (str1=="") {
        	System.out.println("No String is Entered"); 	
        }
        else {
        	System.out.println("Given String is NOT Palindrome."); 
        } 
    }
}