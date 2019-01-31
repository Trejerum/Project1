package exercises_tu8_2_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence;
		
		System.out.println("Inset a sentence: ");
		sentence=input.nextLine();
		sentence=sentence.replace(" ", ""); //Or replaceAll()
		System.out.println(sentence);
		
		input.close();
	}

}
