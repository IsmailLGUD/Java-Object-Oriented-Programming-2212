package JavaOOP;
class Dog{
	int leg, ear;
	String color;
	boolean isPet;
	
	Dog(){
		
		//default constructor
		
	}
	
	public Dog(int l, String color) {
		this.color = color;
		leg = l;
		//overloaded constructor
		
		
	}
	
	public String toString() {
		return "this dog has" + leg + " legs";
	}
}
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
