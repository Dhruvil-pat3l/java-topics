package exceptionPac;

public class ExceptionClass {

	public static void main(String[] args) {
		 try{ 
		      int arr[] = {1,2,3,4,5};
		      System.out.println(arr[10]); 
		   }
		 catch(ArithmeticException e){
			 System.out.println("Exception in Arithmetric operation");
		 }  
		 catch(ArrayIndexOutOfBoundsException e) {
			  System.out.println("Exception in Array operation"); 
		 }
		  
		   System.out.println("After Exception");  
	}

}

