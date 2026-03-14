package com.program.training.algorithm.mininrotatedsortedarray;

/**
 * There is an integer array nums sorted in ascending order (with distinct values)
 * Prior to being passed to your function, nums is possibly left rotated at an unknown index k
 *
 * Given the sorted rotated array nums of unique elements, return the minimum element of this array.
 * You must write an algorithm that runs in O(log n) time.
 *
 * @author naletov
 */
public class MinInRotatedSortedArrayAlgorithm
{
    public int findMin(int[] nums)
    {
        int low = 0;
        int high = nums.length - 1;
        int result = Integer.MAX_VALUE;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;

            // determine which half is sorted
            if (nums[low] <= nums[mid]) { // The left half is sorted
                result = Math.min(nums[low], result);
                low = mid + 1;
            }
            else { // The right half is sorted
                result = Math.min(nums[mid], result);
                high = mid - 1;
            }
        }
        return result;
    }
}
