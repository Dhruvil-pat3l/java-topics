package collectionPack;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class LinkedHashMapClass {

	 public static void main(String[] args) {
	    	
	        // Creating TreeMap of numbers
	        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();

	        // Using put()
	        numbers.put("Two", 2);
	        numbers.put("Four", 4);

	        // Using putIfAbsent()
	        numbers.putIfAbsent("Six", 6);
	        System.out.println("LinkedHashMap of numbers: " + numbers);

	        //Creating TreeMap of numbers
	        LinkedHashMap<String, Integer> numbers2 = new LinkedHashMap<>();
	        numbers2.put("One", 1);
	        numbers2.put("Six", 6);

	        // Using putAll()
	        numbers.putAll(numbers2);
	        System.out.println("LinkedHashMap of All numbers: " + numbers);
	        
	        // Using entrySet()
	        System.out.println("Key/Value mappings: " + numbers.entrySet());

	        // Using keySet()
	        System.out.println("Keys: " + numbers.keySet());

	        // Using values()
	        System.out.println("Values: " + numbers.values());     
	        
	        // Using get()
	        int value1 = numbers.get("One");
	        System.out.println("Using get(): " + value1);

	        // Using getOrDefault()
	        int value2 = numbers.getOrDefault("One", 5);
	        System.out.println("Using getOrDefault(): " + value2);
	        
	        // remove method with single parameter
	        int value = numbers.remove("Two");
	        System.out.println("Removed value: " + value);

	        // remove method with two parameters
	        boolean result = numbers.remove("One", 1);
	        System.out.println("Is the entry removed : " + result);

	        System.out.println("Updated LinkedHashMap: " + numbers);
	        
	        Iterator<String> itr = numbers.keySet().iterator();
	        while(itr.hasNext()) {
	        	String temp = itr.next();
	        	System.out.println(temp+":"+numbers.get(temp));
	        }
	        
	    }

}
