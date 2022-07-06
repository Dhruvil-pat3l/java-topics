package stringPack;

public class StringMethods {
	public static void main(String[] arg) {
		String s="Hello ", st="World", str = "full internship";  
		String Str1 = new String("dfghj");
		
		System.out.println(s.length());
		    
		System.out.println(s.charAt(3));
		
		System.out.println(s.toUpperCase());  
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.trim()); 
		  
		System.out.println(str.replace(" ","-"));
		
		System.out.println(str.replaceFirst("n","m"));
		
		System.out.println((str.substring(0,1).toUpperCase()+str.substring(1)));
	
		System.out.println(s.concat(st));
		 
		System.out.println(s.equals(st));		 
		 
		System.out.println(String.join("++",s,st));
	
		System.out.println(st.toCharArray());
		 
		System.out.println(s+st);
	}
}
