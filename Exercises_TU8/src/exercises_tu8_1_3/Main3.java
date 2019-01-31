package exercises_tu8_1_3;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		List list = new List(3);
		int average = 0;
		int highest = 0;
		int lowest = 0;
		list.fill();
		list.sort();
		list.print();
		list.sortReverse();
		list.print();
		average = list.getAverage();
		System.out.println();
		System.out.println("Average: " + average);
		highest = list.getHighest();
		System.out.println("Highest: " + highest);
		lowest = list.getLowest();
		System.out.println("Lowest: " + lowest);

		input.close();

	}
}
