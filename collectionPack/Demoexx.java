package collectionPack;
import java.util.*;
public class Demoexx {

	public static void main(String[] args) {
		 LinkedHashMap book = new LinkedHashMap();
	        
	        book.put("book1",2001);
	        book.put("book2",2002);
	         book.put("book3",2003); 
	        book.put("book4",2002);
	        
	        System.out.println("Year of book : "+book.get("book2"));
	        System.out.println("Books of year 2002 : ");

	        Iterator itr = book.keySet().iterator();
	        
	        while(itr.hasNext()) {
	        	String key = (String)itr.next();
	        	int val = (int) book.get(key);
	        	if(val==2002) {
	        		 System.out.println(key);	
	        	}
	        }
	        
	        

	        
	        

	}

}
