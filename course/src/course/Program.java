package course;

import java.util.Locale;
import java.util.Scanner;

import entities.ArrayProduct;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayProduct[] vect = new ArrayProduct[n];
		
		for(int i = 0 ; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ArrayProduct(name, price);
		}
		
		double sum = 0.0;
		for(int i = 0 ; i< vect.length ; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("Average Price: %.2f%n", avg);
		
		sc.close();
	}
}
