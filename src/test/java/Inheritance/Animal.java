package Inheritance;

class Mammal extends Object {

	public float weight;
	public int IQ;
	private float temp;

	public void setTemp(float t) {
		temp = t;
	}

	public String getTemp() {
		return "The mammal temperature is = " + temp;
	}

	private String furColor;

	public void Eat() {
		System.out.println("Mammal:: Eat() Method");
	}

	public void Drink() {
		System.out.println("Mammal:: Drink() Method");
	}

	public void Sleep() {
		System.out.println("Mammal:: Sleep() Method");
	}

	public void GiveBirth() {
		System.out.println("Mammal:: GiveBirth() Method");
	}

}

class Dog extends Mammal {
	private int age;
	public int legs;
	public boolean isWild;
	public String Name;

	public void Bark() {
		System.out.println("Dog Barks!!!");
	}

}

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mammal m1 = new Mammal();
		m1.Eat();
		m1.IQ = 20;
		System.out.println("m1.IQ: " + m1.IQ);
		m1.setTemp(13.4f);
		System.out.println("m1.getTemp : " + m1.getTemp());

		Dog d1 = new Dog();
		d1.IQ = 40;
		System.out.println("d1.IQ: " + d1.IQ);

	}

}
