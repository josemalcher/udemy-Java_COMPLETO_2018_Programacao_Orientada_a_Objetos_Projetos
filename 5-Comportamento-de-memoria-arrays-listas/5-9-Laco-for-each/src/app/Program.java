package app;

import java.util.Iterator;

public class Program {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"JOSE", "Luci", "Mariazinha"};
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		System.out.println("-----------------------");
		
		for (String obj : vect) {
			System.out.println(obj);
		}

	}

}
