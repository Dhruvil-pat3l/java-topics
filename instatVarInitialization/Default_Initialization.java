package instatVarInitialization;

class Default_var {
    int number;         //  0
    float flt;          //  0.0
    boolean success;    //  false
 
    String name;        //  null
    Object obj;         //  null
 
    public void print() {
        System.out.println("number = " + number);
        System.out.println("ratio = " + flt);
        System.out.println("success = " + success);
        System.out.println("name = " + name);
        System.out.println("obj = " + obj);
    }
}
class Default_Initialization{
    public static void main(String[] args) {
    	Default_var dv = new Default_var();
        dv.print();
    }
 
}
