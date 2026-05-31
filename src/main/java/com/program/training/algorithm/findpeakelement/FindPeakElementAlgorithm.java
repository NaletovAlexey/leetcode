package com.program.training.algorithm.findpeakelement;

/**
 * A peak element is an element that is strictly greater than its neighbors.
 * Given a 0-indexed integer array nums, find a peak element, and return its index.
 * If the array contains multiple peaks, return the index to any of the peaks.
 *
 * You must write an algorithm that runs in O(log n) time.
 *
 * @author naletov
 */
public class FindPeakElementAlgorithm
{
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right)
        {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1])
            {
                left = mid + 1;
            }
            else
            {
                right = mid;
            }
        }
        return left;
    }
}
