package ex.test;

import ex1.entities.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaEstudante {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudante estudante = new Estudante();

        estudante.name = sc.nextLine();
        estudante.grade1 = sc.nextDouble();
        estudante.grade2 = sc.nextDouble();
        estudante.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", estudante.finalGrade());

        if (estudante.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", estudante.missingPoints());
        } else {
            System.out.println("PASS");
        }

        sc.close();
    }
}
