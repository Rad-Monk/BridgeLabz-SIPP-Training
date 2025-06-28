package classandobject.level1.employee;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		// Take a user input
		System.out.print("Enter Employee name: ");
		String name = input.nextLine();
		System.out.print("Enter a Salary: ");
		int salary = input.nextInt();

		// create a Employee object
		Employee employee = new Employee(salary, name);

		// Display data
		employee.display();

		// Close the Scanner
		input.close();
	}
}
