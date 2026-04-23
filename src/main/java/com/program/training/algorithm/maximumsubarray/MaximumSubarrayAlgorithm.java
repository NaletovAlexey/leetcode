package com.program.training.algorithm.maximumsubarray;

/**
 * Given an integer array nums, find the subarray with the largest sum, and return its sum.
 * @author naletov
 */
public class MaximumSubarrayAlgorithm
{
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++)
        {
//            if (currentSum + nums[i] < nums[i])
//            {
//                currentSum = nums[i];
//            }
//            else
//            {
//                currentSum = currentSum + nums[i];
//            }
//            result = Math.max(result, currentSum);
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            result = Math.max(result, currentSum);
        }
        return result;
    }
}
