package VowelString;

public class VowelString {static int countSubStr(char[] s, int n) 
{ 
	  
    // To store the required count 
    int count = 0; 
    for (int i = 0; i < n - 2;i++)
    { 

        // If "010" matches the sub-string 
        // starting at current index i 
        if (s[i] == 'a' || s[i]=='e' || s[i] == 'i' || s[i]=='o' || s[i]=='u')
        {
        		if (!(s[i + 1] == 'a' || s[i+1]=='e' || s[i+1] == 'i' || s[i+1]=='o' || s[i+1]=='u')) {
        			if (s[i+2] == 'a' || s[i+2]=='e' || s[i+2] == 'i' || s[i+2]=='o' || s[i+2]=='u') {
        				count++; 
        			}
        		}
        }       
         
        // If "101" matches the sub-string 
        // starting at current index i 
        else {
        	count = count+0;
        }
        
        
    } 

    return count; 
} 

// Driver code 
public static void main(String[] args) 
{ 
    char[] s = "amazing".toCharArray(); 
    //s.length;
    int n = s.length; 

    System.out.println(countSubStr(s, n)); 
} 
	

}
