package exercises_tu8_2_7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String word;
		String palindrome="";
		boolean isPalindrome=false;
		
		System.out.print("Insert a word: ");
		word=input.nextLine();
		
		for (int i = word.length(); i > 0; i--) {
			palindrome=palindrome+word.charAt(i-1);
		}
		if(palindrome.equalsIgnoreCase(word)) {
			isPalindrome=true;
			System.out.println(palindrome + " is a palindrome");
		}
		else {
			System.out.println("Its not a palindrome");
		}
		input.close();

	}

}
