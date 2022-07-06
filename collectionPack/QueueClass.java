package collectionPack;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass{  
	public static void main(String args[]){  
		
		Queue<String> queue=new PriorityQueue<>();  
		
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("Queue elements:");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  	
		}  
		queue.remove();  
		queue.poll();
		System.out.print("After removing two elements: ");  	
		System.out.println(queue);
	
        queue.offer("David");
        System.out.println("Updated PriorityQueue: " + queue);
        
        
	}  
}  