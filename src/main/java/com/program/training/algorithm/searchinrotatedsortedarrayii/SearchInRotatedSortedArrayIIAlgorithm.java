package com.program.training.algorithm.searchinrotatedsortedarrayii;

/**
 * There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values)
 *
 * Given the array nums after the rotation and an integer target,
 * return true if target is in nums, or false if it is not in nums.
 *
 * @author naletov
 */
public class SearchInRotatedSortedArrayIIAlgorithm
{
    public boolean search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target)
            {
                return true;
            }
            // A case where it is difficult to determine which part is sorted
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
                continue;
            }

            if (nums[low] <= nums[mid])
            {   // The left half is sorted
                if (nums[low] <= target && target < nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            else
            {   // The right half is sorted
                if (nums[high] >= target && target > nums[mid])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return false;
    }
}
