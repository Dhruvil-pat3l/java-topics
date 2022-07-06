package collectionPack;
import java.util.Iterator;
import java.util.TreeSet;

public class Hashmapex {
	public static void main(String[] args) {
		
		String str = "dhruvil";
		TreeSet<String> map = new TreeSet<>();
		StringBuffer sb =new StringBuffer("");
		for (int i=0 ; i<str.length();i++) {
			  Character ch = (str.charAt(i));
		        map.add(ch.toString());
		}
		Iterator<String> itr = map.iterator();
		while(itr.hasNext()) {
			sb.append(itr.next());	
		}
		System.out.println(sb.toString());
	}
}
