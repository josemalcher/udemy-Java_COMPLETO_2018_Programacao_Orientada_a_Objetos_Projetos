package ex.test;

import ex1.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("name");
        employee.name = sc.nextLine();

        System.out.println("Gross salary");
        employee.grossSalary = sc.nextDouble();

        System.out.println("Tax");
        employee.tax = sc.nextDouble();

        System.out.println();

        System.out.println("Employee: " + employee);
        System.out.println();

        System.out.println("Which percentage to increase salary?");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + employee);

        sc.close();
    }
}
