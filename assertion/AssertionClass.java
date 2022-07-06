package assertion;
import java.util.Scanner;  

class AssertionClass{  
 public static void main( String args[] ){  
  
  Scanner sc = new Scanner( System.in );  
  System.out.print("Enter ur age : ");  
    
  int value = sc.nextInt();  
  sc.close();
  assert value>=18:" Not valid";  
  
  System.out.println("value is "+value);  
 }   
}  
