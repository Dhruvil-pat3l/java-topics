package dfrnt_Var;

public class Differnt_Variable {
	 public int inst; 
	 public static int stk = 12;
	 Differnt_Variable() { 
	 
	        this.inst = 11; 
	 }
	public static void main(String[] args)
    {
		Differnt_Variable obj = new Differnt_Variable();
		int loc = 10; 
        System.out.println("Local Variable: " + loc);
        System.out.println("Instance Variable: " + obj.inst);
        System.out.println("Static Variable: " + Differnt_Variable.stk);
    }
}