package CodingQuestions;

import java.util.Scanner;

public class PrimeNumber {

	private static Scanner scanner;

	public static boolean checkPrime(int number) {
		
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				return false;
			}
		}
		
		
		return true;
	}
	
	
	public static void main(String[] args) {
		scanner=new Scanner(System.in);
		System.out.println("Enter a number to be validated: ");
		int number=scanner.nextInt();
		
		boolean result=checkPrime(number);
		if(result) {
			System.out.println(number + " is a prime number");
		}else {
			System.out.println(number + " is not a prime number");	
		}
		
	}

}
