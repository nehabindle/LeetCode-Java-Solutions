package MostFreqSubString;
import java.util.*;

public class Solution {
	
	
	
	
	/**
	 * 
	 * @param minLength
	 *            min length
	 * @param maxLength
	 *            max length
	 * @param maxunique
	 *            number of unique characters
	 * @param s
	 *            the string
	 * @return
	 */
	static int getCount(String s, int minLength, int maxLength, int maxunique ) {
		Set<Character> uniqueChars = new HashSet<Character>();
		Map<String, Integer> stats = new HashMap<String, Integer>();
		for (int h = 0; h <= s.length() - minLength; h++) {
			for (int t = h + minLength; t <= s.length() && t <= h + maxLength
					&& uniqueChars.size() <= maxunique; t++) {
				uniqueChars.clear();
				String subStr = s.substring(h, t);// this method does not
				// include last position
				if (stats.containsKey(subStr)) {
					stats.put(subStr, stats.get(subStr) + 1);
					populateSet(subStr, uniqueChars);
				} 
				
				
				else {
					stats.put(subStr, 1);
				}
			}
		}
		PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<Map.Entry<String, Integer>>(
				stats.size(), new Comparator<Map.Entry<String, Integer>>() {

					@Override
					public int compare(Map.Entry<String, Integer> o1,
							Map.Entry<String, Integer> o2) {
						return o2.getValue() - o1.getValue();
					}

				});
		pq.addAll(stats.entrySet());
		Map.Entry<String, Integer> entry = pq.poll();
		System.out.println(entry.getKey());
		return entry.getValue();
	}

	private static void populateSet(String s, Set<Character> uniqueChars) {
		Objects.requireNonNull(s);
		Objects.requireNonNull(uniqueChars);
		for (char c : s.toCharArray())
			uniqueChars.add(c);

	}

	public static void main(String[] args) {
		//		System.out.println(getCount(" as up up up.", 3, 5, 5));
		//		System.out.println(getCount("abcde", 2, 4, 26));
		System.out.println(getCount("ababab", 2, 3, 4));


	}

}