package exercises_tu8_2_11;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a;
		System.out.print("Enter a number: ");
		a=input.nextDouble();
		customFormat("##,###.###", a);
		customFormat("##,###", a);
		customFormat("00,000.0000", a);
		
		input.close();

	}
	
	public static void customFormat(String pattern, double value ) {
		 DecimalFormat myFormatter = new DecimalFormat(pattern);
		 String output = myFormatter.format(value);
		 System.out.println(output);
	}

}
