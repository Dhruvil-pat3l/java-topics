package inheritanc;


interface Interface_demo{  
void msg();  
}  
class Interfac implements Interface_demo{  
	public void msg(){
	System.out.println("Interface Method called");
	}  
  
	public static void main(String args[]){  
	Interfac inf = new Interfac();  
	inf.msg();  
	}  
} 