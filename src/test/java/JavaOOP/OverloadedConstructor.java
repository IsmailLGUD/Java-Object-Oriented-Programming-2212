package JavaOOP;

class Tree{
	int number;
	String color, leafcolor;
	String name;
	
	Tree(){
		//default constructor
		name= "mango";
	}
	
	void emit() {
		
	}
	
	Tree( String n, int number){
		//Overloaded constructor means constructor with argument must have a default constructor even it is empty
		this.number = number;
		name = n;
	}
	
	
	
}

public class OverloadedConstructor {

	public static void main(String[] args) {
		Tree t1= new Tree("Banana", 5);
		
		System.out.println(t1.color);
		System.out.println(t1.number);
		System.out.println(t1.name);



		

	}

}
