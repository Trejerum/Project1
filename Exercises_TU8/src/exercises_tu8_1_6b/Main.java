package exercises_tu8_1_6b;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String opt;
		do {
			int num=0;
			boolean guessed=false;
			Player player=new Player("John Brown",20,'M');
			RandomNumberGame game=new RandomNumberGame();
			game.setPlayer(player);
			while(game.getNumberOfLives()>0){
				System.out.print("Please introduce a number: ");
				num=input.nextInt();
				guessed=game.isEquals(num);
				if(guessed==true) {
					break;
				}
				System.out.println("Incorrect number");
				game.displayTip(num);
				game.decreaseNumberOfLives();
				game.getNumOfLives();
			}
			game.displayFinalMessage(guessed);
			System.out.print("Continue playing?(Yes/No):");
			input.nextLine();
			opt=input.nextLine();
		}while(opt.contentEquals("YES")||opt.contentEquals("Yes")||opt.contentEquals("yes"));
		
		input.close();

	}

}
