package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> listEmployee = new ArrayList<Employee>();

		System.out.println("How many employees will be registered?");
		int employees = sc.nextInt();

		for (int i = 1; i <= employees; i++) {
			System.out.println("Emplyoee #" + i + " : ");

			System.out.print("id: ");
			int id = sc.nextInt();

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.next();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			listEmployee.add(new Employee(id, name, salary));
		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = listEmployee.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}

		System.out.println();
		System.out.println("List of employees: ");
		for (Employee obj : listEmployee) {
			System.out.println(obj);
		}

	}

}