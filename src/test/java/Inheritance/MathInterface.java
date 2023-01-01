package Inheritance;

interface iMath {
	int add(int x, int y);

	int substract(int x, int y);
}

class calculator implements iMath {
	public calculator() {

	}

	public int add(int x, int y) {
		// System.out.println("x+y = "+ x+y);
		return x + y;
	}

	public int substract(int x, int y) {
		return x - y;
	}

	/*
	 * public abstract int multiply(int x, int y); public abstract int divide(int x,
	 * int y);
	 */

}

public class MathInterface {

	public static void main(String[] args) {
		iMath c1 = new calculator();
		int z = c1.add(50, 5);
		System.out.println(z);
	}

}
