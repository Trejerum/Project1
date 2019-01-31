package exercises_tu8_2_8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String paragraph;
		
		System.out.print("Insert a paragraph: ");
		paragraph=input.nextLine();
		String[] sentences=paragraph.split("\\. ");
		for (int i = 0; i < sentences.length; i++) {
			System.out.println(sentences[i]);
		}
		
		input.close();

	}

}
