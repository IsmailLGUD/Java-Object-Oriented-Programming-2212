package StaticModifier;

class students {
	String name;
	int ID;
	int RegNo;
	static int count = 0;

	students() {
		count++;
	}

	void TotaStudent() {
		System.out.println("Total Student: " + count);
	}
}

public class CountObject {

	public static void main(String[] args) {
		// static variable and method can be accessed in the main method without
		// creating any object just by related class name and . operator

		students s1 = new students();
		s1.TotaStudent();
		students s2 = new students();
		s2.TotaStudent();
		students s3 = new students();
		s3.TotaStudent();
	}

}
