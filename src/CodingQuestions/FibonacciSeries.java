package CodingQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeries {

	private static Scanner scanner;

	public static List<Integer> printFibonacciSeriesOf(int n) {

		int a = 0;
		int b = 1;
		int c = 0;
		List<Integer> fSeries = new ArrayList<Integer>();

		if (n <= 0) {
			System.out.println("Enter a number greater than 0");
			return fSeries;
		} else if (n == 1) {
			fSeries.add(1);
			return fSeries;
		} else if (n > 1) {
			fSeries.add(1);
		}

		while (fSeries.size() < n) {
			c = a + b;
			a = b;
			b = c;
			fSeries.add(c);
		}
		return fSeries;

	}

	public static int recursiveFibonacciSeries(int n) {

		if (n == 1 || n == 2) {
			return 1;
		}

		return recursiveFibonacciSeries((n - 1)) + recursiveFibonacciSeries((n - 2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter number upto which Fibonacci series to print: ");
		scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("Output from Recursiver Method");
		for (int i = 1; i <= number; i++) {
			System.out.println(recursiveFibonacciSeries(i));
		}

		System.out.println("Output from looping logic");
		List<Integer> fSeries = printFibonacciSeriesOf(number);
		Iterator<Integer> it = fSeries.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
