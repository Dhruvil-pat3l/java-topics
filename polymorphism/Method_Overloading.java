package polymorphism;
class Adder{  
	static int add(int a,int b){
		return (a+b);
		}  
	static void add(int a,int b,int c){
		System.out.println(a+b+c);
		}  
}  
class Method_Overloading{  
	public static void main(String[] args){  
	System.out.println(Adder.add(10,12));  
	Adder.add(10,12,14);  
}}  
