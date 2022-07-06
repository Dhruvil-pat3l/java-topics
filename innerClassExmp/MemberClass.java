package innerClassExmp;
	  
class ClassOuter{ 
	// Declare instance variables and static variable. 
    int p = 10; 
    protected int q = 20; 
    private int r = 30; 
    static int s = 40; 
	  class ClassInner
	  { 
		  public void display(){
		        System.out.println("Value of p: " +p); 
		        System.out.println("Value of q: " +q); 
		        System.out.println("Value of r: " +r); 
		        System.out.println("Value of s: " +s); 
		        }  
	   } 
	// Area of outer class. 
	    void m2(){ 
	        System.out.println("Outer class instance method"); 
	     } 
}
public class MemberClass { 
	public static void main(String[] args) { 
	   ClassOuter oc = new ClassOuter();
	    ClassOuter.ClassInner ic = oc.new ClassInner(); 
	    ic.display();  
   } 
}