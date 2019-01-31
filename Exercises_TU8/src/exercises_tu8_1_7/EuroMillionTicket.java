package exercises_tu8_1_7;

import java.util.Arrays;
import java.util.Random;

public class EuroMillionTicket {

	//Attributes
	private int[] nums;
	private int[] stars;
	
	//Constructors
	public EuroMillionTicket() {
		Random randGenerator=new Random();
		nums=new int[5];
		stars=new int[2];
		for (int i = 0; i < nums.length; i++) {
			nums[i]=1+randGenerator.nextInt(50+1-1);
			for (int j = 0; j < i; j++) {
				if(nums[i]==nums[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(nums);
		for (int i = 0; i < stars.length; i++) {
			stars[i]=1+randGenerator.nextInt(12+1-1);
			for (int j = 0; j < i; j++) {
				if(stars[i]==stars[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(stars);
	}
	
	//Getters and setters
	public int[] getNums() {
		return nums;
	}

	public void setNums(int[] num) {
		this.nums = num;
	}

	public int[] getStars() {
		return stars;
	}

	public void setStars(int[] stars) {
		this.stars = stars;
	}
	
	//Other methods
	public void displayTickets() {
		for (int i = 0; i < nums.length; i++) {
			if(i==nums.length-1) {
				System.out.print(nums[i]+", ");
			}
			else {
				System.out.print(nums[i]+"-");
			}
		}
		for (int i = 0; i < stars.length; i++) {
			if(i==stars.length-1) {
				System.out.print(stars[i]);
			}
			else {
				System.out.print(stars[i]+"-");
			}
		}
	}
	
}
