package app;

import java.util.Scanner;

public class Programm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//double price = 400;
		double discount;
		
		double price = sc.nextDouble();
		if (price > 100.0) {
			discount = price * 0.1;
		}else {
			discount = 0;
		}
		System.out.println(discount);
		sc.close();
	}

}
