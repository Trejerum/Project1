package exercises_tu8_1_1;

public class Person {
	
	//Attributes
	private String id;
	private String name;
	private String surname1;
	private String surname2;
	private int age;
	private char gender;
	private String phone;
	private String email;
	private Address address;
	private boolean married;
	
	//Constructors
	public Person() {
		
	}

	public Person(String id, String name, String surname1, String surname2, int age, char sex, String phone, String email, Address address, boolean married) {
		
		this.id = id;
		this.name = name;
		this.surname1 = surname1;
		this.surname2 = surname2;
		this.age = age;
		this.gender = sex;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.married = married;
	}
	
	//Getters and setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname1() {
		return surname1;
	}

	public void setSurname1(String surname1) {
		this.surname1 = surname1;
	}

	public String getSurname2() {
		return surname2;
	}

	public void setSurname2(String surname2) {
		this.surname2 = surname2;
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

	public void setGender(char sex) {
		this.gender = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}
	
	//Other methods
	
	public String getFullName(){
		return name+" "+surname1+" "+surname2;
	}
	
	public String toString() {
		String str=id+"\n"+this.getFullName()+"\n"+age+" years old";
		if(gender=='M'||gender=='m') {
			str=str+" male";
		}
		else if(gender=='F'||gender=='f'){
			str=str+" female";
		}
		else {
			str=str+" other";
		}
		str=str+"\nAddress: \n"+address.toString()+"\nPhone number: "+phone+"\nEmail: "+email;
		
		return str;
	}
	
	public boolean isYoungerThanMe(Person p1) {
		boolean isYounger=false;
		if(p1.getAge()<age) {
			isYounger=true;
		}
		
		return isYounger;
	}
	
	
	
}
