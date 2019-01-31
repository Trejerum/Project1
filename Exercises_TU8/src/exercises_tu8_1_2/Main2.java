package exercises_tu8_1_2;

import java.util.Scanner;

import exercises_tu8_1_1.Address;
import exercises_tu8_1_1.Person;


public class Main2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Person[] people = new Person[2];
		
		for (int i = 0; i < people.length; i++) {
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
			input.nextLine();
			p1.setAddress(a1);
			people[i]=p1;
		}
		
		for (int i = 1; i < people.length; i++) {
			for (int j = 0; j < people.length-i; j++) {
				if(people[j].isYoungerThanMe(people[j+1])) {		//if(people[j].getAge()>people[j+1].getAge())
					Person aux=people[j];
					people[j]=people[j+1];
					people[j+1]=aux;
				}
			}
		}
		
		for (Person person : people) {
			System.out.print(person.toString());
			System.out.println();
		}
		
		input.close();

	}

}
