package exercises_tu8_1_8a;

import java.util.Scanner;

public class MainA {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int empsNum;
		Menu menu = new Menu();

		System.out.print("Enter the number of employees: ");
		empsNum = input.nextInt();

		Employee[] emps = new Employee[empsNum];

		for (int i = 0; i < emps.length; i++) {
			emps[i] = new Employee();
			emps[i].askForData();
		}

		int opt = 0;
		do {
			System.out.println();
			menu.display();
			System.out.print("Choose an option: ");
			opt = menu.getOption();
			switch (opt) {
			case 1:
				menu.modifyBaseSalary();
				break;
			case 2:
				menu.listAllEmployees(emps);
				break;
			case 3:
				menu.displaySalaryEmp(emps);
				break;
			case 4:
				menu.displayHighest(emps);
				break;
			}
		} while (opt != 5);

		input.close();

	}

}
