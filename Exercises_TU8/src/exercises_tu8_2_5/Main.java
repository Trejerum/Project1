package exercises_tu8_2_5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String sentence;
		int counter=0;
		
		System.out.print("Insert a sentence: ");
		sentence=input.nextLine();
		for (int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i)==' ') {
				counter++;
			}
		}
		if(counter>0) {
			counter++;
		}
		System.out.println(counter + " Words");
		
		
		
		input.close();

	}

}
