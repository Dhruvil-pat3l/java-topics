package collectionPack;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;

class LinkedListClass{    
	public static void main(String args[]){    
   
			 LinkedList<String> al=new LinkedList<>();    
			  
			  al.add("LinkedList");   // add 1 
			  al.add("Hello");    // add "hello"
			  al.add("Hello");    // add "hello" 2nd time 
			  al.addFirst("First"); // add element at 0 index
			  al.addLast("Last");	// add element at last index
			  al.add(2,"World");    // add "hello" at 2	    			    
			  System.out.println("Linkedlist without type : "+al);  
			  
			  Object obj = al.get(2);   // get the element from the linked-list
			  System.out.println("Element at index 2: " + obj);
			  System.out.println("Element at First index: " + al.getFirst());   // get element at First index:
			  System.out.println("Element at Last index : " + al.getLast());	//get element at Last index
			  
			  al.set(2, "Full"); // change "World" with "Full"
			  System.out.println("New linkedlist after changing: " + al);
			  
			  Collections.sort(al);	//sorting
			  System.out.println("New linkedlist after sorting: " + al);
			
			  al.remove(2); // remove "Full"
			  System.out.println("New linkedlist after removing: " + al);
			   
			  System.out.println("Is linkedlist Empty : "+ al.isEmpty() ); // check is empty or not
			  
			  System.out.println("size of linkedlist  : "+ al.size() );   // give size of linkedlist
			  
			  if(al.contains("Hello")) {      // if element is present gives true
				  System.out.println("Hello is in List");
			  }
			  
			  System.out.println("Index of \"Hello\": " + al.indexOf("Hello")); // return index number of element
			  System.out.println("Index of \"Hello\": " + al.lastIndexOf("Hello")); //return Lastindex number of element
			  al.clear();						// clearing all element
			  al.add("NewLinkedListElement");    // adding element
			  System.out.println("After clearing all & adding new : "+al); 	
			 		  
			  // Use methods of Iterator to access elements
			  Iterator<String> itr = al.iterator();
			  System.out.print("Using Iterator method: ");
			  while(itr.hasNext()) {
				  System.out.print(itr.next()+", ");
				 
			  }
			  
	}    
} 