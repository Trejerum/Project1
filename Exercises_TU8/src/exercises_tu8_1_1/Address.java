package exercises_tu8_1_1;

public class Address {

	//Attributes
	private String street;
	private int number;
	private int floor;
	private char letter;
	private int postcode;
	private String city;
	
	//Constructors
	public Address() {
		
	}
	
	public Address(String street, int number, int floor, char letter, int postcode, String city) {
		
		this.street = street;
		this.number = number;
		this.floor = floor;
		this.letter = letter;
		this.postcode = postcode;
		this.city = city;
		
	}
	
	//Getters and setters
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	//Other methods
	
	public String toString() {
		String str=street+" "+number+", "+floor+"."+letter+"\n"+postcode+" - "+city;
		
		return str;
	}
	
}
