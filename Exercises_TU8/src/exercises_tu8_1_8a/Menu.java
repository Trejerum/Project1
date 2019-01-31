package exercises_tu8_1_8a;

import java.util.Scanner;

public class Menu {

	Scanner input = new Scanner(System.in);

	public void display() {
		System.out.println("1. Modify the base salary of all employees");
		System.out.println("2. List all employees data");
		System.out.println("3. Get the salary of a given employee");
		System.out.println("4. List the data of the employee who has the highest salary");
		System.out.println("5. Exit");
	}

	public void listAllEmployees(Employee[] emps) {
		for (Employee employee : emps) {
			System.out.println();
			employee.display();
		}
	}

	public int getOption() {
		int opt = 0;
		opt = input.nextInt();
		return opt;
	}

	public void displaySalaryEmp(Employee[] emps) {
		String checkName;
		double finalSalary = 0;
		boolean found = false;
		System.out.print("Which employees salary you do you want to get: ");
		input.nextLine();
		checkName = input.nextLine();
		for (int i = 0; i < emps.length; i++) {
			if (checkName.equalsIgnoreCase(emps[i].getName())) {
				finalSalary = emps[i].getFinalSalary();
				found = true;
				break;
			}
		}
		if (found == true) {
			System.out.println(finalSalary);
		} else {
			System.out.println("Sorry, we couldnt find the employee");
		}

	}

	public void modifyBaseSalary() {
		System.out.print("Introduce the new base salary: ");
		Employee.setBaseSalary(input.nextDouble());
	}

	public void displayHighest(Employee[] emps) {
		double higuest = 0;
		for (int i = 0; i < emps.length; i++) {
			if (higuest < emps[i].getFinalSalary()) {
				higuest = emps[i].getFinalSalary();
			}
		}
		for (int i = 0; i < emps.length; i++) {
			if (higuest == emps[i].getFinalSalary()) {
				emps[i].display();
			}
		}

	}

}
