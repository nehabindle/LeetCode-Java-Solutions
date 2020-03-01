//@Validating BST Iterative solution 
//Time complexity O(N), Space complexity O(H), where H is the height of the tree

package ValidateBST_LC98;

import java.util.Stack;

// Class name is the name of the problem being solved
public class ValidateBST_LC98_Iterative {

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

        Tree tree = new Tree();
        tree.root = new TreeNode(4);

        TreeNode leftChild = new TreeNode(2);
        TreeNode rightChild = new TreeNode(5);

        tree.root.left = leftChild;
        tree.root.right = rightChild;


        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(3);

        if (isValidBST(tree.root ))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
        // TODO Auto-generated method stub

    }

}
