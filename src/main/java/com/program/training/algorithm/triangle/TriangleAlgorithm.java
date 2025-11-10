package com.program.training.algorithm.triangle;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * For each step, you may move to an adjacent number of the row below.
 * More formally, if you are on index i on the current row,
 * you may move to either index i or index i + 1 on the next row.
 * <a href="https://leetcode.com/problems/triangle/description/">...</a>
 *
 * @author naletov
 */
public class TriangleAlgorithm
{
    private static final Logger LOGGER = LoggerFactory.getLogger(TriangleAlgorithm.class);

    /**
     * Checks not all paths but single from the top
     * @param triangle input data
     * @return min path
     */
    public int minimumTotalV1(List<List<Integer>> triangle)
    {
        if (triangle == null || triangle.isEmpty())
        {
            return 0;
        }
        int result = 0;
        int counter = 0;
        for (List<Integer> row : triangle)
        {
            if (counter == 0)
            {
                result = row.getFirst();
                counter++;
            }
            else
            {
                int minRow = Math.min(row.get(counter -1), row.get(counter));
                result = result + minRow;
                counter = minRow == row.get(counter) ? counter + 1 : counter;
            }
            LOGGER.info("minimum total: {}; current row: {}", result,  counter);
        }
        return result;
    }

    /**
     * Checks from bottom all the paths
     * @param triangle input data
     * @return min path
     */
    public int minimumTotal(List<List<Integer>> triangle)
    {
        if (triangle == null || triangle.isEmpty())
        {
            return 0;
        }
        // in case of 1 item
        if (triangle.size() == 1) {
            return triangle.getFirst().getFirst();
        }

        for (int row = triangle.size() - 2; 0 <= row; row--)
        {
            List<Integer> previousRow = triangle.get(row);
            List<Integer> currentRow = triangle.get(row + 1);
            for (int col = 0; col < currentRow.size() - 1; col++)
            {
                previousRow.set(col, previousRow.get(col) + Math.min(currentRow.get(col), currentRow.get(col + 1)));
            }
        }
        return triangle.getFirst().getFirst();
    }
}
