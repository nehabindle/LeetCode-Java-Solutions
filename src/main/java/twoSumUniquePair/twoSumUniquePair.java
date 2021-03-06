package twoSumUniquePair;
import java.util.*;

public class twoSumUniquePair {
	int complement;
	
	public List<List<Integer>> twoSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<>();
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0 ; i <nums.length; i++)
		{
			if(!map.containsKey(nums[i]))
			{
				map.put(nums[i], i);
			}
		}
		
		for(int j=0; j<map.size();j++)
		{
			complement = target - nums[j];
			if(map.containsKey(complement))
			{
				List<Integer> l1 = new ArrayList<>();
				l1.add(nums[j]);
				l1.add(complement);
				Collections.sort(l1);
				
			
			
			if(! result.contains(l1))
			{
				result.add(l1);
			}
		   }	
		}
		
		
		
		
		return result;
	}

	public static void main(String[] args) {
		
		
			int[] arr = {4,5,6,7,0,1,2};
			int target = 0;
			
			twoSumUniquePair obj = new twoSumUniquePair();
			 
			System.out.println(obj.twoSum(arr, target));
			

	}

}
