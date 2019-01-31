package exercises_tu8_1_6a;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random randGenerator=new Random();
		char opt;
		do {
			int num=0;
			boolean guessed=false;
			Player player=new Player("John Brown",30,'M');
			Game game=new Game();
			game.setRandNum(game.getLowerLimit() + randGenerator.nextInt(game.getUpperLimit()+1-game.getLowerLimit()));
			game.setPlayer(player);
			for(int i=player.getLives();i>0;i--) {
				System.out.print("Introduce a number: ");
				num=input.nextInt();
				guessed=game.checkNum(num);
				if(guessed==true) {
					System.out.print("Congratulations"+player.getFullName()+"!");
					if(player.getGender()=='M'||player.getGender()=='m') {
						System.out.print(" For a man of");
					}
					else if(player.getGender()=='F'||player.getGender()=='f') {
						System.out.print(" For a woman of");
					}
					System.out.println(" "+player.getAge()+" years is not bad");
					break;
				}
			}
			if(guessed==false) {
				System.out.println("Game over."+player.getFullName()+",better luck next time...");
			}
			do {
				System.out.println("Do you wanna continue playing?(Y/N)");
				input.nextLine();
				opt=input.nextLine().charAt(0);
			}while(opt!='y'&&opt!='Y'&&opt!='n'&&opt!='N');
		}while(opt=='Y'||opt=='y');
		input.close();
	}

}
