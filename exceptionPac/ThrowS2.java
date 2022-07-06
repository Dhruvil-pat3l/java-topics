package exceptionPac;
import java.io.*;  

class M{  
 void method()throws IOException{    
  throw new IOException("device error");

 }  
}  
class ThrowS2{  
   public static void main(String args[])throws IOException{//declare exception  
	   try{  
		     M m=new M();  
		     m.method();  
		    }
	   catch(Exception e){
		   System.out.println("exception handled");
	   }     
		  
		System.out.println("normal flow...");  
   	}  
}  