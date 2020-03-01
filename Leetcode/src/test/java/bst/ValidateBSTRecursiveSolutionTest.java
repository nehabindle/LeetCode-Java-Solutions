package bst;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidateBSTRecursiveSolutionTest {
    @Test
    public void treeWithNoRootNodeShouldBeValid() {
        boolean result = ValidateBSTRecursiveSolution.isValidBST(null);

        assertEquals(result, true);
    }

    @Test
    public void treeWithNoRightChildShouldBeValid() {
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(4);;
        root.right = null;
        boolean result = ValidateBSTRecursiveSolution.isValidBST(root);

        assertEquals(result, true);
    }

    @Test
    public void treeWithNoLeftChildShouldBeValid() {
        TreeNode root = new TreeNode(7);
        root.right = new TreeNode(8);;
        root.left = null;
        boolean result = ValidateBSTRecursiveSolution.isValidBST(root);

        assertEquals(result, true);
    }

    @Test
    public void treeWitLeftChildGreaterThanRootShouldNotBeValid()
    {
        TreeNode root = new TreeNode(7);
        root.right = new TreeNode(8);;
        root.left = new TreeNode(9);
        boolean result = ValidateBSTRecursiveSolution.isValidBST(root);

        assertEquals(result, false);
    }

    @Test
    public void treeWithRightChildEqualsToRootShouldNotBeBST()
    {
        TreeNode root = new TreeNode(7);
        root.right = new TreeNode(7);;
        root.left = new TreeNode(6);
        boolean result = ValidateBSTRecursiveSolution.isValidBST(root);

        assertEquals(result, false);
    }

    @Test
    public void treeWithLeftChildEqualsToRootShoulBeValidBST()
    {
        TreeNode root = new TreeNode(7);
        root.right = new TreeNode(8);;
        root.left = new TreeNode(7);
        boolean result = ValidateBSTRecursiveSolution.isValidBST(root);

        assertEquals(result, true);
    }


}
