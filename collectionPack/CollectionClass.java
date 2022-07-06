package collectionPack;
import java.util.*;

public class CollectionClass {
	public static void main(String arg[]) {
		
		List<Integer> lo = new ArrayList<>();
		
		lo.add(7);
		lo.add(5);
		lo.add(1);
		lo.add(2);
		
		Collections.sort(lo);
		
		System.out.println("Sorted : " + lo);
		System.out.println("\nMinimum : " + Collections.min(lo));
		System.out.println("\nMaximum : " + Collections.max(lo));
		
		Collections.addAll(lo,24,6);
		System.out.println("\nAfter addAll : " + lo);
		
		Collections.reverse(lo);
		System.out.println("\nReversed : " + lo);
		
		Collection<Integer> cl=Collections.checkedCollection(lo,Integer.class);
		System.out.println("\nType-safe : "+cl);

		List<Integer> lc = new LinkedList<>();
		lc.add(7);
		lc.add(55);
		lc.add(11);
		lc.add(22);
		lc.add(51);
		lc.add(32);
		Collections.copy(lc,lo);
		System.out.println("\nCopied  : "+lc);
		
		Collections.fill(lc, 9);
		System.out.println("\nCopied after fill : "+lc);
		
		Collections.replaceAll(lc, 9, 900);
		System.out.println("\nAfter replaceAll : "+lc);
		
		System.out.println("\nFrequency of '9' is : "+Collections.frequency(lc, 9));
	}		
	
}
