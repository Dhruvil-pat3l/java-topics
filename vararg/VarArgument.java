package vararg;

public class VarArgument {

	   
	 static void display(int x, int... a){  
		System.out.print("display method called \n"+x);  
	  	for(int i:a){  
	  	System.out.print(", "+i);  
	  	}  
	  	System.out.println("\n");
	 }
	  
	 public static void main(String args[]){  
	  
	 display(1); 
	 display(1,2);   
	 display(1,2,3,4,5); 
	 }   
	}  
