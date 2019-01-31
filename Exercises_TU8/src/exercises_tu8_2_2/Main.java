package exercises_tu8_2_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name;
		int index=0;
		
		System.out.println("Insert name and surname: ");
		name=input.nextLine();
		index=name.indexOf(" ");
		index++;
		name.toUpperCase().charAt(0);
		name.toUpperCase().charAt(index);
		System.out.println("Hello " + name.charAt(0) + "." + name.charAt(index) + ".");
		
		input.close();

	}

}
