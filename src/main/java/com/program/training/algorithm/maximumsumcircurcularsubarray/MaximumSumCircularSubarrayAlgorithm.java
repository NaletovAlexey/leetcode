package com.program.training.algorithm.maximumsumcircurcularsubarray;

/**
 * Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.
 * @author naletov
 */
public class MaximumSumCircularSubarrayAlgorithm {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = nums[0];
        int currentMax = nums[0];
        int globalMax = nums[0];
        int currentMin = nums[0];
        int globalMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];
            totalSum += value;
            // not a circular case
            currentMax = Math.max(value, currentMax + value);
            globalMax = Math.max(globalMax, currentMax);

            currentMin = Math.min(value, currentMin + value);
            globalMin = Math.min(globalMin, currentMin);
        }

        // If all values are negative, wrapping would incorrectly produce 0.
        if (globalMax < 0) {
            return globalMax;
        }

        int wrappedMax = totalSum - globalMin;
        return Math.max(globalMax, wrappedMax);
    }
}
