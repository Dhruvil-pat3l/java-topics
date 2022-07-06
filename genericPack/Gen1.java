package genericPack;

import java.util.ArrayList;
import java.util.Iterator;

public class Gen1{  
	public static void main(String args[]){  
		
		ArrayList<String> list = new ArrayList<String>();  
		list.add("Hello");  
		list.add("World");  
		//list.add(32);//compile time error  
		  
		String s=list.get(0);//type casting is not required  
		System.out.println("Element is: "+s);  
		
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		} 
  
}  