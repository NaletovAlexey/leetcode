package com.program.training.algorithm.balancedbinarytree;

import com.program.training.test.data.api.TreeNode;

/**
 * Given a binary tree, determine if it is height-balanced
 *
 * <a href="https://leetcode.com/problems/balanced-binary-tree/description/">...</a>
 *
 * @author naletov
 */
public class BalancedBinaryTreeAlgorithm
{
    //private static final Logger LOGGER = LoggerFactory.getLogger(BalancedBinaryTreeAlgorithm.class);

    /**
     * returns whether a binary tree is balanced (recursion)
     * @param root Binary tree root
     * @return true/false
     */
    public boolean isBalanced(TreeNode root)
    {
        return checkBalance(root) != -1;
    }

    private int checkBalance(TreeNode node)
    {
        // if tree is empty = balanced
        if (node == null)
        {
            return 0;   // empty tree height
        }
        // check left branch
        int leftHeight = checkBalance(node.left);
        if (leftHeight == -1)
        {
            return -1;
        }
        // check right branch
        int rightHeight = checkBalance(node.right);
        if (rightHeight == -1)
        {
            return -1;
        }
        // compare left and right branches
        if (Math.abs(leftHeight - rightHeight) > 1)
        {
            return -1;
        }
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
