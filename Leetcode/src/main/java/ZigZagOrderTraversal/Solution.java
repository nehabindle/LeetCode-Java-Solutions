package ZigZagOrderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import ZigZagOrderTraversal.Solution.TreeNode;



//Definition for a binary tree node.

public class Solution {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			this.val = x;
		}
	}

	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) 
	{
		List<List<Integer>> result = new ArrayList<>();
		if(root == null)
			return result;

		Stack<TreeNode> s1 = new Stack<>(); // for left to right
		Stack<TreeNode> s2 = new Stack<>();  // for right to left
		s1.push(root);
		List<Integer> list = new ArrayList<>();

		while(!s1.isEmpty() || !s2.isEmpty() ) 
		{
			while (!s1.isEmpty())
			{
				TreeNode n  = s1.pop();
				list.add(n.val);
				if(n.left != null)
					s2.push(n.left);
				if(n.right != null)
				s2.push(n.right);
			}     

			if(! list.isEmpty())
			{
				result.add(new ArrayList<>(list));
//			result.add(list);
				list.clear();
			}

			while(!s2.isEmpty())
			{
				TreeNode n  = s2.pop();
				list.add(n.val);
				if(n.right != null)
					s1.push(n.right);
				if(n.left != null)
				s1.push(n.left);

			}

			if(!list.isEmpty()) {
				result.add(new ArrayList<>(list))  ;  
//				result.add(list)  ;  
				list.clear();
			}

		}


		System.out.println(result);
		
		return result;
	}

	public static void main(String[] args) {


		TreeNode node = new TreeNode(1);
		node.left= new TreeNode(2);
		node.right = new TreeNode(3);
		node.left.left = new TreeNode(7);
		node.left.right = new TreeNode(6);
		node.right.left = new TreeNode(5);
		node.right.right  = new TreeNode(4);
		
	
		
		zigzagLevelOrder(node);
		




	}
}