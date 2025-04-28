import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Product product = new Product();
//        System.out.println("Enter product data: "); System.out.print("Name: ");
//        product.name = sc.nextLine();
//        System.out.print("Price: ");
//        product.price = sc.nextDouble();
//        System.out.print("Quantity in stock: "); product.quantity = sc.nextInt();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.println("Product data: " + product);


        System.out.println();
        System.out.print("Enter the number of products to be added in stock: "); quantity = sc.nextInt();
        product.addProduct(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: "); quantity = sc.nextInt();
        product.removeProduct(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
