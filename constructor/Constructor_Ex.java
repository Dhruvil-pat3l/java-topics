package constructor;


public class Constructor_Ex {   
	int id;  
	String name;  
	  
	Constructor_Ex(){  
	System.out.println("Default constructor called");  
	}  
	  
	Constructor_Ex(int i, String n){  
	id = i;  
	name = n;  
	}  
	  
	public static void main(String[] args) {  

		Constructor_Ex c = new Constructor_Ex();  

	  
	System.out.println("\nParameterized Constructor values: \n");  
	Constructor_Ex cx = new Constructor_Ex(10, "FULL");  
	System.out.println(" Id : "+cx.id + "\n Name : "+cx.name);  
	}  
	}  