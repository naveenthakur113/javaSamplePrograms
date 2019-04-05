package CodingQuestions;

public class Palindrome {

	public static Boolean checkPalindrome(String str) {

		StringBuilder s1 = new StringBuilder(str);
		s1.reverse();
		System.out.println(s1);
		if (s1.toString().equals(str)) {
			System.out.println("test");
			return true;
		}

		return false;
	}

	public static Boolean checkPalindromeIteration(String str) {

		char[] array = str.toCharArray();
		int length = array.length;

		for (int i = 0; i < length / 2; i++) {
			if (!(array[i] == array[length - 1 - i])) {
				return false;
			}
		}

		return true;
	}
	
	
	public static Boolean checkPalindrome(int number) {
		
		int palindrome=number;
		int reverse=0;
		
		while(palindrome!=0) {
			
			int remainder=palindrome%10;
			reverse=reverse*10 + remainder;
			palindrome=palindrome/10;
			
		}
		
		System.out.println("Number" + number);
		System.out.println("Reverse:" + reverse);
		
		if(number==reverse) {
			return true;
		}
		return false;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println(checkPalindrome("teet"));
		System.out.println(checkPalindromeIteration("taxyxat"));
		
		System.out.println(checkPalindrome(121));

	}

}
