package com.program.training.algorithm.uniquepaths;

/**
 * TThere is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]).
 * The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]).
 * The robot can only move either down or right at any point in time.
 *
 * Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.
 *
 * @author naletov
 */
public class UniquePathsAlgorithm
{
    /**
     * O(2^(m+n)) - slow
     * @param m m
     * @param n n
     * @return paths
     */
    public int uniquePathsRecursive(int m, int n)
    {
        return findPathRecursive(m, n);
    }

    private int findPathRecursive(int m, int n)
    {
        if (m == 1 || n == 1)
            return 1;

        return findPathRecursive(m - 1, n) + findPathRecursive(m, n - 1);
    }

    /**
     * a faster method than recursion because the steps are remembered and not calculated multiple times
     * O(m*n)
     * @param m m
     * @param n n
     * @return paths
     */
    public int uniquePaths(int m, int n) {
        int[][] cache = new int[m][n]; // cache to store if the algorithm already count this path
        return findPath(m - 1, n - 1, cache);
    }

    private int findPath(int m, int n, int[][] cache) {
        // There is only one path along the wall (move along it)
        if (m == 0 || n == 0) {
            return 1;
        }
        // If the value has already been calculated, we return it.
        if (cache[m][n] != 0) {
            return cache[m][n];
        }

        // Recursive case: store the result in memo and return it
        cache[m][n] = findPath(m - 1, n, cache) + findPath(m, n - 1, cache);
        return cache[m][n];
    }
}
