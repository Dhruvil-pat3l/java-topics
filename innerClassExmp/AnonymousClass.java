package innerClassExmp;

interface AnonymousInterface{  
	 void msgMethod();  
	}  
public class AnonymousClass{  
	 public static void main(String args[]){  
		 
		 AnonymousInterface e=new AnonymousInterface(){  
			 public void msgMethod(){System.out.println("Msg from Anonymos class");}  
		 };
		 	
	 e.msgMethod();  
	 }  
} 