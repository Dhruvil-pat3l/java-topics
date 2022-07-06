package polymorphism;

	class Parent {
		void m1(){
			System.out.println("From parent m1()");
		}
	}

	class Child extends Parent {
		void m1(){
			System.out.println("From child m1()");
		}
	}

	class Method_Overriding {
		public static void main(String[] args)
		{
			Parent obj1 = new Parent();
			obj1.m1();
			Parent obj2 = new Child();
			obj2.m1();
		}
	}
