package exercises_tu8_1_3;

import java.util.Scanner;
import java.util.Arrays;

public class List {

	// Attributes
	private int[] list;
	private Scanner input = new Scanner(System.in);
	private final int lowerLimit=0;
	private final int higherLimit=100;

	// Constructors
	public List(int SIZE) {
		list = new int[SIZE];
	}

	// Getters and setters

	// Other methods
	public void fill() {
		for (int i = 0; i < list.length; i++) {
			int num = 0;
			do {
				System.out.print("Introduce a number(0-100)");
				num = input.nextInt();
				if (num < 0 || num > 100) {
					System.out.println("ERROR. Invalid number");
				}
			} while (num < 0 || num > 100);
			list[i] = num;
		}
	}

	public void sort() {
		Arrays.sort(list);
	}

	public void sortReverse() {

		for (int i = 1; i < list.length; i++) {
			for (int j = 0; j < list.length - i; j++) {
				if (list[j] < list[j + 1]) {
					int aux = list[j];
					list[j] = list[j + 1];
					list[j + 1] = aux;
				}
			}
		}
	}

	public void print() {
		System.out.println();
		for (int i : list) {
			System.out.print(i + "   ");
		}
	}

	public int getAverage() {
		int average = 0;
		for (int i : list) {
			average = average + i;
		}
		average = average / list.length;
		return average;
	}

	public int getHighest() {
		int highest = lowerLimit;

		for (int i : list) {
			if (i > highest) {
				highest = i;
			}
		}

		return highest;
	}

	public int getLowest() {
		int lowest = higherLimit;

		for (int i : list) {
			if (i < lowest) {
				lowest = i;
			}
		}
		return lowest;
	}
}
