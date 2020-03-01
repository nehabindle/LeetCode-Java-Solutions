package Index_in_InfiniteArray;

public class Index_InfiniteArray {
	
	static class infiniteArray
	{
		static int BinarySearch(int arr[], int left, int right, int target)
		{
			if(left<=right)
	
			{
				int mid = left + (right - left)/2;
				if(arr[mid]==target)
				{
					return mid;
				}
				else if (arr[mid]>target)
				{
					right = mid-1;
					return BinarySearch(arr, left, right, target);
				}
				else
				{
					left = mid+1;
					return BinarySearch(arr, left, right, target);
				}
				
			}
			return -1;
		}
		
		static int findIndex(int arr[], int target)
		{
			int low = 0;
			int high = 1; // We will start with first 2 elements 
			int current = arr[0];
			
			while (current < target)
			{
				low = high;
				if(2*high < arr.length-1)
				{
					high = 2*high;
				}
				else
				{
					high = arr.length-1;
				}
				
				current = arr[high];
			}
			return BinarySearch(arr, low, high, target);
		}
	}

	public static void main(String[] args) {
		
		int infinte_Array[] = {1,3,5,7,8,9,11,14,15};
		//infiniteArray obj = new infiniteArray();
		int position = infiniteArray.findIndex(infinte_Array,14);
		if(position==-1)
		
		{
			System.out.println(" The target Element is not in the Array");
			
		}
		
		else
			System.out.println(" The target Element is at the position " + position);
		
		// TODO Auto-generated method stub

	}

}
