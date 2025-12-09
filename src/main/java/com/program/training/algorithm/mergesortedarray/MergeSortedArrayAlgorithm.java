package com.program.training.algorithm.mergesortedarray;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * <p>
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * <a href="https://leetcode.com/problems/merge-sorted-array/description/">...</a>
 *
 *
 * @author naletov
 */
public class MergeSortedArrayAlgorithm
{
 private static final Logger LOGGER = LoggerFactory.getLogger(MergeSortedArrayAlgorithm.class);

    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        while (n > 0 && m > 0)
        {
            if (nums1[m -1] < nums2[n - 1])         // nums2 greater
            {
                nums1[m + n - 1] = nums2[--n];
                LOGGER.info("Added {} to position {}", nums2[n], m + n );
            }
            else                                    // nums1 greater
            {
                nums1[m + n - 1] = nums1[--m];
                LOGGER.info("Added {} to position {}", nums1[m], m + n);
            }
        }               // if n == 0, m != 0, just leaves the rest of the nums1 array unchanged
        if (n > 0)      // if m == 0, copies the entire nums2 at once
        {
            System.arraycopy(nums2, 0, nums1, 0, n);
        }
    }
}