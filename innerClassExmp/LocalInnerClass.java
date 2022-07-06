package innerClassExmp;

public class LocalInnerClass{  
	
	private int data=30;
	
	void display(){  
	  int value=50;
	  class LocalInner{  
	   void msg(){System.out.println("Method Variable : "+value +"\nInstance Variable : "+data);}  
	  }  
	  
	  LocalInner ic=new LocalInner();  
	  ic.msg();  
	 }  
	 public static void main(String args[]){  
	  LocalInnerClass obj=new LocalInnerClass();  
	  obj.display();  
	 }  
	}  