package primitive_type_casting;

public class TypeCasting {

	public static void main(String[] args) {
		
		//widening
		int int1 = 10;
	    double double1 = int1;
	    System.out.println(int1);     
	    System.out.println(double1+"\n");
	     
	    //narrowing
	    double double2 = 10.12;
	    int int2 = (int) double2;
	    System.out.println(double2);   
	    System.out.println(int2); 

	}

}
