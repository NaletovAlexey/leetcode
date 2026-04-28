package com.program.training.algorithm.removeelement;

import java.util.Arrays;

/**
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 * The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 *
 * - Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
 * - Return k
 *
 * @author naletov
 */
public class RemoveElementAlgorithm {
    public int removeElementStream(int[] nums, int val) {
        int[] newArray = Arrays.stream(nums).filter(num -> num != val).toArray();
        int k = newArray.length;
        System.arraycopy(newArray, 0, nums, 0, k);
        return k;
    }

    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
                nums[j++] = nums[i];
        }
        return j;
    }
}