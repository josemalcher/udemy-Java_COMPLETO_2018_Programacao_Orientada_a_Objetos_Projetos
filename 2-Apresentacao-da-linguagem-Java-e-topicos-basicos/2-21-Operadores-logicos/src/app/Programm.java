package app;

public class Programm {

	public static void main(String[] args) {
		
		boolean c1 = 2 > 3 || 4 != 5;
		boolean c2 = !(2 > 3) && 4 != 5;
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println();
		
		boolean c3 = 10 < 5;
		boolean c4 = c1 || c2 && c3;
		System.out.println(c4);

	}

}
