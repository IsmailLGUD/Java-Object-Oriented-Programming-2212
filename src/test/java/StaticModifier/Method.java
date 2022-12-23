package StaticModifier;

class StaticMethod {
	void display() {
		System.out.println("Its not a static method!");
	}

	static void display1() {
		System.out.println("Its a static method!");
	}
}

public class Method {

	public static void main(String[] args) {
		// static variable and method can be accessed in the main method without
		// creating any object just by related class name and . operator

		StaticMethod.display1();
	}

}
