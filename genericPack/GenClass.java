package genericPack;

class MyGen<T>{  
	T obj;  
	
	void add(T obj){
		this.obj=obj;
	}  
	T get(){
		return obj;
	}  
}  
public class GenClass {
	
	 public static <E> void printArray(E[] elements) {  
	        for ( E value : elements){          
	            System.out.println(value);  
	         }    
	    }  
	public static void main(String args[]){  
		MyGen<Integer> m=new MyGen<Integer>();  
		m.add(8);  
		//m.add("Hello");//Compile time error  
		System.out.println("Passed Value from MyGen Class : "+m.get()); 
		
		 Integer[] intArray = { 10, 20, 30, 40, 50 };  
		 System.out.println("\nPrinting Integer Array");  
	     printArray(intArray);     
	}
}
	