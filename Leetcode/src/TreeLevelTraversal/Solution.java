package TreeLevelTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//import ZigZagOrderTraversal.Solution.TreeNode;

public class Solution {
	
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			this.val = x;
		}
	}

	 public static List<List<Integer>> levelOrder(TreeNode root) {
	      List<List<Integer>> result = new ArrayList<>();
	        
	        if(root == null)
	        {
	            return result;
	        }
	        
	    Queue<TreeNode> queue = new LinkedList<>();
	        
	        queue.add(root);
	        
	        
	    while(!queue.isEmpty())
	    {
	        int size = queue.size();
	        
	        List<Integer> currentLevel = new ArrayList<>();
	        for(int i=0; i<size; i++)
	        {
	            TreeNode current = queue.remove();
	            currentLevel.add(current.val);
	            
	            if(current.left != null)
	            {
	                queue.add(current.left);
	            }
	            
	             if(current.right != null)
	            {
	                queue.add(current.right);
	            }
	        }
	        
	        result.add(currentLevel);
	    }
	     System.out.println(result);
	      return result;
	        
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node = new TreeNode(1);
		node.left= new TreeNode(2);
		node.right = new TreeNode(3);
		node.left.left = new TreeNode(7);
		node.left.right = new TreeNode(6);
		node.right.left = new TreeNode(5);
		node.right.right  = new TreeNode(4);
		
		levelOrder(node);
	}

}
