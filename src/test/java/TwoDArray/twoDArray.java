package TwoDArray;

import java.util.Scanner;

public class twoDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter number array: ");

		int [][] number = new int [3][4];

		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 4; col++) {
				number [row][col] = sc.nextInt();
			}
			System.out.print(" ");
		}

		System.out.println("number= ");
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 4; col++) {
				System.out.print(" " + number[row][col]);
			}

			System.out.println();
		}

	}

}