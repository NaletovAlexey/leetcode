package com.program.training.test.data.api;

/**
 * Binary tree node implementation
 *
 * @author naletov
 */
public class TreeNode
{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode()
    {
        // do nothing
    }

    public TreeNode(int val)
    {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right)
    {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString()
    {
        return val + ((left != null) ? ", " + left : " null, null") + ((right != null) ? ", " + right : " null, null");
    }
}
