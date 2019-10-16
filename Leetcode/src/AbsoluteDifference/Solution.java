package AbsoluteDifference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	
	 public List<List<Integer>> minimumAbsDifference(int[] arr) {
	        
	        Arrays.sort(arr);
	        
	        int Abs_diff = arr[1] - arr[0];
	            
	            for(int i=0; i<arr.length-1;i++)
	            {
	                if (arr[i+1] - arr[i] < Abs_diff)
	                {
	                    Abs_diff = arr[i+1] - arr[i];
	                }
	            }
	        
	        List<List<Integer>> result_pair = new ArrayList<>();
	        
	        for(int i=0;i<arr.length-1;i++)
	        {
	            if (arr[i+1] - arr[i] == Abs_diff)
	                result_pair.add(Arrays.asList(arr[i], arr[i+1]));
	        }
	        return result_pair;
	    }

	
	public static void main(String[] args) {
		
		Solution obj = new Solution();
		int[] arr = {23,32,12,45,13,43,78};
		
		obj.minimumAbsDifference(arr);
		System.out.println(obj.minimumAbsDifference(arr));
		
	}

}