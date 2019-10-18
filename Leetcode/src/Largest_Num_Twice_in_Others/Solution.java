package Largest_Num_Twice_in_Others;

import java.util.*;
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.Collections;

public class Solution {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums = {3,6,1,0};
		int[] nums = {1,2,3,4};
		int a = dominantIndex(nums);
				System.out.println(a);

	}

	public static <T> int dominantIndex(int[] nums) {

		int index = -1;
		int max =0;
		int result = -1;
		for(int i=0 ; i< nums.length;i++) {
			if(nums[i] >= 2* max)
			{
				result = i; 
			}else if(nums[i]*2 > max)
			{
				return -1;
			}
			max = Math.max(max,nums[i]);
		}
		
		

		return result;
		


		//	        if(nums.length==1 || nums.length == 0)
		//	        {
		//	            return 0;
		//	            
		//	        }
		//	        else{
		//	            for(int i=0 ; i< nums.length-1 ; i++)
		//	            {
		//	                for(int j=i;j<nums.length;j++)
		//	                {
		//	                if(2*nums[i] <= (nums[j]))
		//	                {
		//	                    index = j;
		//	                }
		//	                    
		////	                else if(2*nums[j] <= nums[i])
		////	                {
		////	                    index = i;
		////	                }
		//	                  
		//	                else  
		//	                {
		//	                   index = -1; 
		//	                }
		//	                    
		//	                }
		//	                
		//	            }
		//	        return index;

	}


}


