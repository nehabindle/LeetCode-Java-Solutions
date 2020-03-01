package ArrayProduct_ExceptItself;

public class ArrayProd {

	public int[] productExceptSelf(int[] nums) {
        
		 /*    Brute Force
		 
		 int[] result = new int[nums.length];
		       
		    
		        for(int i=0;i<nums.length;i++)
		        { 
		            int res = 1;
		            
		            for(int j =0; j<nums.length;j++)
		            {
		                if(i==j)
		                {
		                    continue;
		                }
		                else
		                {
		                    res = res*nums[j];
		                    
		                }
		                    
		                    
		                    //end of j for loop
		            }
		             result[i] = res;
		                
		            //End of i for loop
		        }
		      return result;  */
		        int n = nums.length;
		 int[] left = new int[n];
		 int[] right = new int[n];
		 int[] result_array = new int[n];
		        int i,j;
		        
		        left[0] = 1;
		        right[n-1] = 1;
		        
		        for(i = 1; i<n ; i++)
		        {
		            left[i] = left[i-1]*nums[i-1];
		        }
		        
		        
		        for(j = n-2; j>=0;j--)
		        {
		            right[j] = right[j+1]*nums[j+1];
		            
		        }
		        
		        for (i = 0; i<n; i++)
		        {
		            result_array[i] = left[i]*right[i];
		        }
		        
		        
		        return result_array;
		        
		    }
	
	
	public int[] productExceptSelf_O1(int[] nums) {	
	
	
	int length = nums.length;
	  int[] prod_array = new int[length];
	   prod_array[0] = 1;
	        for(int i=1;i<length;i++)
	        {
	            prod_array[i] = prod_array[i-1]*nums[i-1];
	        }
	        
	       int right = 1;
	        
	        for(int i= length-1; i>=0; i--)
	        {
	            prod_array[i] = right*prod_array[i];
	            right*=nums[i];
	        }
	        
	        return prod_array;
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 3, 5, 6, 2 };
		ArrayProd obj = new ArrayProd();
		int[] res = new int[arr.length];
		res = obj.productExceptSelf(arr);
		for(int i=0;i<arr.length;i++)
		System.out.print(res[i]+" ");
		System.out.println(" ");
		int[] res2 = new int[arr.length];
		res2 = obj.productExceptSelf_O1(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(res2[i]+" ");
		
		

	}

}
