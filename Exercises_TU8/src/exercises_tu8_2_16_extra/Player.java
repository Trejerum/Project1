package exercises_tu8_2_16_extra;

public class Player {

	//Attributes
	private int lives=3;
	
	//Constructors
	public Player() {

	}
	
	
	//Getters and setters
	public int getLives() {
		return lives;
	}

	
	//Other methods
	public void initializeLives() {
		lives=3;
	}
	
	public void decreaseLives() {
		lives--;
	}
	
	
	
}
