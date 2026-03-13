package com.program.training.algorithm.searchinrotatedsortedarray;

/**
 * There is an integer array nums sorted in ascending order (with distinct values)
 * Prior to being passed to your function, nums is possibly left rotated at an unknown index k
 *
 * Given the array nums after the possible rotation and an integer target,
 * return the index of target if it is in nums, or -1 if it is not in nums.
 * An algorithm with O(log n) runtime complexity.
 *
 * @author naletov
 */
public class SearchInRotatedSortedArrayAlgorithm
{
    public int searchNotOptimal(int[] nums, int target) {

        int lowIndex = 0;
        int highIndex = nums.length - 1;

        if (nums.length == 1)
            return nums[lowIndex] == target ? lowIndex : -1;

        if (nums.length == 2)
        {
            return nums[lowIndex] == target  ? lowIndex : (nums[highIndex] == target) ? highIndex : -1;
        }

        while (lowIndex <= highIndex)
        {

            int middleIndex = lowIndex + (highIndex - lowIndex) / 2;
            // check if this is a target
            if (nums[middleIndex] == target)
                return middleIndex;

            if ((nums[lowIndex] <= target && target <= nums[middleIndex])
                    || (nums[middleIndex] < nums[highIndex] && nums[highIndex] < target && nums[middleIndex] <= target)
                    || (nums[lowIndex] > nums[middleIndex] && nums[middleIndex] >= target))
            {
                highIndex = middleIndex - 1;
            }
            else
            {
                lowIndex = middleIndex + 1;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // determine which half is sorted
            if (nums[low] <= nums[mid]) { // The left half is sorted
                if (nums[low] <= target && target < nums[mid])
                {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else { // The right half is sorted
                if (nums[mid] < target && target <= nums[high])
                {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
