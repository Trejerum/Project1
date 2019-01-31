package persons;

import java.util.Scanner;

public class MainCandD {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		//C1
		//Also for D1
		//Also for H1
		
		//With D1 option we can use also the default constructor
		//PersonD p1 = new PersonD();
		//p1.setName("Pepito");
		//p1.setAge(45);
		PersonC p1 = new PersonC("Rogelio",34);
		System.out.println(p1.getName()+ " " + p1.getAge());
		
		//C2
		//Also for D2
		//Also for H2
		//With D2 option we can use also the default constructor
		PersonC[] people =new PersonC[3];
		
		for (int i = 0; i < people.length; i++) {
			//people[i] = new PersonD();
			people[i] = new PersonC("", 0);
			System.out.println("Enter person "+ (i+1) + ":");
			System.out.print("Enter name: ");
			people[i].setName(input.nextLine());
			System.out.print("Enter age: ");
			people[i].setAge(input.nextInt());
			input.nextLine();
		}
		System.out.println();
		for (PersonC personC : people) {
			System.out.println(personC.getName()+ " " + personC.getAge());
		}
		
		input.close();

	}

}
