package serialization;  
import java.io.*; 

class SerializatinClass{    
       public static void main(String args[]){
               try{
                      Employee emp1 =new Employee(2110,"David");
                      FileOutputStream fout=new FileOutputStream("output.txt");
                      ObjectOutputStream out=new ObjectOutputStream(fout);
                      out.writeObject(emp1);               
                      out.close();
                      System.out.println("Successfully saved data in Output.txt");
               }
               catch(Exception e){
                      System.out.println(e);
               }
       }
} 

