package exercises_tu8_2_6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String sentence;
		String word;
		int counter=0;
		
		
		System.out.print("Insert a sentence: ");
		sentence=input.nextLine();
		System.out.print("Insert a word: ");
		word=input.nextLine();
		
		String[] words=sentence.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			if(words[i].contains(word)) {
				counter++;
			}
		}
		
		System.out.println(counter + " Words");
		
		input.close();

	}

}
