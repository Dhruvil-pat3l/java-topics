package collectionPack;
import java.util.*;

public class JasonClass {
		public static void main(String arg[]) {
			
		// ID:0001 Start
			LinkedHashMap<String,Object> mB11 = new LinkedHashMap<>();  
			LinkedHashMap<String,Object> mB12 = new LinkedHashMap<>();  
			LinkedHashMap<String,Object> mB13 = new LinkedHashMap<>();  
			LinkedHashMap<String,Object> mB14 = new LinkedHashMap<>();  
			
			mB11.put("id","1001");
			mB11.put("type", "Regular");
			
			mB12.put("id", "1002");
			mB12.put("type", "Chocolate");
			
			mB13.put("id","1003");
			mB13.put("type", "Blueberry");
			
			mB14.put("id", "1004");
			mB14.put("type", "Devil's Food");
			
			LinkedList<Object> lB1 = new LinkedList<>(); 
			Collections.addAll(lB1, mB11, mB12, mB13, mB14);
			
			LinkedHashMap<String,Object> mB1 = new LinkedHashMap<>();
			mB1.put("batter", lB1);
			
			LinkedHashMap<String,Object> mT1 = new LinkedHashMap<>();
			LinkedHashMap<String,Object> mT2= new LinkedHashMap<>();
			LinkedHashMap<String,Object> mT3 = new LinkedHashMap<>();
			LinkedHashMap<String,Object> mT4 = new LinkedHashMap<>();
			LinkedHashMap<String,Object> mT5 = new LinkedHashMap<>();
			LinkedHashMap<String,Object> mT6 = new LinkedHashMap<>();
			LinkedHashMap<String,Object> mT7 = new LinkedHashMap<>();
			
			mT1.put("id","5001");
			mT1.put("type", "None");
			
			mT2.put("id", "5002");
			mT2.put("type", "Glazed");
			
			mT3.put("id","5005");
			mT3.put("type", "Sugar");
			
			mT4.put("id", "5007");
			mT4.put("type", "Powdered Sugar");
			
			mT5.put("id", "5006");
			mT5.put("type", "Chocolate with Sprinkles");
			
			mT6.put("id","5003");
			mT6.put("type", "Chocolate");
			
			mT7.put("id", "5004");
			mT7.put("type", "Maple");
			
			LinkedList<Object> lT1 = new LinkedList<>();
			Collections.addAll(lT1, mT1, mT2, mT3, mT4, mT5, mT6, mT7);		
			
			LinkedHashMap<String,Object> m1 = new LinkedHashMap<>();
			m1.put("id", "0001");
			m1.put("type", "donut");
			m1.put("name", "Cake");
			m1.put("ppu", 0.55);
			m1.put("batters",mB1);
			m1.put("topping",lT1);
		// ID:0001 Close
			
		//ID:0002 Start						
			LinkedList<Object> lT2 = (LinkedList<Object>)lT1.clone();
			lT2.remove(3);
			lT2.remove(3);
			
			LinkedList<Object> lB2 = new LinkedList<>();
			lB2.add(lB1.getFirst());
			
			LinkedHashMap<String,Object> mB2 = new LinkedHashMap<>();
			mB2.put("batter",lB2);
	
			LinkedHashMap<String,Object> m2= (LinkedHashMap)m1.clone();
			m2.put("id", "0002");
			m2.put("name", "Raised");
			m2.put("batters",mB2);
			m2.put("topping",lT2);
		// ID:0002 Close
			
		//ID:0003 Start						
			LinkedList<Object> lT3 = (LinkedList)lT2.clone();
			lT3.remove(2);
			
			LinkedList<Object> lB3 = new LinkedList<>();
			Collections.addAll(lB3,lB1.getFirst(),lB1.get(1));
			
			LinkedHashMap<String,Object> mB3 = new LinkedHashMap<>();
			mB3.put("batter",lB3);
	
			LinkedHashMap<String,Object> m3= (LinkedHashMap)m1.clone();
			m3.put("id", "0003");
			m3.put("name", "Old Fashioned");
			m3.put("batters",mB3);
			m3.put("topping",lT3);
		// ID:0003 Close
			
			
		//Outer List 
			LinkedList<Object> ol =new LinkedList<>();
			Collections.addAll(ol, m1, m2, m3);
		
			System.out.println(ol);
		/*	Iterator itr =  ol.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());		
			}	*/
		

			System.out.println();

			for (int i = 0; i < ol.size(); i++) {
				LinkedHashMap<String,Object> val = (LinkedHashMap<String, Object>) ol.get(i);
				System.out.println("For id:000"+(i+1)+" ->  type:"+val.get("type")+",  name:"+val.get("name"));
			}
			
			System.out.println("Topping : "+m1.get("topping"));
		}
}