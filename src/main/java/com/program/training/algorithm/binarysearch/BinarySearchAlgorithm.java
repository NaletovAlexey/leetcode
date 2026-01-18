package com.program.training.algorithm.binarysearch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Given an array of integers nums which is sorted in ascending order,
 * and an integer target, write a function to search target in nums.
 * If target exists, then return its index. Otherwise, return -1.
 *
 * <a href="https://leetcode.com/problems/binary-search/">...</a>
 *
 * @author naletov
 */
public class BinarySearchAlgorithm
{
    private static final Logger LOGGER = LoggerFactory.getLogger(BinarySearchAlgorithm.class);


    /**
     * Binary search Algorithm + recursion
     * @param nums numbers array
     * @param target target
     * @return number index
     */
    public int search(int[] nums, int target)
    {
        return recursiveSearch(nums, target, 0, nums.length - 1);
    }

    private int recursiveSearch(int[] nums, int target, int lowIndex, int highIndex)
    {
        LOGGER.info("Target number: {} (low: {}, high: {})", target, nums[lowIndex], nums[highIndex]);

        if (lowIndex > highIndex)
        {
            return -1;
        }

        int result = lowIndex + (highIndex - lowIndex) / 2;

        if (nums[result] == target)
        {
            return result;
        }
        else if (target > nums[result])
        {
            return recursiveSearch(nums, target, result + 1, highIndex);

        }
        else // (target < nums[result])
        {
            return recursiveSearch(nums, target, lowIndex, result - 1);
        }
    }

    /**
     * Binary search Algorithm
     * @param nums numbers array
     * @param target target
     * @return number index
     */
    public int searchCommon(int[] nums, int target)
    {
        int lowIndex = 0;
        int highIndex = nums.length - 1;

        while (lowIndex <= highIndex)
        {
            int midIndex = lowIndex + (highIndex - lowIndex) / 2;

            if (nums[midIndex] == target)
            {
                return midIndex;
            }
            else if (target > nums[midIndex])
            {
                lowIndex = midIndex + 1;
            }
            else // target < nums[midIndex]
            {
                highIndex = midIndex - 1;
            }
        }
        return -1;
    }
}
