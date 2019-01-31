package exercises_tu8_1_6a;

public class Game {
	//Attributes
	private int randNum;
	private Player player;
	private final int lowerLimit=1;
	private final int upperLimit=50;
	
	//Constructors
	public Game() {
		
	}

	public Game(int randNum, Player player) {
		this.randNum = randNum;
		this.player = player;
	}
	
	//Getters and setters
	public int getRandNum() {
		return randNum;
	}

	public void setRandNum(int randNum) {
		this.randNum = randNum;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public int getLowerLimit() {
		return lowerLimit;
	}

	public int getUpperLimit() {
		return upperLimit;
	}
	
	//Other methods
	public void displayClue(int num) {
		if(randNum>num) {
			System.out.println("The number is greater");
		}
		else {
			System.out.println("The number is less");
		}
	}
	
	public boolean checkNum(int num){
		boolean guessed=false;
		if(randNum==num) {
			guessed=true;
		}
		else {
			displayClue(num);
			player.setLives(player.getLives()-1);
		}
		return guessed;
	}
	
}
