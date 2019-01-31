package exercises_tu8_2_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String sentence=new String ();
		char letter;
		
		System.out.print("Insert a sentence: ");
		sentence=input.nextLine();
		System.out.print("Insert a char: ");
		do {
			letter=input.nextLine().charAt(0);
			if(Character.isUpperCase(letter)||Character.isDigit(letter)) {
				System.out.print("Sorry. Insert again: ");
			}
		}while(Character.isUpperCase(letter)||Character.isDigit(letter));
		sentence=sentence.replace(letter, Character.toUpperCase(letter));
		System.out.println(sentence);
		
		input.close();
	}

}
