package exercises_tu8_2_10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String s1;
		int a;
		float b;
		double c;
		
		int number=Integer.parseInt(input.nextLine());
		
		s1=input.nextLine();
		a=Integer.valueOf(s1);
		s1=input.nextLine();
		b=Float.valueOf(s1);
		s1=input.nextLine();
		c=Double.valueOf(s1);
		
		System.out.println(a + ", " + b + ", " + c + " " + number);
		
		input.close();

	}

}
