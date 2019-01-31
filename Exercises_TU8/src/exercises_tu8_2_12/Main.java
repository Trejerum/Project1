package exercises_tu8_2_12;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random randGenerator=new Random();
		int myNumber1=0 + randGenerator.nextInt(100+1-0);
		System.out.println(myNumber1);
		
		int myNumber2=0 + randGenerator.nextInt(99+1-0);
		System.out.println(myNumber2);
		
		int myNumber3=1 + randGenerator.nextInt(100+1-1);
		System.out.println(myNumber3);
		
		int myNumber4=1 + randGenerator.nextInt(99+1-1);
		System.out.println(myNumber4);
		
		int myNumber5=(-50) + randGenerator.nextInt(50+1-(-50));
		System.out.println(myNumber5);

	}

}
