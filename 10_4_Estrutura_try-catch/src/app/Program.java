package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
		}catch(InputMismatchException e) {
			System.out.println("Input Erro!");
		}
		System.out.println("OUTRAS EXECUÇÕES PROGRAMRA...");
		System.out.println("FIM DO PROGRAMRA");
		sc.close();
	}

}
