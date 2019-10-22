package Missing_num;

public class missing_num {
	 public int missingNumber(int[] nums) {
		 int sum = 0;
		 int n = nums.length;
		int total_sum = (n*(n+1))/2;
		
		for(int i=0; i<n;i++)
			sum += nums[i];
		return total_sum - sum;
	 }
	

	public static void main(String[] args) {
		
		int[] num = {0,2,3,4,5,6,7,8,9,10};
		
		missing_num obj = new missing_num();
		
	    int missing_val = obj.missingNumber(num);
	    System.out.println(missing_val);
	    
		// TODO Auto-generated method stub

	}

}
