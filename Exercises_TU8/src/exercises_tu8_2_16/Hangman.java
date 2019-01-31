package exercises_tu8_2_16;

import java.util.Random;

public class Hangman {

	//Attributes
	private int lives=3;
	private String wordToGuess;
	private char[] wordWithGaps;
	private String[] words= {"ADDRESS", "JAVA", "HTML", "INTERNET", "EMAIL", "PASSWORD","MOUSE"};
	
	//Constructors
	public Hangman() {
		
		int lowLimit=0;
		int upLimit=words.length;
	
		Random randGenerator=new Random();
		int myNumber=lowLimit + randGenerator.nextInt(upLimit+1-lowLimit);
		
		wordToGuess=words[myNumber];
		initializeGaps();
		
	}

	//Getters and setters
	public int getLives() {
		return lives;
	}
	
	public String getWord() {
		return wordToGuess;
	}

	
	//Other methods
	public void initializeGaps() {
		wordWithGaps=new char[wordToGuess.length()];
		for (int i = 0; i < wordWithGaps.length; i++) {
			wordWithGaps[i]='_';
		}
	}
	
	public void displayGaps() {
		for (int i = 0; i < wordWithGaps.length; i++) {
			System.out.print(wordWithGaps[i] + " ");
		}
		System.out.println();
	}
	
	public boolean isGuessed() {
		boolean isGuessed=true;
		for (int i = 0; i < wordWithGaps.length; i++) {
			if(wordWithGaps[i]=='_') {
				isGuessed=false;
				break;
			}
		}
		return isGuessed;
	}
	
	public void fillGapsWithLetter(char letter) {
		
		for (int i = 0; i < wordToGuess.length(); i++) {
			if(letter==wordToGuess.charAt(i)) {
				wordWithGaps[i]=letter;
			}
		}
	}
	
	public boolean isLetterRepeated(char letter) {
		boolean isRepeated=false;
		
		for (int i = 0; i < wordWithGaps.length; i++) {
			if(letter==wordWithGaps[i]) {
				isRepeated=true;
				break;
			}
		}
		return isRepeated;
	}
	
	public void decreaseLives() {
		lives--;
	}
	
	public boolean isLetterInWordToGuess(char letter) {
		boolean isInWord=false;
		
		for (int i = 0; i < wordToGuess.length(); i++) {
			if(letter==wordToGuess.charAt(i)) {
				isInWord=true;
				break;
			}
		}
		
		return isInWord;
	}
	
	
	
	
	
	
}
