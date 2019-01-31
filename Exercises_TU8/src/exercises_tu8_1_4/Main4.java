package exercises_tu8_1_4;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean isOlder=false;
		
		Parrot parrot1=new Parrot();
		parrot1.setAge(3);
		parrot1.setColour("Green");
		parrot1.setRegion('s');
		parrot1.setSex('F');
		Parrot parrot2=new Parrot();
		parrot2.setAge(3);
		parrot2.setColour("black");
		parrot2.setRegion('e');
		parrot2.setSex('m');
		Parrot parrot3=new Parrot('M',5,'n',"red");
		
		parrot1.WhereAreYouFrom();
		parrot2.WhereAreYouFrom();
		parrot3.WhereAreYouFrom();
		
		System.out.println();
		
		parrot1.WhoAmI();
		parrot2.WhoAmI();
		parrot3.WhoAmI();
		
		System.out.println();
		
		parrot1.talk();
		parrot2.talk("Hello, im a parrot");
		parrot3.talk(3);
		
		System.out.println();
		
		isOlder=parrot1.isOlderThan(parrot2);
		if(isOlder) {
			System.out.println("Is older");
		}
		else {
			System.out.println("Is younger");
		}
		
		input.close();
		

	}

}
