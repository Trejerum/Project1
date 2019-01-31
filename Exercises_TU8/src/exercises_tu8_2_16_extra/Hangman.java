package exercises_tu8_2_16_extra;

import java.util.Random;
import java.util.Scanner;

public class Hangman {

	// Attributes
	public Player[] player;
	private String wordToGuess;
	private char[] wordWithGaps;
	private String[] words = { "ADDRESS", "JAVA", "HTML", "INTERNET", "EMAIL", "PASSWORD", "MOUSE" };
	private Scanner input = new Scanner(System.in);

	// Constructors
	public Hangman(int playerNum) {

		int lowLimit = 0;
		int upLimit = words.length;

		player = new Player[playerNum];

		Random randGenerator = new Random();
		int myNumber = lowLimit + randGenerator.nextInt(upLimit + 1 - lowLimit);

		wordToGuess = words[myNumber];
		initializeGaps();

	}

	// Getters and setters

	public String getWord() {
		return wordToGuess;
	}

	// Other methods
	public void initializeGaps() {
		wordWithGaps = new char[wordToGuess.length()];
		for (int i = 0; i < wordWithGaps.length; i++) {
			wordWithGaps[i] = '_';
		}
	}

	public void playATurn(int lowest, boolean guessed) {
		char letter;
		boolean isInWord;
		boolean isRepeated;
		for (int i = 0; i < player.length; i++) {

			if(player[i].getLives()>0) {
				System.out.println("Player_" + i + 1 + " its your turn");
				System.out.println("Guess the word: ");
				displayGaps();
				System.out.print("Enter a letter: ");
				letter = input.nextLine().charAt(0);
				letter = Character.toUpperCase(letter);
				isInWord = isLetterInWordToGuess(letter);
				if (isInWord == true) {
					isRepeated = isLetterRepeated(letter);
					if (isRepeated == false) {
						System.out.println("You have guessed the letter");
						fillGapsWithLetter(letter);
					} else {
						System.out.println("Uppsss. You have already guessed this letter");
					}
				} else {
					System.out.println("Uppsss. The letter '" + letter + "' is not in the word");
					player[i].decreaseLives();
				}
				System.out.println("You have " + player[i].getLives() + " lives");
				guessed = isGuessed();
			}
		}	

	}

	public void displayGaps() {
		for (int i = 0; i < wordWithGaps.length; i++) {
			System.out.print(wordWithGaps[i] + " ");
		}
		System.out.println();
	}

	public boolean isGuessed() {
		boolean isGuessed = true;
		for (int i = 0; i < wordWithGaps.length; i++) {
			if (wordWithGaps[i] == '_') {
				isGuessed = false;
				break;
			}
		}
		return isGuessed;
	}

	public void fillGapsWithLetter(char letter) {

		for (int i = 0; i < wordToGuess.length(); i++) {
			if (letter == wordToGuess.charAt(i)) {
				wordWithGaps[i] = letter;
			}
		}
	}

	public boolean isLetterRepeated(char letter) {
		boolean isRepeated = false;

		for (int i = 0; i < wordWithGaps.length; i++) {
			if (letter == wordWithGaps[i]) {
				isRepeated = true;
				break;
			}
		}
		return isRepeated;
	}

	public boolean isLetterInWordToGuess(char letter) {
		boolean isInWord = false;

		for (int i = 0; i < wordToGuess.length(); i++) {
			if (letter == wordToGuess.charAt(i)) {
				isInWord = true;
				break;
			}
		}

		return isInWord;
	}

}