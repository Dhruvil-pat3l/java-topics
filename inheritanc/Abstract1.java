package inheritanc;

abstract class Ex1{  
	  abstract void msg(int a, int b);  
	}  
class Abstract1 extends Ex1{  
	void msg(int a, int b){
		System.out.println("Used Abstract method of Abstract class");
		System.out.println("Addition = "+(a+b));
	}  
	public static void main(String args[]){  
	 Ex1 obj = new Abstract1();  
	 obj.msg(1,8);  
	}  
} 

