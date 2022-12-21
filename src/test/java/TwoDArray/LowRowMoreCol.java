package TwoDArray;

public class LowRowMoreCol {

	public static void main(String[] args) {
		int k = 0;
		int[][] A = new int[4][];
		A[0] = new int[1];
		A[1] = new int[2];
		A[2] = new int[3];
		A[3] = new int[4];

		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < row + 1; col++) {
				A[row][col] = k;
				k++;
			}
		}

		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < row + 1; col++) {
				System.out.print(" " + A[row][col]);
			}
			System.out.println();
		}
	}

}