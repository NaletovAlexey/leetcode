package com.program.training.algorithm.twosum;

/**
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
 * find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1]
 * and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 *
 * Return the indices of the two numbers index1 and index2, each incremented by one, as an integer array [index1, index2] of length 2.
 *
 * The tests are generated such that there is exactly one solution. You may not use the same element twice.
 * Your solution must use only constant extra space.
 *
 * @author naletov
 */
public class TwoSummIIAlgorithm
{
    public int[] twoSum(int[] numbers, int target)
    {
        int directOrder = 0;
        int reverseOrder = numbers.length - 1;
        while (directOrder < reverseOrder)
        {
            if (numbers[directOrder] + numbers[reverseOrder] < target)
            {
                directOrder++;
            }
            else if (numbers[directOrder] + numbers[reverseOrder] > target)
            {
                reverseOrder--;
            }
            else
            {
                return new int[]{directOrder + 1, reverseOrder + 1};
            }
        }
        return new int[]{};  // unreachable code (There is exactly one solution)
    }
}
