package com.program.training.algorithm.pathsumii;

import com.program.training.test.data.api.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * Given the root of a binary tree and an integer targetSum,
 * return all root-to-leaf paths where the sum of the node values in the path equals targetSum.
 * Each path should be returned as a list of the node values, not node references.
 *
 * <a href="https://leetcode.com/problems/path-sum-ii/description/">...</a>
 * @author naletov
 */
public class PathSumIIAlgorithm
{
    private static final Logger LOGGER = LoggerFactory.getLogger(PathSumIIAlgorithm.class);

    private final List<List<Integer>> allPaths = new ArrayList<>();

    /**
     * DFS algorithm (recursive)
     * @param root tree root
     * @param targetSum target sum
     * @return list of paths
     */
    public List<List<Integer>> pathSumDFS(TreeNode root, int targetSum)
    {
        allPaths.clear();
        addIteration(targetSum, root, new LinkedList<>());

        return allPaths;
    }

    /**
     * Algorithm itself
     * @param currentSum sum - node value on the current step
     * @param node current node
     * @param path already added items
     */
    private void addIteration(int currentSum, TreeNode node, List<Integer> path)
    {
        if (node == null)
            return;

        path.add(node.val);
        final int newSum = currentSum - node.val;

        if (newSum == 0 && node.left == null && node.right == null)
        {
            LOGGER.debug("result: {}", path);
            allPaths.add(new LinkedList<>(path)); // path copy
        }
        // recursion
        addIteration(currentSum - node.val, node.left, path);
        addIteration(currentSum - node.val, node.right, path);
        // take one step back
        path.removeLast();
    }

    /**
     * BFS algorithm (Queue)
     * @param root tree root
     * @param targetSum target sum
     * @return list of paths
     */
    public List<List<Integer>> pathSum(TreeNode root, int targetSum)
    {
        allPaths.clear();

        if (root == null)
            return allPaths;

        Queue<NodeData> queue = new ArrayDeque<>();
        queue.offer(new NodeData(root, root.val, List.of(root.val)));

        while (!queue.isEmpty())
        {
            NodeData current  = queue.poll();

            // Checks the List to match sum
            if (current.sum == targetSum &&
                    current.node.left == null &&
                    current.node.right == null)
            {
                LOGGER.debug("result: {}", current.path);
                allPaths.add(current.path);
            }

            // Processing descendants
            if (current.node.left != null)
            {
                List<Integer> newPath = new ArrayList<>(current.path);
                newPath.add(current.node.left.val);
                queue.offer(new NodeData(
                        current.node.left,
                        current.sum + current.node.left.val,
                        newPath
                ));
            }

            if (current.node.right != null)
            {
                List<Integer> newPath = new ArrayList<>(current.path);
                newPath.add(current.node.right.val);
                queue.offer(new NodeData(
                        current.node.right,
                        current.sum + current.node.right.val,
                        newPath
                ));
            }

        }

        return allPaths;
    }

    // An auxiliary structure for storing node data
    private record NodeData(TreeNode node, int sum, List<Integer> path) {}
}
