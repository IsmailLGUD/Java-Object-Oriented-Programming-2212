package JavaOOP;

class Fruits{
	int num;
	String name;
	String color;
	boolean isFruit;
	String taste = "sweet";
	
	Fruits(){
		//default constructor
		
	}
	
	Fruits(int n, String color){
		//overloaded constructor with argument
		num = n;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fruits number is " + num + " and color is " + color+ " taste = " + taste+ ".";
	}
	
}

public class ToString {

	public static void main(String[] args) {
		
		Fruits f1 = new Fruits(6, "orange");
		System.out.println(f1);
		System.out.println(f1.color);
		//System.out.println(taste);


	}

}
