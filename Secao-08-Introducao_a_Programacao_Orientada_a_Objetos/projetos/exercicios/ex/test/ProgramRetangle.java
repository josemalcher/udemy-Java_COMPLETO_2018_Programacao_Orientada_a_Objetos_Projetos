package ex.test;

import ex1.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRetangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.printf("Area = %.2f%n" , rectangle.area());
        System.out.printf("Perimeter = %.2f%n" , rectangle.perimeter());
        System.out.printf("Diagonal = %.2f%n" , rectangle.diagonal());

        sc.close();
    }
}
