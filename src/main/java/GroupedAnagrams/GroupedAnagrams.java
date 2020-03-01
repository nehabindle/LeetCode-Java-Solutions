package GroupedAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public  class GroupedAnagrams {
	public static List<List<String>> groupAnagrams(String[] strs) {
    
    List<List <String>> result = new ArrayList<>();
    Map<String, List<String>> map = new HashMap<>();
     
    for(String str : strs)
    {
        char[] temp_list = str.toCharArray();
        Arrays.sort(temp_list);
        
        String sortedString = new String(temp_list);
        
        if(map.containsKey(sortedString))
        {
            map.get(sortedString).add(str);
            System.out.println(map.get(sortedString) + " new ");

        }
        
        else
        {
            List<String> map_list = new ArrayList<>();
            map_list.add(str);
            result.add(map_list);
            map.put(sortedString,map_list);
        }
    }
    
    
    for(Map.Entry<String, List<String>> abc : map.entrySet() ) {
    	System.out.println("key " + abc.getKey());
    	System.out.println("value " + abc.getValue());
    	
//    	if(abc.getValue() == "[eat, tea, ate]") {
//    		System.out.println("found");
//    	}
    }
    
    
//     for(Map.Entry<String, List<String>> entry:map.entrySet())
//     {
//         result.add(entry.getValue());
//     }
    
    
    return result;
    
}

	public static void main(String[] args) {
		
		String[] string1 ={"eat", "tea", "tan", "ate", "nat", "bat"};
//	GroupedAnagrams group = new GroupedAnagrams();
//	GroupedAnagrams result_final = null;
	//List<List <String>> result_final= new ArrayList<>();
//	((GroupedAnagrams) result_final).groupAnagrams(string1);
		// TODO Auto-generated method stub
	List<List<String>> abc = groupAnagrams(string1);
	System.out.println(abc);
//	System.out.println(groupAnagrams(string1));

	}

}
