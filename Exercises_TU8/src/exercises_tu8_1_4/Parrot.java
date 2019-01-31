package exercises_tu8_1_4;

public class Parrot {

	// Attributes

	private char sex;
	private int age;
	private char region;
	private String colour;

	// Constructors

	public Parrot() {

	}

	public Parrot(char sex, int age, char region, String colour) {
		this.sex = sex;
		this.age = age;
		this.region = region;
		this.colour = colour;
	}

	// Getters and setters

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getRegion() {
		return region;
	}

	public void setRegion(char region) {
		this.region = region;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	// Other methods

	public void WhereAreYouFrom() {
		System.out.print("Pio, pio, i am from ");
		//Maybe better with a switch
		if (region == 'n' || region == 'N') {
			System.out.println("the north");
		} else if (region == 's' || region == 'S') {
			System.out.println("the south");
		} else if (region == 'w' || region == 'W') {
			System.out.println("the west");
		} else if (region == 'e' || region == 'E') {
			System.out.println("the east");
		}
	}

	public void WhoAmI() {
		System.out.print("Pio, pio, i am ");
		if (sex == 'm' || sex == 'M') {
			System.out.print("male");
		} else {
			System.out.print("female");
		}
		System.out.println(" and my age is " + age);
	}

	public void talk() {
		System.out.println("Pio, pio, i am a parrot");
	}

	public void talk(String message) {
		System.out.println(message);
	}

	public void talk(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("Pio, pio, i am a sexy " + colour + " parrot");
		}
	}

	public boolean isOlderThan(Parrot parrot) {
		boolean isOlder = false;
		if (parrot.getAge() > age) {
			isOlder = true;
		}
		return isOlder;
	}

}
