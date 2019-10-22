package Trapping_Rain_Water;

public class Trapping_water {

	public static int trap(int[] height)
	{  
		
		int result = 0;
	    int level = 0;
	    int left = 0;
	    int right = height.length-1;
	    
	    if(height.length == 0 || height == null)
		
	    {
	    	return 0;
	    	
	    }
		
		
	    
	    while (left < right)
	    {
	    	System.out.println("Left index is " + left + " value is " + height[left] + " right is " + right +" value is "+ height[right] );
	    	
	    	int lower = height[height[left]< height[right] ? left++ : right--];
	    	System.out.println(" Lower is :" + lower);
	    	
	    	level = Math.max(lower, level);
	    	System.out.println("level is "+ level);
	    	result += level - lower;
	    	System.out.println("Result is " + result);
	    			
	    }
	    
	    
		
		return result;
		
	}
	public static void main(String[] args) {
		//Trapping_water traping = new Trapping_water();
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		
		int obj;
		obj = Trapping_water.trap(height);
		System.out.println(obj);
	}

}
