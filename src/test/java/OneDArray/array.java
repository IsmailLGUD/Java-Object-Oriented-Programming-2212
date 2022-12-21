package OneDArray;

public class array {

	public static void main(String[] args) {
		double [] Ismail = new double[3];
		
		Ismail [0] = 3.69;
		Ismail [1] = 3.81;
		Ismail [2] = 3.88;
		
		double CGPA = (3.76 + Ismail[2])/2;
		
		System.out.println(Ismail[2]);
		System.out.println("CGPA= " +CGPA);
		System.out.println(Ismail.length);
		
	}

}
