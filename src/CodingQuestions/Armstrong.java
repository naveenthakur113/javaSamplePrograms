package CodingQuestions;

import java.util.Scanner;

public class Armstrong {

	private static Scanner scanner;

	public static Boolean checkArmstrong(int number) {

		int armstrong = number;
		int result = 0;

		while (armstrong > 0) {
			int rem = armstrong % 10;
			result = result + (rem * rem * rem);
			armstrong = armstrong / 10;
		}

		System.out.println("Original Number:" + number);
		System.out.println("Armstrong number:" + result);

		if (number == result) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scanner = new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		int number = scanner.nextInt();
		System.out.println("The number is Armstrong: " + checkArmstrong(number));

	}

}
