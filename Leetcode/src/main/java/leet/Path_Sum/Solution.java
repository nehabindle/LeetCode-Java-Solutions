package Path_Sum;

;

public class Solution {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			this.val = x;
		}
	}
	
public static boolean hasPathSum(TreeNode root, int sum) {
        
        if(root == null)
        {
            return false;
        }
        
        else if(root.left == null && root.right == null && sum-root.val == 0)
        {
             return true;
        
        }
        
        else
        {
          return  hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
        }
    }

	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.left= new TreeNode(2);
		node.right = new TreeNode(3);
		node.left.left = new TreeNode(7);
		node.left.right = new TreeNode(6);
		node.right.left = new TreeNode(5);
		node.right.right  = new TreeNode(4);
	    boolean result = hasPathSum(node, 21);
	    System.out.println(result);

	}

}
