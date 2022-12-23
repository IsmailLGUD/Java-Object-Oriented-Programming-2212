package StaticModifier;

class staticBlock {
	static int id;
	static String Name;

	static {
		// this is the static block;
		id = 101;
		Name = "Ismail";
	}

	static void display() {
		System.out.println("ID : " + id + ", Name: " + Name);
	}
}

public class Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticBlock.display();

	}

}
