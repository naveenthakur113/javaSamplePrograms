package CodingQuestions;

import java.util.HashMap;
import java.util.Map.Entry;

public class WordCount {

	public static void wordCount(String str) {

		String[] strArray = str.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		for (String s : strArray) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}else {
				map.put(s, 1);
			}
			
		}
		
		for(Entry<String, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wordCount("This is a test of skill of");
		
	}

}
