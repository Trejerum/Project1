package persons;

import java.util.Scanner;

public class MainE {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		//E1
		
		PersonE p1 = new PersonE("Filomena",43);
		//Impossible to display
		
		//E2
		
		PersonE[] people = new PersonE[3];
		
		for (int i = 0; i < args.length; i++) {
			people[i]= new PersonE("",0);
			//The rest is impossible
		}
		
		
		input.close();

	}

}
