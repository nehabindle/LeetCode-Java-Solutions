package RepetedWord;

import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String s = "He had had quite enough of this nonesense.";
		String s = "that                that occurs sometimes.";
//		String s = "Do you have a question on the above article or do you have a programming problem that you are unable to solve?";
		String ans = firstRepeatedWords(s);
		System.out.println(ans);
		
	}

	public static String firstRepeatedWords(String s) {
		String[] words = s.split("[\\s@,.;:-]");
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i=0; i< words.length;i++) {
			if(!words[i].equalsIgnoreCase("")) {
				
			
			if(map.containsKey(words[i].toLowerCase())) {
				return words[i];
			}else
			{
//				int count = 0
				
				map.put(words[i].toLowerCase(), 1);
			}
		}
		}
		return null;
	}
	
}
