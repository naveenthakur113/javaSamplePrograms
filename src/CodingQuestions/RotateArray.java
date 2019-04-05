package CodingQuestions;

public class RotateArray {

	public static void rotateAndPrint(int[][] array, int n) {

		int[][] newArray = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				newArray[j][n - 1 - i] = array[i][j];
			}
		}

		System.out.println("Original Array");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}

		System.out.println("After rotation");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(newArray[i][j]);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		int[][] array = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };

		rotateAndPrint(array, 3);

	}

}
