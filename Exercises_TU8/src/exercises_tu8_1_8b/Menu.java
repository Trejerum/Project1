package exercises_tu8_1_8b;

import java.util.Scanner;
import java.util.ArrayList;

public class Menu {

	Scanner input = new Scanner(System.in);

	public void display() {
		System.out.println("1. Add new employee");
		System.out.println("2. Modify the base salary of all employees");
		System.out.println("3. List all employees data");
		System.out.println("4. Get the salary of a given employee");
		System.out.println("5. List the data of the employee who has the highest salary");
		System.out.println("6. Exit");
	}
	
	public void insertEmployee(ArrayList<Employee> emps) {
		System.out.println("Introduce the data of the new employee: ");
		Employee emp = new Employee();
		emp.askForData();
		emps.add(emp);
	}

	public void listAllEmployees(ArrayList<Employee> emps) {
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

	public void displaySalaryEmp(ArrayList<Employee> emps) {
		String checkName;
		double finalSalary = 0;
		boolean found = false;
		System.out.print("Which employees salary you do you want to get: ");
		input.nextLine();
		checkName = input.nextLine();
		for (int i = 0; i < emps.size(); i++) {
			if (checkName.equalsIgnoreCase(emps.get(i).getName())) {
				finalSalary = emps.get(i).getFinalSalary();
				found = true;
				break;
			}
		}
		if (found == true) {
			System.out.println("The salary is " + finalSalary);
		} else {
			System.out.println("Sorry, we couldnt find the employee");
		}

	}

	public void modifyBaseSalary() {
		System.out.print("Introduce the new base salary: ");
		Employee.setBaseSalary(input.nextDouble());
	}

	public void displayHighest(ArrayList<Employee> emps) {
		System.out.println();
		double higuest = 0;
		for (int i = 0; i < emps.size(); i++) {
			if (higuest < emps.get(i).getFinalSalary()) {
				higuest = emps.get(i).getFinalSalary();
			}
		}
		for (int i = 0; i < emps.size(); i++) {
			if (higuest == emps.get(i).getFinalSalary()) {
				emps.get(i).display();
			}
		}

	}

}
