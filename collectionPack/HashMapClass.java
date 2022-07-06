package collectionPack;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class HashMapClass {

	public static void main(String[] args) {
		 HashMap<Integer,String> map=new HashMap<>();  
		 
		  map.put(11,"V1");  //New Entry
		  map.put(12,"V2");  
		  map.put(13,"V3"); 
		  map.putIfAbsent(14, "V4"); // will put if absent
		  
		  String str= map.put(12,"V"); // Override duplicate
		  System.out.println("Returned Value : "+str);
		 
	      System.out.println("Map : " + map); 
	      // Display the Map
	      
	      System.out.println("Keys: " + map.keySet());
	      // Using keySet()
	      
	      System.out.println("Only Values : " + map.values());
	      // Display only Values
	        
		  for(HashMap.Entry mi :map.entrySet()){  
			  System.out.println(mi.getKey()+" "+mi.getValue());  
		  }  
		   
	      System.out.println("The Value is of 11: " + map.get(11));
	      // get value  of 11
	 
	      System.out.println("The Value is of 22: " + map.get(22));
	      // get value  of 22(null)
	      
	      map.remove(13); 
	      // remove element
	      System.out.println("Map after removing : "+map);
	      
		  System.out.println("HashCode value: " + map.hashCode());
		  // give hash valye
		  
		  System.out.println("Is Map Empty : "+map.isEmpty());
		  // check if it is empty or not
		  
		  System.out.println("Is the key '13' present : "+ map.containsKey(13));
		  // return true if it contains key
		  
		  System.out.println("Is the Value 'V2' present : "+ map.containsValue("V2"));
		  // return true if it contains value
		  
		  HashMap<Integer, String> mp = new HashMap<>();
	        mp.put(10, "Ten");
	        mp.put(30, "Thirty");
	        mp.put(50, "Fifty");
	  
	        map.putAll(mp);  //putall method  copy all from mp to map
	        System.out.println("After PutAll Method : "+map);
		  
		  
		  HashMap<Integer,String> clonemap = (HashMap<Integer,String>)map.clone();
		  // clone map
		  System.out.println("ClonedMap : " + clonemap); 
		  
	      Iterator<Map.Entry<Integer,String>> itr = map.entrySet().iterator();
	      while(itr.hasNext()) {
	    	  Map.Entry<Integer,String> temp = itr.next();
	    	  System.out.println(temp.getKey()+"::"+temp.getValue());
	      }      
	
	      
	      for (Map.Entry<Integer,String> me : map.entrySet()) {
	    	  System.out.println("Key:"+me.getKey()+", Value:"+me.getValue());
	      }
	      map.clear(); // clear elements
	      System.out.println("Maps after clear method : " + map);
	      
	}

}
