package com.program.training.algorithm.minimumsizesubarraysum;

/**
 * Given an array of positive integers nums and a positive integer target,
 * return the minimal length of a subarray whose sum is greater than or equal to target.
 * If there is no such subarray, return 0 instead.
 *
 * @author naletov
 */
public class MinimumSizeSubarraySumAlgorithm
{
    public int minSubArrayLenOptimized(int target, int[] nums)
    {
        int left = 0;
        int currentSum = nums[0];
        int result = Integer.MAX_VALUE;

        for (int right = 1; right < nums.length; right++)   // step right bound
        {
            currentSum += nums[right];                      // add current item
            while (currentSum >= target)
            {
                result = Math.min(result, right - left + 1);
                currentSum -= nums[left];
                left++;                                     // step left bound
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public int minSubArrayLen(int target, int[] nums)
    {
        int left = 0;
        int currentSum = nums[0];
        int result = Integer.MAX_VALUE;

        for (int i = 1; i <= nums.length; i++)  // step right bound
        {
            if (currentSum >= target)
            {
                if (i - left == 1)
                    return  1;
                // step left bound
                while (currentSum >= target)
                {
                    result = Math.min(result, i - left);
                    currentSum -= nums[left];
                    left++;
                }
            }
            if (i < nums.length)                // end of Array
                currentSum += nums[i];
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
