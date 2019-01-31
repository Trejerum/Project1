package exercises_tu8_1_8b;

import java.util.ArrayList;
import java.util.Scanner;

public class MainB {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Menu menu = new Menu();
		ArrayList<Employee> emps = new ArrayList<Employee>();

		int opt = 0;
		do {
			System.out.println();
			menu.display();
			System.out.print("Choose an option: ");
			opt = menu.getOption();
			switch (opt) {
			case 1:
				menu.insertEmployee(emps);
				break;
			case 2:
				menu.modifyBaseSalary();
				break;
			case 3:
				menu.listAllEmployees(emps);
				break;
			case 4:
				menu.displaySalaryEmp(emps);
				break;
			case 5:
				menu.displayHighest(emps);
				break;
			}
		} while (opt != 6);

		input.close();

	}

}
