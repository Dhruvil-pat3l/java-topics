package exceptionPac; 
import java.io.IOException;  
public class ThrowS1{  
  void m()throws IOException{  
    throw new IOException("device error");
  }  
  void n()throws IOException{  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
   ThrowS1 obj=new ThrowS1();  
   obj.p();  
   System.out.println("rest of code");  
  }  
} 