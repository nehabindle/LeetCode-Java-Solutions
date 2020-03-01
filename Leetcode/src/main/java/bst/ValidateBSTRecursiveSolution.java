package bst;

import java.util.Stack;

public class ValidateBSTRecursiveSolution {

    public static boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        TreeNode prev = null;
        Stack<TreeNode> st = new Stack<>();

        while (root != null || !st.isEmpty()) {
            while (root != null) {
                st.push(root);
                root = root.left;
            }
            root = st.pop();
            if (prev != null && root.val <= prev.val) {
                return false;
            }

            prev = root;
            root = root.right;
        }

        return true;
    }

    public static void main(String[] args) {
        Tree tree2 = new Tree();
        tree2.root = new TreeNode(5);

        TreeNode leftChild = new TreeNode(3);
        TreeNode rightChild = new TreeNode(6);
        tree2.root.left = leftChild;
        tree2.root.right = rightChild;


//        tree.root = new ValidateBST_LC98_Iterative.TreeNode(4);
//        tree.root.left = new ValidateBST_LC98_Iterative.TreeNode(2);
//        tree.root.right = new ValidateBST_LC98_Iterative.TreeNode(5);
        tree2.root.left.left = new TreeNode(1);
        tree2.root.left.right = new TreeNode(4);

        if (isValidBST(tree2.root))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }

}
