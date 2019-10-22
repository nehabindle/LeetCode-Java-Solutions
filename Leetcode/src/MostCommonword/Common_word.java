package MostCommonword;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Common_word {
	
	public static String mostCommonWord(String paragraph, String[] banned) {
		HashMap<String, Integer> map = new HashMap<>();
		String[] words = paragraph.split("[\\s,.?;:'!+']");
		
		List<String> banned_words = Arrays.asList(banned);
		
	int count = 0;
	int max_count = 0;
	String result = " ";
	
	for(String word:words)
	{
		word = word.toLowerCase();
		
		if(!banned_words.contains(word))
		{
			count = map.containsKey(word)? map.get(word)+1 : 1;
			map.put(word,count);
			if(count>max_count)
			{
				max_count = count;
				result = word;
			}
		}
		
	}
		
		return result;
	}

	public static void main(String[] args) {
		
		
		String str = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] bann = {"hit"};
		//String[] words = str.split("[\\s,.?;:'!+']");
//		for(int i=0; i<words.length;i++)
//		{
//			
//			System.out.println(words[i]);
//			
//		
//		}
      String res = mostCommonWord(str, bann);
      System.out.println(res);
	}

}
