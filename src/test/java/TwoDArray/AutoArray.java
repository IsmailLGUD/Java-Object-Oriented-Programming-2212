package TwoDArray;

public class AutoArray {

	public static void main(String[] args) {
		
		int [][] A= new int [4][5];
		int t=0;
		
		for(int row=0; row<4; row++) {
			for(int col =0; col<5; col++) {
				A[row][col]= t;
				t++;
			}
	}

		System.out.print("A = ");
		for(int row=0; row<4; row++) {
			for(int col =0; col<5; col++) {
				System.out.print("\t"+A[row][col]);
			}
			System.out.println();
	}
	}
}
