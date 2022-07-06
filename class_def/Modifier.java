package class_def;
import logical.*;
class Pri{
	private int a1=10;
	Pri(){
		System.out.println("Private variable = " +a1);	
	}
}
class Def{
	int a2=12;
	
}

public class Modifier extends Protected_variable {

	public static void main(String[] args) {
		int a3=15;
		Pri pr = new Pri();
		Def df = new Def();
		Modifier mo = new Modifier();
		mo.msg();
		
		System.out.println("default variable = " +df.a2);	
		System.out.println("public variable = " +a3);	
	}

}
