package MedianOfSortedArrays;

public class Median {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
		 int length_total = nums1.length +  nums2.length;
	        
	        double median;
	        int i=0, j=0, index=0;
	        
	        int[] nums_final= new int[length_total];
	        
	        while (i < nums1.length || j<nums2.length )
	        {       
	            if( i< nums1.length && j < nums2.length)
	            {
	                 if(nums1[i] <= nums2[j])
	                 {
	                     nums_final[index] = nums1[i];
	                     i++;
	                     index++;
	                     continue;
	                 }
	                else 
	                {
	                    nums_final[index] = nums2[j];
	                    j++;
	                    index++;
	                    continue;
	                }
	        }
	            
	       if(i<nums1.length)
	       {
	          nums_final[index] = nums1[i];
	           i++;
	                     index++;
	           
	       }
	            else
	            {
	                nums_final[index] = nums2[j];
	                    j++;
	                    index++;
	            }
	            
	        }
	        
	        
	        if (length_total % 2 == 0)
	        {
	           median = (nums_final[(length_total-1)/2]+ nums_final[(length_total/2)])/2.0;
	             //median = median1/2.0;
	            //return median;
	        }
	        else
	        {
	            median = nums_final[length_total/2];
	             //return median;  
	        }
	        return median;
	}
	public static void main(String[] args) {
		
//		int[] nums1 = {2,3,5,6,7};
//		int[] nums2 = {1,8,9};
		int[] nums1 = {1,3};
		int[] nums2 = {2};
		
		double obj = findMedianSortedArrays(nums1,nums2);
		System.out.println(obj);
		
		// TODO Auto-generated method stub

	}

}
