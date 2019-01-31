package exercises_tu8_1_6b;

public class Player {

	//Attributes
	private String fullName;
	private int age;
	private char gender;
	
	//Constructors
	public Player() {

	}
	public Player(String fullName, int age, char gender) {
		this.fullName = fullName;
		this.age = age;
		this.gender = gender;
	}
	
	//Getters and setters
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
	
	
}
