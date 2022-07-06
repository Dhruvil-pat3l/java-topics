package staticKeyword;

class Stc{
	static int i=0;
	int j=0;
	
	Stc(){
		i++;
		j++;
		System.out.println("I = "+i +",  J = "+j);
	}
	static void valueChange() {
		i = 10;
		System.out.println("\nValueChange Method is called");
	}
	
	static {
		System.out.println("Static Block is invoked\n");
	}
	
}
public class Stc_Kw {

	public static void main(String[] args) {
		Stc obj1 = new Stc();
		Stc obj2 = new Stc();
		Stc obj3 = new Stc();
		Stc.valueChange();
		Stc obj4 = new Stc();
	}

}
