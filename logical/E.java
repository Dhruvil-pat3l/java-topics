package logical;
import java.util.*;

public class E {

	public static void main(String[] args) {
		
		Map<String, List> map = new HashMap<>();
		
		List mar = new LinkedList();
		mar.add("IronMan");
		mar.add("Avenger");
		mar.add("Thor");
		
		List ys = new LinkedList();
		ys.add("Movie1");
		ys.add("Movie2");
		
		map.put("Marvel", mar);
		map.put("YashRaj", ys);
		
		List lc = map.get("Marvel");
		System.out.println("Movies of Marvel : "+ lc);
		
		System.out.println("SecondLast : "+ ((LinkedList)lc).get(1) ); 
		
		 Iterator<Map.Entry<String,List>> itr = map.entrySet().iterator();
		 while(itr.hasNext()) {
			
			 System.out.println(itr.next());
		 }
		 
		 for (Map.Entry<String,List> ent : map.entrySet()) {
			 System.out.println(ent.getKey()+":"+ent.getValue());
		 }
		 
		 
		
		
	}

}
