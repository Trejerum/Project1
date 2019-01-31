package exercises_tu8_1_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Person p1 = new Person();
		Address a1 = new Address();
		
		System.out.print("Introduce the id of the person: ");
		p1.setId(input.nextLine());
		System.out.print("Introduce the name of the person: ");
		p1.setName(input.nextLine());
		System.out.print("Introduce the first surname of the person: ");
		p1.setSurname1(input.nextLine());
		System.out.print("Introduce the second surname of the person: ");
		p1.setSurname2(input.nextLine());
		System.out.print("Introduce the age of the person: ");
		p1.setAge(input.nextInt());
		input.nextLine();
		System.out.print("Introduce the gender of the person: ");
		p1.setGender(input.nextLine().charAt(0));
		System.out.print("Introduce the phone of the person: ");
		p1.setPhone(input.nextLine());
		System.out.print("Introduce the email of the person: ");
		p1.setEmail(input.nextLine());
		System.out.print("Introduce the street of the person: ");
		a1.setStreet(input.nextLine());
		System.out.print("Introduce the number of the person: ");
		a1.setNumber(input.nextInt());
		System.out.print("Introduce the floor of the person: ");
		a1.setFloor(input.nextInt());
		input.nextLine();
		System.out.print("Introduce the letter of the person: ");
		a1.setLetter(input.nextLine().charAt(0));
		System.out.print("Introduce the postcode of the person: ");
		a1.setPostcode(input.nextInt());
		input.nextLine();
		System.out.print("Introduce the city of the person: ");
		a1.setCity(input.nextLine());
		System.out.print("Introduce if the person is married or not: ");
		p1.setMarried(input.nextBoolean());
		p1.setAddress(a1);
		
		System.out.println(p1.isYoungerThanMe(p1));
		
		System.out.println(p1.toString());
		
		input.close();
		

	}

}
