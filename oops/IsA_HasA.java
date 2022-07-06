package oops;
class Car {
	private String color;
	private int maxSpeed; 
	void carInfo(){
		System.out.println("Car Color: "+color + ", Maximum Speed: " + maxSpeed+ "  (using Is-A)");
	}
	void setColor(String color)  {
		this.color = color;
	}
	void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
class Maruti extends Car{
	void MarutiStartDemo(){
		Engine MarutiEngine = new Engine();
		MarutiEngine.start();
		}
	}
 class Engine {
	void start(){
		System.out.println("Engine Started  (using Has-A)");
	}
}
public class IsA_HasA {
	public static void main(String[] args) {		
		Maruti myMaruti = new Maruti();
		myMaruti.setColor("RED");
		myMaruti.setMaxSpeed(180);
		myMaruti.carInfo();
		myMaruti.MarutiStartDemo();
	}
}