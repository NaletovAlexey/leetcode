package com.program.training.algorithm.removeduplicatesfromsortedarray;

import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order,
 * remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same.
 * @author naletov
 */
public class RemoveDuplicatesFromSortedArrayAlgorithm {
    public int removeDuplicatesStream(int[] nums) {
        int[] newArray = Arrays.stream(nums).distinct().toArray();
        int l = newArray.length;
        System.arraycopy(newArray, 0, nums, 0, l);
        return l;
    }

    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1])
            {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
