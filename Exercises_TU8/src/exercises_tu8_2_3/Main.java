package exercises_tu8_2_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String fullName;
		int index=0;
		
		System.out.println("Insert surname, name");
		fullName=input.nextLine();
		index=fullName.indexOf(",");
		fullName.toUpperCase();
		System.out.println("Hello " + fullName.substring(index+2) + " " + fullName.substring(0, index));
		
		input.close();

	}

}
