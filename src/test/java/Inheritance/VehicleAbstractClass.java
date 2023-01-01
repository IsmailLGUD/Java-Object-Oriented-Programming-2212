package Inheritance;

abstract class Vehicle extends Object {
	public String vType;
	private String vDetail;

	public void BodyType() {
		System.out.println("Vehicle:: BOdyType....");
	}

	abstract public void EngineType();// abstract class doesn't have any body
}

class Zip extends Vehicle {

	@Override
	public void EngineType() {
		System.out.println("It needs high power engine and it's an abstract method inherited from parent class");

	}

}

public class VehicleAbstractClass {

	public static void main(String[] args) {
		Vehicle v1 = new Zip();
		v1.EngineType();

	}

}
