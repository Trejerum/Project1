package exercises_tu8_1_6b;

import java.util.Random;

public class RandomNumberGame {

	//Attributes
	private int randNum;
	private int numberOfLives=3;
	private Player player;
	
	//Constructors
	public RandomNumberGame() {
		Random randGenerator=new Random();
		randNum = 1 + randGenerator.nextInt(50+1-1);
	}
	
	//Getters and setters
	public int getRandNum() {
		return randNum;
	}

	public void setRandNum(int randNum) {
		this.randNum = randNum;
	}

	public int getNumberOfLives() {
		return numberOfLives;
	}

	public void setNumberOfLives(int numberOfLives) {
		this.numberOfLives = numberOfLives;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
	//Other methods
	public int decreaseNumberOfLives() {
		numberOfLives=numberOfLives-1;
		return numberOfLives;
	}
	
	public void getNumOfLives() {
		System.out.println("Number of lives: "+numberOfLives);
	}
	
	public boolean isEquals(int num) {
		boolean isEquals=false;
		if(num==randNum) {
			isEquals=true;
		}
		return isEquals;
	}
	
	public void displayFinalMessage(boolean guessed) {
		if(guessed==true) {
			System.out.print("Congratularions "+ player.getFullName()+"!For a ");
			if(player.getGender()=='M'||player.getGender()=='m') {
				System.out.print("man of");
			}
			else {
				System.out.print("woman of ");
			}
			System.out.println(player.getAge()+" is not bad");
		}
		else {
			System.out.println("Game over.");
		}
	}
	
	public void displayTip(int num) {
		if(num>randNum) {
			System.out.println("The number to guess is smaller");
		}
		else if(num<randNum) {
			System.out.println("The number to guess is bigger");
		}
	}
	
	
	
	
}
