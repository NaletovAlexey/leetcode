package com.program.training.algorithm.search2dmatris;

/**
 * You are given an m x n integer matrix with the following two properties:
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * The first integer of each row is greater than the last integer of the previous row.
 * Given an integer target, return true if target is in matrix or false otherwise.
 * You must write a solution in O(log(m * n)) time complexity.
 *
 * <a href="Search a 2D Matrix/">...</a>
 *
 * @author naletov
 */
public class Search2DMatrixAlgorithm
{
    // private static final Logger LOGGER = LoggerFactory.getLogger(Search2DMatrixAlgorithm.class);

    /**
     * checks if target in the matrix
     * @param matrix input matrix
     * @param target target to find
     * @return result
     */
    public boolean searchMatrix(int[][] matrix, int target) {

        int row = 0;
        while (row < matrix.length)
        {
            if (target > matrix[row][matrix[row].length - 1])
            {
                row++;
            }
            else
            {
                return findInRow(matrix[row], target) > -1;
            }
        }
        return false;
    }

    /**
     * return index of target or -1
     * @param row current row
     * @param target target
     * @return index/-1
     */
    private int findInRow(int[] row, int target)
    {
        int lowIndex = 0;
        int highIndex = row.length - 1;

        while (lowIndex <= highIndex)
        {
            int midIndex = lowIndex + (highIndex - lowIndex) / 2;
            if (row[midIndex] == target)
            {
                return midIndex;
            }
            else if (target > row[midIndex])
            {
                lowIndex = midIndex + 1;
            }
            else // target < row[midIndex]
            {
                highIndex = midIndex - 1;
            }
        }
        return  -1;
    }
}

