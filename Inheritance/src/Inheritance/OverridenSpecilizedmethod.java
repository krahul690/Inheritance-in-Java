package Inheritance;

class Plane {
	public void takeoff() {
		System.out.println("plane is take of");
	}

	public void fly() {
		System.out.println("flying");
	}

	public void landing() {
		System.out.println("landing");
	}
}

class Cargoplane extends Plane {

	// overriding method
	public void fly() {
		System.out.println("Cargoplanr flying in lower height");
	}

	// Specialized method
	public void carryGoods() {
		System.out.println("carry cargo");
	}

}

class PassengerPlane extends Plane {

	// Overridden
	public void fly() {
		System.out.println("PassengerPlane flying in upper height");
	}

	// Specialized method
	public void carryPassengers() {
		System.out.println("carry Passenger");
	}
}

public class OverridenSpecilizedmethod {

	public static void main(String[] args) {
		Cargoplane cp =new Cargoplane();
		PassengerPlane pp = new PassengerPlane();
		cp.takeoff();
		pp.takeoff();
		pp.fly();
		cp.fly(); //Inherited method-no change in child
	}

}
