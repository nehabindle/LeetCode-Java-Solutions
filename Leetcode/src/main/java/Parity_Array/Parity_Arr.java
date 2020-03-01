package Parity_Array;

import java.util.Scanner;


public class Parity_Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		
	    int[] Arr =  {2,6,3,7,8};

	      int[] c =  sortArrayByParityII(Arr);
	      for(int i =0 ; i< c.length;i++) {
	      System.out.println(c[i]);}

	}
	 public static int[] sortArrayByParityII(int[] A) {
		       int i;
		       int j=0;
		       int k = 1;
	        int[] B = new int[A.length];
	        for(i = 0 ; i<A.length; i++)
	        {
	        	
	        	if(A[i]%2==0)
	        	{
	        		B[j]=A[i];
	        		j = j+2;
	        	}
	        	
	        	
	        	else
	        	{
	        		B[k]=A[i];
	        		k=k+2;
	        	}           
	            
	        }
	        
	        return B;
	        
	    }
	

}
