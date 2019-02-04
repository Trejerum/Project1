
	}

}
package exercises_tu8_2_16_extra;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numberOfPlayers;
		int lowest=3;
		boolean guessed=false;
		System.out.print("Introduce the number of players: ");
		numberOfPlayers=Integer.parseInt(input.nextLine());
		Hangman hangman=new Hangman(numberOfPlayers);
	
			do {
				
				guessed=hangman.playATurn(lowest, guessed);
				
				
			}while(guessed==false);
			
			System.out.println();
			
			if(guessed==true) {
				System.out.println("CONGRATULATIONS PLAYER_" + hangman.getWinner() +" , YOU HAVE GUESSED THE WORD!!!");
				System.out.println("The word was: " + hangman.getWord());
			}
			else {
				System.out.println("GAME OVER");
				System.out.println("The word was: " + hangman.getWord());
			}
		
		input.close();

	}

}
