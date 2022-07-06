package wrapper;

public class Wrapper_demo {  
	public static void main(String args[]){  
	    //Autoboxing  
		int a=10;  
		Integer intObj=new Integer(a);
		float x=10.01f;
		Float floatObj = new Float(x);
		System.out.println(+intObj+", "+floatObj);  
		
		//Unboxing
		int a1= intObj;
		float x1=floatObj;
		System.out.println("\n"+a1+", "+x1);    
		    
	}
}
