import entities.Product;
import entities.Produduct;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVector {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Produduct[] vect = new Produduct[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Produduct(name, price);
        }
        double sum = 0.0;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }
        System.out.printf("Total %.2f%n", sum);
        double med = sum / vect.length;
        System.out.printf("Preço Médio %.2f%n", med);

        sc.close();
    }
}
