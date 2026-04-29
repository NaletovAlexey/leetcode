package com.program.training.algorithm.removeduplicatesfromsortedarray;

import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order,
 * remove some duplicates in-place such that each unique element appears at most twice.
 * The relative order of the elements should be kept the same.
 *
 * Do not allocate extra space for another array.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 * @author naletov
 */
public class RemoveDuplicatesFromSortedArrayIIAlgorithm {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2)
        {
            return nums.length;
        }

        int write = 2;
        for (int read = 2; read < nums.length; read++)
        {
            if (nums[read] != nums[write - 2]) {
                nums[write++] = nums[read];
            }
        }
        return write;
    }
}