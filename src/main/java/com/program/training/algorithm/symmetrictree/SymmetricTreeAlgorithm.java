package com.program.training.algorithm.symmetrictree;

import com.program.training.test.data.api.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 *
 * <a href="https://leetcode.com/problems/symmetric-tree/description/">...</a>
 * @author naletov
 */
public class SymmetricTreeAlgorithm
{
    //private static final Logger LOGGER = LoggerFactory.getLogger(SymmetricTreeAlgorithm.class);

    /**
     * Check if tree is symmetric (recursively - DFS)
     * @param root tree root
     * @return true if symmetric
     */
    public boolean isSymmetricRecursive(TreeNode root)
    {
        if (root.left == null && root.right == null)
        {
            return true;
        }
        else if (root.left == null || root.right == null)
        {
            return false;
        }

        return checkSymmetric(root.left, root.right);
    }

    /**
     * checks current node
     * @param left tree
     * @param right tree
     * @return check result
     */
    private boolean checkSymmetric(TreeNode left, TreeNode right)
    {
        if (left.val == right.val)
        {
            if ( ((left.right == null && right.left != null)
                    || (left.right != null && right.left == null))
                    || ((left.left != null && right.right == null)
                        || (left.left == null && right.right != null)) )
            {
                return false;
            }

            return ((left.right == null || checkSymmetric(left.right, right.left))
                    && (left.left == null || checkSymmetric(left.left, right.right)));
        }
        return false;
    }

    /**
     * Check if tree is symmetric (iteratively - Queue - BSF)
     * @param root tree root
     * @return true if symmetric
     */
    public boolean isSymmetric(TreeNode root)
    {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);

        while (!queue.isEmpty())
        {
            TreeNode leftNode = queue.poll();
            TreeNode rightNode = queue.poll();

            if (leftNode == null && rightNode == null) {
                continue;
            }

            if (leftNode == null || rightNode == null || leftNode.val != rightNode.val) {
                return false;
            }

            queue.offer(leftNode.left);
            queue.offer(rightNode.right);
            queue.offer(leftNode.right);
            queue.offer(rightNode.left);
        }
        return true;
    }
}
