package CodingQuestions;

public class Anagram {

	public static Boolean checkAnagram(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}

		for (char c : s1.toCharArray()) {
			if (!(s2.contains(c + ""))) {
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(checkAnagram("listen", "silent"));
	}

}
