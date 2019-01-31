package exercises_tu8_1_8a;

import java.util.Scanner;

public class Employee {

	//Attributes
	public static final String COMPANY_NAME="Electrica Erandio S.A";
	private String name;
	private int age;
	private double salaryIncrease;
	private static double baseSalary=1000;
	
	private Scanner input = new Scanner(System.in);
	
	//Constructors
	public Employee() {

	}
	public Employee(String name, int age, double salaryIncrease) {

		this.name = name;
		this.age = age;
		this.salaryIncrease = salaryIncrease;
	}
	
	//Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalaryIncrease() {
		return salaryIncrease;
	}
	public void setSalaryIncrease(double salaryIncrease) {
		this.salaryIncrease = salaryIncrease;
	}
	public static double getBaseSalary() {
		return baseSalary;
	}
	public static void setBaseSalary(double baseSalary) {
		Employee.baseSalary = baseSalary;
	}
	
	//Other functions
	public double getFinalSalary() {
		double totalSalary=0;
		totalSalary=baseSalary*salaryIncrease;
		return totalSalary;
	}
	
	public void display() {
		System.out.println("Company: " + COMPANY_NAME);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + this.getFinalSalary());
	}
	
	public void askForData() {
		System.out.print("Enter name: ");
		name=input.nextLine();
		System.out.print("Enter age: ");
		age=input.nextInt();
		System.out.print("Enter salary increase %: ");
		input.nextLine();
		salaryIncrease=input.nextDouble();		
	}
	
	
	
}
