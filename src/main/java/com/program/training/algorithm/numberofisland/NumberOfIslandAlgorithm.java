package com.program.training.algorithm.numberofisland;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given an m x n 2D binary grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 *
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.
 *
 * <a href="https://leetcode.com/problems/number-of-islands/description/">...</a>
 *
 * @author naletov
 */
public class NumberOfIslandAlgorithm
{
    //private static final Logger LOGGER = LoggerFactory.getLogger(NumberOfIslandAlgorithm.class);

    /**
     * @param grid map representation
     * @return number of islands
     */
    public int numIslands(char[][] grid)
    {
        int count = 0;
        for (int row = 0; row < grid.length; row++)
        {
            for (int col = 0; col < grid[0].length; col++)
            {
                if (grid[row][col] == '1')
                {
                    count++;
                    bfs(grid, row, col);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int row, int col)
    {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == '0')
        {
            return;
        }
        grid[row][col] = '0';           // visited

        dfs(grid, row - 1, col);    // Up
        dfs(grid, row + 1, col);    // Down
        dfs(grid, row, col - 1);    // Left
        dfs(grid, row, col + 1);    // Right
    }

    private void bfs(char[][] grid, int row, int col)
    {
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{row, col});
        grid[row][col] = '0';           // visited

        while (!queue.isEmpty())
        {
            int[] cur = queue.poll();
            for (int[] direction : directions)
            {
                int newRow = cur[0] + direction[0];
                int newCol = cur[1] + direction[1];

                if (newRow >= 0 && newRow < grid.length &&
                        newCol >= 0 && newCol < grid[0].length &&
                        grid[newRow][newCol] == '1') {
                    grid[newRow][newCol] = '0';
                    queue.add(new int[]{newRow, newCol});
                }
            }
        }
    }
}
