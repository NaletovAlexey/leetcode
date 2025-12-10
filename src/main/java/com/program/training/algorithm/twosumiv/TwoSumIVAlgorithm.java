package com.program.training.algorithm.twosumiv;

import com.program.training.test.data.api.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * Given the root of a binary search tree and an integer k,
 * return true if there exist two elements in the BST such that their sum is equal to k, or false otherwise.
 *
 * <a href="https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description//">...</a>
 * @author naletov
 */
public class TwoSumIVAlgorithm
{
    //private static final Logger LOGGER = LoggerFactory.getLogger(TwoSumIVAlgorithm.class);

    /**
     * BFS (queue)
     * @param root root node
     * @param k sum
     * @return true if sum is found
     */
    public boolean findTarget(TreeNode root, int k)
    {
        Set<Integer> weights = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            TreeNode node = queue.poll();
            if (weights.contains(k - node.val))
            {
                return true;
            }
            weights.add(node.val);
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
        return false;
    }

    /**
     * DFS (Stack) - Deprecated
     * @param root root node
     * @param k sum
     * @return true if sum is found
     */
    public boolean findTargetStack(TreeNode root, int k)
    {
        Stack<TreeNode> stack = new Stack<>();
        HashSet<Integer> weights = new HashSet<>();
        stack.push(root);
        while (!stack.isEmpty())
        {
            TreeNode node = stack.pop();
            if (node == null)
            {
                return false;
            }
            if (weights.contains(k - node.val))
            {
                return true;
            }
            weights.add(node.val);
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }
        return false;
    }

    /**
     * DFS + recursion
     * @param root root node
     * @param k sum
     * @return true if sum is found
     */
    public boolean findTargetDFSRecursion(TreeNode root, int k)
    {
        Set<Integer> weights = new HashSet<>();
        return dfsRecursion(root, k, weights);
    }

    /**
     *
     * @param node current node
     * @param k sum
     * @param weights set of weights
     * @return true if sum is found
     */
    private boolean dfsRecursion(TreeNode node, int k, Set<Integer> weights)
    {
        if (node == null) {
            return false;
        }

        int diff = k - node.val;
        if (weights.contains(diff))
        {
            return true;
        }
        weights.add(node.val);
        return dfsRecursion(node.left, k, weights) || dfsRecursion(node.right, k, weights);
    }


}
