package collectionPack;
import java.util.Iterator;
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeClass {

	public static void main(String[] args) {
		
		Deque<String> dq=new ArrayDeque<>();  
		
		dq.add("Amit");	
		dq.add("Samir");	
		dq.add("Shiva");	
		dq.add("Rahul");  			//Add First
		dq.offerFirst("Vijay");  	//Add First
		
		dq.addLast("Karan");  		//Add Last
		dq.offer("Jai");  			//Add Last
		System.out.println("Queue elements: "+dq);
		System.out.println("First : "+dq.element());    // Check First
		System.out.println("First : "+dq.peek());       // Check First
		System.out.println("First : "+dq.peekFirst());  // Check First
		System.out.println("First : "+dq.getFirst());    // Check First
		
		System.out.println("Last : "+dq.getLast());    // Check Last
		System.out.println("Last : "+dq.peekLast());    // Check Last
		
		System.out.println("Removed element : "+dq.remove());	    // Remove First
		System.out.println("Removed element : "+dq.removeFirst());  // Remove First
		System.out.println("Removed element : "+dq.poll());         // Remove First
		System.out.println("Removed element : "+dq.pollLast());     // Remove last
		System.out.println("Removed element : "+dq.removeLast());   // Remove last
		
		System.out.println("Queue elements: "+dq); 
		
		System.out.println("Queue elements using Iterator: "); 
		Iterator itr=dq.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  	
		}          
	}
}
