package collectionPack;
import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetClass {

	public static void main(String[] args) {
	 	  TreeSet<Integer> set=new TreeSet<>();  
	 	  set.add(5); 
	 	  set.add(7);
	 	  set.add(7);
		  set.add(2);
		  set.add(8);
		  set.add(4);
				
		  System.out.println("TreeSet : "+set);  		    // Ascending Order
		  
		  Iterator<Integer> itr = set.descendingIterator();  // Descending Order
		  while(itr.hasNext()){  
			  System.out.println(itr.next());  
		  }  
		  
		  System.out.println("Lowest Value: "+set.pollFirst());    // Lowest Value
	      System.out.println("Highest Value: "+set.pollLast());    // Highest Value
	     
	      set.add(8);
		  set.add(2);
          System.out.println("Reverse Set: "+set.descendingSet());  //Reverse set
           
          System.out.println("Head Set: "+set.headSet(5));  // headset
          
          System.out.println("SubSet: "+set.subSet(4,true, 7,false));  // subset 
           
          System.out.println("TailSet: "+set.tailSet(4, false));  // Tailset
          
          System.out.println("Lower of 7 : "+set.lower(7));  //lower value
          System.out.println("Higher of 7 : "+set.higher(7));  //higher value
        	
          System.out.println("Ceiling value of 5: "+ set.ceiling(5));  //used to return the least element in this set greater than or equal to the given element, or null if there is no such element.
       
          System.out.println("Floor value of 6: "+ set.floor(6)); // return the greatest element in this set less than or equal to the given element, or null if there is no such element.
          
          System.out.println("size of TreeSet  : "+ set.size() );   // give size of TreeSet 
          
          set.remove(2); // remove "2"
		  System.out.println("New TreeSet after removing: " + set);
          
          TreeSet<Integer> set1=new TreeSet<>();  
          set1.add(10);  
          set1.add(0);  
          set.addAll(set1);  	// addAll
          System.out.println("Updated TreeSet: "+set);  
          
          if(set.contains(7)) {      // if element is present gives true
			  System.out.println("7 is in a TreeSet");
		  }
          
          Iterator<Integer> itr2 = set.iterator();
          while(itr2.hasNext()) {
        	  System.out.println(itr2.next());
          }
          
	}

}
