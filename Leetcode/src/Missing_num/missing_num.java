package Missing_num;

public class missing_num {
	 public int missingNumber(int[] nums) {
		 int sum = 0;
		 int n = nums.length;
		int total_sum = (n*(n+1))/2;
		
		 if(nums[n-1]!=n)
	        {
	            return n;
	        }
	        else if (nums[0]!=0){
	            return 0;
	        } 
	    else{  
		for(int i=0; i<n;i++)
		{
			sum += nums[i];
		}
		return total_sum - sum;
	 }
	 }

	public static void main(String[] args) {
		
		int[] num = {0,2,3,4,6,5,7,9,8,10,11,12};
		
		missing_num obj = new missing_num();
		
	    int missing_val = obj.missingNumber(num);
	    System.out.println(missing_val);
	    
		// TODO Auto-generated method stub

	}

}
