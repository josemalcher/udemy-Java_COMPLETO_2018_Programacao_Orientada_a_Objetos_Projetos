package app;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for(int i = 0 ; i < n ; i++) {
			vet[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i = 0 ; i < n ; i++) {
			sum += vet[i];
		}
		
		double avg = sum /n ;
		
		System.out.printf("Average height: %.2f%n", avg);
		
		sc.close();

	}

}
