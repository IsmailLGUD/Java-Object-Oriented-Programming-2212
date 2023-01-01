package Polymorphism;

class person {
	void displayInfo() {
		System.out.println("I am a person");
	}

}

class Teacher extends person {
	@Override
	void displayInfo() {
		System.out.println("I am a teacher");
		System.out.println("Overriding constructor");
	}
}

public class RuntimePolymorphism {

	public static void main(String[] args) {

		person p1 = new person();
		p1.displayInfo();
		
		person p2 = new Teacher();
		p2.displayInfo();

	}

}
