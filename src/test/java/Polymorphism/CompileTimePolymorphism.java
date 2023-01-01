package Polymorphism;
class shape{
	double area() {
	return 0;
	}
}

class rectengle extends shape{
	
	double length, wide;
	
	rectengle( double length, double wide){
		this.length = length;
		this.wide = wide;
	}
	
	
	double area(){
		return length*wide;
	}
}

class triangle extends shape{
	double height, base;
	
	triangle(double height, double base){
		this.base = base;
		this.height = height;
	}
	
	double area() {
		return 0.5* height * base;
	}
}

public class CompileTimePolymorphism {

	public static void main(String[] args) {
	
		shape a1 = new rectengle(4, 6);
		a1.area();
		
		shape t1 = new triangle(5 ,4);
		t1.area();
	}

}
