
package ThreeSum;

import java.util.Arrays;

public class threeSum {
/* Brute Force Approach	
	boolean find3Numbers(int A[], int arr_size, int sum)
	{ 
		for (int i = 0 ; i< arr_size -2 ; i++)
		{
			for(int j=i+1 ; j< arr_size-1 ; j++)
			{
				for(int k= j+1; k< arr_size-2 ;k++ )
				{
					if(A[i] +A[j]+ A[k]== sum)
					{
						System.out.println("Three numbers are : "+ A[i]+" " + A[j]+" " + A[k]);
						return true;
					}
				}
				
			}
		} 
	
		return false;
		
	}*/
	
//Sorting approach
	boolean find3Numbers(int A[], int arr_size, int sum)
	{ 
		int left = 1;
		int right = arr_size-1;
		//Arrays.sort(A);
	
		
		for (int i = 0 ; i< arr_size -2 ; i++)
		{
			while(left<right)
				
			{
			if(A[i] +A[left]+ A[right]== sum)
			{
				System.out.println("Three numbers are : "+ A[i]+" " + A[left]+" " + A[right]);
				return true;
			}
			
			else if(A[i] +A[left]+ A[right] < sum)
			{
				left++;
			}
			else
			{ right--;
			
		    }
			
			}	
	}
		return false;
}
	public static void main(String[] args) {
		int num[] = {-1,2,1,4,6,5,3,7,9};
		int size = 9;
		int sum = 2;
		Arrays.parallelSort(num);
		threeSum obj = new threeSum();
		obj.find3Numbers(num, size, sum);
		
		// TODO Auto-generated method stub

	}

}
