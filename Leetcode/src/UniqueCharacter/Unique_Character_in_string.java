package UniqueCharacter;

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