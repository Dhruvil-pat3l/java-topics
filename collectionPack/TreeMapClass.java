package collectionPack;
import java.util.TreeMap;
import java.util.Map;

public class TreeMapClass {
    public static void main(String[] args) {
    	
        // Creating TreeMap of numbers
        TreeMap<String, Integer> numbers = new TreeMap<>();
        System.out.println("size : " + numbers);

        // Using put()
        numbers.put("Two", 2);
        numbers.put("Four", 4);
        numbers.put("Eight", 8);

        // Using putIfAbsent()
        numbers.putIfAbsent("Six", 6);
        System.out.println("TreeMap of numbers: " + numbers);

        //Creating TreeMap of numbers
        TreeMap<String, Integer> numbers2 = new TreeMap<>();
        numbers2.put("One", 1);

        // Using putAll()
        numbers.putAll(numbers2);
        System.out.println("\nTreeMap of All numbers: " + numbers);
        
        // Using entrySet()
        System.out.println("\nKey/Value mappings: " + numbers.entrySet());

        // Using keySet()
        System.out.println("\nKeys: " + numbers.keySet());

        // Using values()
        System.out.println("\nValues: " + numbers.values());     
        
        // Using get()
        int value1 = numbers.get("One");
        System.out.println("\nUsing get(): " + value1);

        // Using getOrDefault()
        int value2 = numbers.getOrDefault("One", 5);
        System.out.println("\nUsing getOrDefault(): " + value2);
        
        // Using higher()
        System.out.println("\nUsing higherKey(): " + numbers.higherKey("Four"));
        System.out.println("Using higherEntry(): " + numbers.higherEntry("Four"));

        // Using lower()
        System.out.println("\nUsing lowerKey(): " + numbers.lowerKey("Four"));
        System.out.println("Using lowerEntry(): " + numbers.lowerEntry("Four"));

        // Using ceiling()
        System.out.println("\nUsing ceilingKey(): " + numbers.ceilingKey("Four"));
        System.out.println("Using ceilingEntry(): " + numbers.ceilingEntry("Four"));

        // Using floor()
        System.out.println("\nUsing floorKey(): " + numbers.floorKey("Four"));
        System.out.println("Using floorEntry(): " + numbers.floorEntry("Four"));
        
        // remove method with single parameter
        int value = numbers.remove("Two");
        System.out.println("\nRemoved value: " + value);

        // remove method with two parameters
        boolean result = numbers.remove("One", 1);
        System.out.println("\nIs the entry removed : " + result);

        System.out.println("\nUpdated TreeMap: " + numbers);
        
        for(Map.Entry var:numbers.entrySet()) {
        	System.out.println(var.getKey()+"="+var.getValue());
        }               
    }
}