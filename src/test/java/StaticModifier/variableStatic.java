package StaticModifier;

class student {
	String name;
	int ID;
	static int Batch = 04;

	student(String n, int id) {
		name = n;
		ID = id;
	}

	void display() {
		System.out.println("Name: " + name + ", ID: " + ID + ", Batch No. " + Batch);
	}

}

public class variableStatic {

	public static void main(String[] args) {
		// static variable and method can be accessed in the main method without
		// creating any object just by related class name and . operator

		student s1 = new student("Ismail", 20123811);
		s1.display();
		System.out.println("Batch No. from Static Modifier: " + student.Batch);
	}

}
