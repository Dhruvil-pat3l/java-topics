package collectionPack;
import java.util.HashSet;
import java.util.Iterator;  

public class HashSetClass{  
 public static void main(String args[]){  
  HashSet<String> set=new HashSet<>();  
           
  		   set.add("First");  //Add
           set.add("Second"); 
           set.add("Second"); 
           set.add("Third");  
           set.add("Fourth");  
           System.out.println("An initial list of elements: "+set);  
           
           //Removing specific element from HashSet  
           set.remove("First");  
           System.out.println("After invoking remove(First) method: "+set);  
           
           Iterator<String> itr = set.iterator();  
 		   while(itr.hasNext()){  
 			  System.out.println(itr.next());  
 		   }  
 		  
 		   System.out.println("HashCode value: " + set.hashCode()); // Hashvalue
 		  
           HashSet<String> set1=new HashSet<String>();  //New hashset
           set1.add("one");  //Add
           set1.add("Third");  //Add
           
           set.addAll(set1);  // Union
           System.out.println("Updated union set: "+set); 
           
           set.retainAll(set1);  // Intersection
           System.out.println("Updated Intersection set: "+set); 
           
           if(set.contains("Third")) {      // if element is present gives true
 			  System.out.println("Third is in a HashSet");
 		  }
           
           System.out.println("size of HashSet  : "+ set.size() );   // give size of HashSet 
           
           //Removing all the new elements from HashSet  
           set.removeAll(set1);  
           System.out.println("After invoking removeAll() method: "+set);  
           
           //Removing all the elements available in the set  
           set.clear();  
           System.out.println("After invoking clear() method: "+set);  
           
         
 }  
} 