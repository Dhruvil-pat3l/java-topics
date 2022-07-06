package collectionPack;

import java.util.LinkedList;

public class LinkListExamples {

	public static void main(String[] args) {
		 String str = "okkiammddd";
	     
	     LinkedList<Character> list = new LinkedList<>();
	     
	     for(int i=0; i<str.length();i++) {
	    	 list.add(str.charAt(i));
	     }
	     
	     list.add(1,'j');
	    
	     
	     for(int i=0; i<list.size();i++){
	    	 int temp=1;
	    	 for(int j = i+1;j<list.size();j++) {
	    		 if( (list.get(i)==list.get(j)) && list.get(j)!=null) {
	    			 temp++;
	    			 list.set(j,null);
	    		 }
	    	 }
	    	 if(temp>1) {
	    		 System.out.println(list.get(i)+" Occurred "+temp+" times.");
	    	 }
	     }
	}

}
