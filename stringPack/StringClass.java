package stringPack;
public class StringClass{    
	public static void main(String args[]){    
		
		String str1="Hello";   
		char ch[]={'w','o','r','l','d'};   
		
		String str2=new String(ch);
		String str3=new String("Demo String");
		
		System.out.println(str1);    
		System.out.println(str2);    
		System.out.println(str3);    
		
		String s1= "Java";
		String s2 = new String("Java");
		
		String s3= "Language";
		String s4 = new String("Language").intern();
		
		String s5 = s1;
		String s6 = s2.intern();
		
		System.out.println("\n	"+(s1==s2) +",   s1 & s2 are not equal");
		System.out.println((s3==s4)+",    s3 & s4 are equal\n");
		
		System.out.println((s5==s6)+",    s5 & 6 are equal");
	
		
	}
}    