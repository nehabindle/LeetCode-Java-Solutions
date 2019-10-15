package q_2;
import java.util.Scanner;


public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = new String();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the input String");
		input = in.nextLine();
	  char[] s = input.toCharArray();
	  reverseString(s);
	  
	}    
	
	public static void reverseString(char[] s)
	{
		    
		    for(int i = s.length-1;i>=0;i--)
		    {
		    	System.out.print(s[i]);
		    	}
		
		    System.out.println("");



}
}