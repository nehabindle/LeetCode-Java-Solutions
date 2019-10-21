package Maximum_Sum_Path;

//import Path_Sum.Solution.TreeNode;

public class Solution {
	
	public static  class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x)
		{
			this.val = x;
		}
	}

	static int max_sum = Integer.MIN_VALUE;
	
	public static int max_gain(TreeNode node)
	{
		//Check for base case
		
		if(node == null)
		{
			return 0;
		}
// To find the maximum sum of left and right subtree of node
		
		int left_gain = Math.max(max_gain(node.left), 0);
		int right_gain = Math.max(max_gain(node.right),0);

		int val_newPath = node.val+left_gain+right_gain;
		
	max_sum = Math.max(max_sum, val_newPath);	
		
		
		return node.val+Math.max(left_gain, right_gain);
	}
	
public static int maxPathSum(TreeNode root)
{
	max_gain(root);
	return max_sum;
}
	
	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.left= new TreeNode(2);
		node.right = new TreeNode(3);
		node.left.left = new TreeNode(7);
		node.left.right = new TreeNode(6);
		node.right.left = new TreeNode(5);
		node.right.right  = new TreeNode(4);
	    int result = maxPathSum(node);
	    System.out.println(result);

	}

}
