package OneDArray;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		
		int [] number = {4,8,2,3,1,0};
		
		Arrays.sort(number);
		System.out.print("Ascending: ");
		for(int i =0; i<6; i++) {
			System.out.print(" "+number[i]);
		}
		
		System.out.print("\nDescending: ");
		for(int i=5; i>=0; i--) {
			System.out.print(" "+number[i]);
		}
		
		
		String [] name = {"Ismail", "Rasel", "Al-Islam", "Hasinur"};
		Arrays.sort(name);
		
		System.out.print("\nAscending name: ");
		for(int i=0; i<4; i++) {
			System.out.print(" "+name[i]);
		}
		
		System.out.print("\nDescending name: ");
		for(int i=4; i>=0; i--) {
			System.out.print(" "+name[i]);
		}
		

  }

}
