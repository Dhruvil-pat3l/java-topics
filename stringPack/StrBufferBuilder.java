package stringPack;

public class StrBufferBuilder {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("My ");
	//	StringBuilder sb = new StringBuilder("My ");
		
		System.out.println(sb.capacity());
		
		sb.append("Name is ");
		System.out.println(sb);
		
		sb.insert(11,"Dhruvil Patel");
		System.out.println(sb);
		
		sb.replace(11,24,"Full");
		System.out.println(sb);
		
		sb.delete(0,11);  
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		
	}

}
