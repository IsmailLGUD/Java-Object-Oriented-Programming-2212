package PrefixPostfix;

import java.util.Scanner;

public class PrefixAndPostfix {

	public static void main(String[] args) {

		String name;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		name = sc.nextLine();

		System.out.println("Hello " + name + "!");

		int x = 0, y = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print("x = " + x++ + "\t");
			System.out.println("y = " + ++y);
			++x;
			y++;
		}

	}

}
