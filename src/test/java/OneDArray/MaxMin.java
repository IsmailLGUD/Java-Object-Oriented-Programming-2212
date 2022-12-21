package OneDArray;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 5 numbers in the array: ");
		int sum = 0;
		int[] num = new int[4];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];

		}

		System.out.println("the sum is = " + sum);

		double avg = sum / num.length;
		System.out.println("the average is = " + avg);

		int max = num[0];

		for (int i = 1; i < num.length; i++) {

			if (max < num[i]) {
				max = num[i];
			}

		}

		System.out.println("Maximum= " + max);
	

	
	
	int min = num[0];
	for (int i = 1; i<num.length; i++ ) {
		if(min> num[i]) {
			min = num[i];
		}
	}
	
	System.out.println("Minimum is= "+ min);

	}

}
