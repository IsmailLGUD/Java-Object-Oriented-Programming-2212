package TwoDArray;

import java.util.Scanner;

public class SumDiagUppLow {

	public static void main(String[] args) {

		int[][] A = new int[4][5];
		int SumOfDiagonal = 0;
		int SumOfUpper = 0;
		int SumOfLower = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter A Matrix: ");
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 5; col++) {
				System.out.printf("A[%d][%d] = ", row, col);
				A[row][col] = sc.nextInt();
			}
		}

		System.out.println("A = ");
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 5; col++) {
				System.out.print("\t" + A[row][col]);

			}
			System.out.println();
		}

		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 5; col++) {
				if (row == col) {
					SumOfDiagonal = SumOfDiagonal + A[row][col];
				}
				if (row < col) {
					SumOfUpper = SumOfUpper + A[row][col];
				}
				if (row < col) {
					SumOfLower = SumOfLower + A[row][col];
				}
			}

		}

		System.out.println("Sum of Diangonal Elements= " + SumOfDiagonal);
		System.out.println("Sum of Upper Elements= " + SumOfUpper);
		System.out.println("Sum of Lower Elements= " + SumOfLower);

	}

}
