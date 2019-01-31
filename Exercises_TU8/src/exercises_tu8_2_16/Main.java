package exercises_tu8_2_16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Hangman hangman=new Hangman();
		char letter;
		boolean isInWord;
		boolean isRepeated;
		boolean guessed=false;
		do {
			
			System.out.println("Guess the word: ");
			hangman.displayGaps();
			System.out.print("Enter a letter: ");
			letter=input.nextLine().charAt(0);
			letter = Character.toUpperCase(letter);
			isInWord=hangman.isLetterInWordToGuess(letter);
			if (isInWord==true) {
				isRepeated=hangman.isLetterRepeated(letter);
				if(isRepeated==false) {
					System.out.println("You have guessed the letter");
					hangman.fillGapsWithLetter(letter);
				}
				else {
					System.out.println("Uppsss. You have already guessed this letter");
				}
			}
			else {
				System.out.println("Uppsss. The letter '" + letter + "' is not in the word");
				hangman.decreaseLives();
			}
			System.out.println("You have " + hangman.getLives() + " lives");
			guessed=hangman.isGuessed();
			
		}while(hangman.getLives()>0&&guessed==false);
		
		System.out.println();
		
		if(guessed==true) {
			System.out.println("CONGRATULATIONS, YOU HAVE GUESSED THE WORD!!!");
			System.out.println("The word was :" + hangman.getWord());
		}
		else {
			System.out.println("GAME OVER");
			System.out.println("The word was :" + hangman.getWord());
		}
		
		input.close();

	}

}
