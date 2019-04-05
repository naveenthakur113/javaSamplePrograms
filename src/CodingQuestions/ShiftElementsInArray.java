package CodingQuestions;

public class ShiftElementsInArray {

	public static char[] shiftElements(char[] charArray, int leftShiftCount, int rightShiftCount) {

		int count = 0;
		int arraySize = charArray.length;
		while (count < leftShiftCount) {
			char ch = charArray[0];
			for (int i = 1; i < arraySize; i++) {
				charArray[i - 1] = charArray[i];
			}
			charArray[charArray.length - 1] = ch;
			count++;
		}
		System.out.println(charArray);

		count = 0;

		while (count < rightShiftCount) {
			char ch = charArray[arraySize - 1];
			for (int i = arraySize - 1; i > 0; i--) {
				charArray[i] = charArray[i - 1];
			}
			charArray[0] = ch;
			count++;
		}

		return charArray;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] charArray = { '1', '2', '3', '4' };
		charArray = shiftElements(charArray, 3, 2);
		System.out.println(charArray);

	}

}
