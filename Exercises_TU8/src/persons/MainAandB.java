package persons;

import java.util.Scanner;

public class MainAandB {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		//A1
		//Also for B1
		PersonA p1 = new PersonA();
		p1.setName("Pepito");
		p1.setAge(45);
		System.out.println(p1.getName()+" "+p1.getAge());
		
		//A2
		//Also for B2
		PersonA[] people = new PersonA[3];
		for (int i = 0; i < people.length; i++) {
			
			//PersonA p =new PersonA();		<--	This is another option
			people[i]=new PersonA();
			System.out.println("Enter person "+ (i+1) + ":");
			System.out.print("Enter name: ");
			//p.setName(input.nextLine());
			people[i].setName(input.nextLine());
			System.out.print("Enter age: ");
			//p.setAge(input.nextInt());
			people[i].setAge(input.nextInt());
			//people[i]=p;
			input.nextLine();
		}
		for (PersonA personA : people) {
			System.out.println(personA.getName()+ " " + personA.getAge());
		}
		
		input.close();

	}

}
