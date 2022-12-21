package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex {

	public static void main(String[] args) {
		ArrayList<String> Cars = new ArrayList();

		Cars.add("Rolls Royce");
		Cars.add("BMW");
		Cars.add("Bugatee");
		System.out.println("Size of Cars: " + Cars.size());
		System.out.println("Cars= " + Cars);

		Iterator itr = Cars.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();
		for (String x : Cars) {
			System.out.print(x+ " ");
		}
		
		
		System.out.println("\nArrayList is Empty: "+ Cars.isEmpty() );
		System.out.println("Contain Bugatee: " +Cars.contains("Bugatee"));
		System.out.println("Contain Lamborgini: " +Cars.contains("Lamborgini"));
		System.out.println("Index of BMW: " +Cars.indexOf("BMW"));


		Cars.remove(1);
		System.out.println("Size of Cars: " + Cars.size());
		System.out.println("Cars= " + Cars);

		Cars.removeAll(Cars);
		System.out.println("Size of Cars: " + Cars.size());
		System.out.println("Cars= " + Cars);
		
		System.out.println("\nArrayList is Empty: "+ Cars.isEmpty() );


	}

}