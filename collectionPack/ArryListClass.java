package collectionPack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class ArryListClass{    
	public static void main(String args[]){    
     			
			  ArrayList<String> al=new ArrayList<>();    
			  al.add("First");   // add 1 
			  al.add("Hello");    // add "hello"
			  al.add("Hello");    // add "hello" 2nd time 
			  
			  al.add(2,"World");    // add "hello" at 2	    			    
			  System.out.println("arraylist without type : "+al);  
			  
			  Object obj = al.get(0);   // get the element from the arraylist
			  System.out.println("Element at index 1: " + obj);
			  
			  al.set(2, "Full"); // change "World" with "Full"
			  System.out.println("New arraylist after changing: " + al);

			  Collections.sort(al);	//sorting
			  System.out.println("New Arraylist after sorting: " + al);
			  
			  al.remove(2); // remove "Full"
			  System.out.println("New arraylist after removing: " + al);
			   
			  System.out.println("Is arraylist Empty : "+ al.isEmpty() ); // check is empty or not
			  
			  System.out.println("size of arraylist  : "+ al.size() );   // give size of arraylist
			  
			  if(al.contains("Hello")) {      // if element is present gives true
				  System.out.println("Hello is in List");
			  }
			  
			  System.out.println("Index of \"Hello\": " + al.indexOf("Hello")); // return index number of element
			  System.out.println("Index of \"Hello\": " + al.lastIndexOf("Hello")); //return Lastindex number of element
			  al.clear();					// clearing all element
			  al.add("NewArrayElement");    // adding element
			  al.add("NewArrayElement2");
			  System.out.println("After clearing all & adding new : "+al);		
			  
			  // Use methods of Iterator to access elements
			  Iterator<String> itr = al.iterator();
			  while(itr.hasNext()) {
				  System.out.println(itr.next());
			  }
			  
	}    
} 