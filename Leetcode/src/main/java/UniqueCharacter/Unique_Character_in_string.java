package UniqueCharacter;

import java.util.HashMap;

public class Unique_Character_in_string {
public int firstUniqChar(String s) {
    int no_of_chars = 256;
    char[] count = new char[no_of_chars];
    int index = -1;

    
    for(int i=0 ;i<s.length();i++)
    {
        count[s.charAt(i)]++;
    }
    
    for(int i=0; i<s.length();i++)
    {
        if(count[s.charAt(i)] == 1)
        {
            index = i;
            break;
        }
    }
    
    
    HashMap<Character, Integer> abc = new HashMap<>();
    for(int k=0 ; k< s.length() ; k++) {
    	int count1 =0;
    	
    	if(abc.containsKey(s.charAt(k))){
    		count1 = 1 + abc.get(s.charAt(k));
    		abc.put(s.charAt(k), count1);
    	}else {
    		abc.put(s.charAt(k),1);
    	}
    	
    }
    
    System.out.println(abc);
    
    
    return index;
}


public static void main(String[] args)
{
	String str = "LoveLeetCode";
	int index;
	Unique_Character_in_string obj = new Unique_Character_in_string();
	index = obj.firstUniqChar(str);
	System.out.println(index);
	
	
	
}
}